package com.sgic.hrm.lms.service;

import java.util.List;
import com.sgic.hrm.commons.entity.LeaveRequest;
import com.sgic.hrm.commons.entity.Status;
import com.sgic.hrm.commons.entity.User;


public interface LeaveRequestService {

  boolean addLeaveRequest(LeaveRequest leaveRequest);

  boolean updateLeaveStatus(Integer id, Status status);

  boolean deleteLeaveRequest(Integer id);

  List<LeaveRequest> getLeaveRequestByUser(User user);
  
  List<LeaveRequest> getAllLeaveRequest();
  
}
