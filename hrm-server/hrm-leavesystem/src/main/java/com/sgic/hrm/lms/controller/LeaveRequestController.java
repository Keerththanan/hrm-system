package com.sgic.hrm.lms.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sgic.hrm.commons.dto.LeaveRequestData;
import com.sgic.hrm.commons.entity.mapper.LeaveRequestToLeaveRequestData;
import com.sgic.hrm.lms.service.LeaveRequestService;

@RestController
public class LeaveRequestController {

  @Autowired
  LeaveRequestService leaveRequestService;

  @GetMapping("/leaverequest")
  public List<LeaveRequestData> getAllLeaveRequest() {
    return LeaveRequestToLeaveRequestData
        .mapLeaveRequestDataList(leaveRequestService.getAllLeaveRequest());
  }
  
//  @PostMapping("/leaverequest")
//  public ResponseEntity<String> addLeaveRequest(LeaveRequestData leaveRequestData) {
//    
//  }
}
