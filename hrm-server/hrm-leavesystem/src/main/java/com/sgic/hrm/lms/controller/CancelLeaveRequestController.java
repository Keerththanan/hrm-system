/**
 * 
 */
package com.sgic.hrm.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sgic.hrm.commons.dto.CancelLeaveRequestData;
import com.sgic.hrm.commons.dto.mapper.CancelLeaveRequestDataToCancelLeaveRequest;
import com.sgic.hrm.commons.enums.Status;
import com.sgic.hrm.lms.service.CancelLeaveRequestService;

/**
 * @author Anushanth
 *
 */
@RestController
@RequestMapping("/cancel")
public class CancelLeaveRequestController {

  @Autowired
  CancelLeaveRequestService cancelLeaveRequestService;

  @PostMapping
  public HttpStatus addLeaveRequest(@RequestBody CancelLeaveRequestData cancelLeaveRequestData) {

    if (cancelLeaveRequestService.addCancelLeaveRequest(CancelLeaveRequestDataToCancelLeaveRequest
        .mapToCancelLeaveRequest(cancelLeaveRequestData))) {
      return HttpStatus.OK;
    }
    return HttpStatus.BAD_REQUEST;
  }
  
  @PutMapping("/{id}/accept")
  public HttpStatus acceptCancelLeaveRequest(@PathVariable(name = "id") Integer id) {

    if (cancelLeaveRequestService.updateCancelLeaveRequestStatus(id, Status.ACCEPTED)) {
      return HttpStatus.OK;
    }
    return HttpStatus.BAD_REQUEST;
  }
  
  @PutMapping("/{id}/reject")
  public HttpStatus rejectCancelLeaveRequest(@PathVariable(name = "id") Integer id) {

    if (cancelLeaveRequestService.updateCancelLeaveRequestStatus(id, Status.REJECTED)) {
      return HttpStatus.OK;
    }
    return HttpStatus.BAD_REQUEST;
  }
}
