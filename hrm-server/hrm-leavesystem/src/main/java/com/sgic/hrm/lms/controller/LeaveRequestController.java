package com.sgic.hrm.lms.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sgic.hrm.commons.dto.AcceptLeaveRequestData;
import com.sgic.hrm.commons.dto.LeaveRequestData;
import com.sgic.hrm.commons.dto.RejectLeaveRequestData;
import com.sgic.hrm.commons.dto.mapper.AcceptLeaveRequestDataToAcceptLeaveRequest;
import com.sgic.hrm.commons.dto.mapper.LeaveRequestDataToLeaveRequest;
import com.sgic.hrm.commons.dto.mapper.RejectLeaveRequestDataToRejectLeaveRequest;
import com.sgic.hrm.commons.entity.mapper.LeaveRequestToLeaveRequestData;
import com.sgic.hrm.commons.enums.Status;
import com.sgic.hrm.lms.service.AcceptLeaveRequestService;
import com.sgic.hrm.lms.service.LeaveRequestService;
import com.sgic.hrm.lms.service.RejectLeaveRequestService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/leaverequest")
public class LeaveRequestController {

  @Autowired
  LeaveRequestService leaveRequestService;
  @Autowired
  AcceptLeaveRequestService acceptLeaveRequestSrevice;
  @Autowired
  RejectLeaveRequestService rejectLeaveRequestSrevice;


  @GetMapping
  public ResponseEntity<List<LeaveRequestData>> getAllLeaveRequest() {
    return new ResponseEntity<>(LeaveRequestToLeaveRequestData
        .mapLeaveRequestDataList(leaveRequestService.getAllLeaveRequest()), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<String> addLeaveRequest(@RequestBody LeaveRequestData leaveRequestData) {

    if (leaveRequestService
        .addLeaveRequest(LeaveRequestDataToLeaveRequest.mapToLeaveRequest(leaveRequestData))) {
      return new ResponseEntity<>("request added successfully", HttpStatus.OK);
    }
    return new ResponseEntity<>("faild adding request", HttpStatus.BAD_REQUEST);
  }

  @GetMapping("/user/{id}")
  public ResponseEntity<List<LeaveRequestData>> getAllLeaveRequestByUser(
      @PathVariable("id") Integer id) {
    return new ResponseEntity<>(LeaveRequestToLeaveRequestData
        .mapLeaveRequestDataList(leaveRequestService.getLeaveRequestByUser(id)), HttpStatus.OK);
  }

  @GetMapping("/pending")
  public ResponseEntity<List<LeaveRequestData>> getPendingLeaveRequest() {
    return new ResponseEntity<>(LeaveRequestToLeaveRequestData.mapLeaveRequestDataList(
        leaveRequestService.getAllLeaveRequestByStatus(Status.PENDING)), HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteLeaveRequest(@PathVariable("id") Integer id) {
    if (leaveRequestService.deleteLeaveRequest(id)) {
      return new ResponseEntity<>("request deleted successfully", HttpStatus.OK);
    }
    return new ResponseEntity<>("faild to delete request", HttpStatus.BAD_REQUEST);
  }

  @PutMapping("/{id}/accept")
  public ResponseEntity<String> acceptLeaveRequest(@PathVariable("id") Integer id,
      AcceptLeaveRequestData acceptLeaveRequestData) {

    if (leaveRequestService.updateLeaveStatus(id, Status.ACCEPTED) && acceptLeaveRequestSrevice
        .addAcceptLeaveRequest(AcceptLeaveRequestDataToAcceptLeaveRequest
            .mapToAcceptLeaveRequest(acceptLeaveRequestData))) {
      return new ResponseEntity<>("status updated successfully", HttpStatus.OK);
    }
    return new ResponseEntity<>("status update faild", HttpStatus.BAD_REQUEST);
  }

  @PutMapping("/{id}/reject")
  public ResponseEntity<String> rejectLeaveRequest(@PathVariable("id") Integer id,
      RejectLeaveRequestData rejectLeaveRequestData) {

    if (leaveRequestService.updateLeaveStatus(id, Status.REJECTED) && rejectLeaveRequestSrevice
        .addRejectLeaveRequest(RejectLeaveRequestDataToRejectLeaveRequest
            .mapToRejectLeaveRequest(rejectLeaveRequestData))) {
      return new ResponseEntity<>("status updated successfully", HttpStatus.OK);
    }
    return new ResponseEntity<>("status update faild", HttpStatus.BAD_REQUEST);
  }
}
