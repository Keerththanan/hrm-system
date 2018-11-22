package com.sgic.hrm.lms.service;

import java.util.List;
import com.sgic.hrm.commons.entity.CancelLeaveRequest;
import com.sgic.hrm.commons.enums.Status;

public interface CancelLeaveRequestService {

  boolean addCancelLeaveRequest(CancelLeaveRequest cancelLeaveRequest);
  
  boolean deleteCancelLeaveRequest(Integer id);
  
  boolean updateCancelLeaveRequestStatus(Integer id, Status status);
  
  List<CancelLeaveRequest> getAllCancelRequest();
  
  List<CancelLeaveRequest> getPendingCancelRequest();
  
  List<CancelLeaveRequest> getCancelRequestByUser(Integer userId);
}
