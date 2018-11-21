/**
 * 
 */
package com.sgic.hrm.lms.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgic.hrm.commons.entity.LeaveRequest;
import com.sgic.hrm.commons.entity.Status;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.repository.LeaveRequestRepository;
import com.sgic.hrm.lms.service.LeaveRequestService;

/**
 * @author Anushanth
 *
 */
@Service
public class LeaveRequestServiceImpl implements LeaveRequestService {

  @Autowired
  LeaveRequestRepository leaveRequestRepository;

  @Override
  public boolean addLeaveRequest(LeaveRequest leaveRequest) {

    if (leaveRequest != null) {
      leaveRequestRepository.save(leaveRequest);
      return true;
    }
    return false;
  }

  @Override
  public boolean updateLeaveStatus(Integer id, Status status) {

    LeaveRequest request = leaveRequestRepository.getOne(id);

    if (request != null) {
      request.setStatus(status);
      leaveRequestRepository.save(request);
      return true;
    }
    return false;
  }

  @Override
  public boolean deleteLeaveRequest(Integer id) {

    if (leaveRequestRepository.getOne(id) != null) {
      leaveRequestRepository.deleteById(id);
      return true;
    }
    return false;
  }

  @Override
  public List<LeaveRequest> getLeaveRequestByUser(User user) {

    return leaveRequestRepository.findByUser(user);
  }
  
  @Override
  public List<LeaveRequest> getAllLeaveRequest() {
    return leaveRequestRepository.findAll();
  }


}
