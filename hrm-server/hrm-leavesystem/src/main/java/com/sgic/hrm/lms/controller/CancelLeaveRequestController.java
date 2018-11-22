/**
 * 
 */
package com.sgic.hrm.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
  
//  @PostMapping
//  public ResponseEntity<String> addLeaveRequest(@RequestBody LeaveRequestData leaveRequestData) {
//
//    if (cancelLeaveRequestService
//        .(LeaveRequestDataToLeaveRequest.mapToLeaveRequest(leaveRequestData))) {
//      return new ResponseEntity<>("request added successfully", HttpStatus.OK);
//    }
//    return new ResponseEntity<>("faild adding request", HttpStatus.BAD_REQUEST);
//  }
}
