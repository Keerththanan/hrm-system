package com.sgic.hrm.lms.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgic.hrm.commons.entity.CancelLeaveRequest;
import com.sgic.hrm.commons.enums.Status;
import com.sgic.hrm.commons.repository.CancelLeaveRequestRepository;
import com.sgic.hrm.lms.service.CancelLeaveRequestService;

@Service
public class CancelLeaveRequestServiceImpl implements CancelLeaveRequestService {

  @Autowired
  CancelLeaveRequestRepository cancelLeaveRequestRepository;

  @Override
  public boolean addCancelLeaveRequest(CancelLeaveRequest cancelLeaveRequest) {
    cancelLeaveRequestRepository.save(cancelLeaveRequest);
    return true;
  }

  @Override
  public boolean deleteCancelLeaveRequest(Integer id) {
    cancelLeaveRequestRepository.deleteById(id);
    return true;
  }

  @Override
  public boolean updateCancelLeaveRequestStatus(Integer id, Status status) {

    CancelLeaveRequest cancelLeaveRequest = cancelLeaveRequestRepository.getOne(id);
    if (cancelLeaveRequest != null) {
      cancelLeaveRequest.setStatus(status);
      cancelLeaveRequestRepository.save(cancelLeaveRequest);
      return true;
    }
    return false;
  }

  @Override
  public List<CancelLeaveRequest> getAllCancelRequest() {
    return cancelLeaveRequestRepository.findAll();
  }

  @Override
  public List<CancelLeaveRequest> getPendingCancelRequest() {
    return cancelLeaveRequestRepository.findByStatus(Status.PENDING);
  }

  @Override
  public List<CancelLeaveRequest> getCancelRequestByUser(Integer userId) {
    //return cancelLeaveRequestRepository.findByUser(userId);
	  return null;
  }

}
