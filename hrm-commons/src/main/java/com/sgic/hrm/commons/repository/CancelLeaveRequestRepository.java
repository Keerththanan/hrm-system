package com.sgic.hrm.commons.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.sgic.hrm.commons.entity.CancelLeaveRequest;
import com.sgic.hrm.commons.enums.Status;

public interface CancelLeaveRequestRepository extends JpaRepository<CancelLeaveRequest, Integer>{
  
  List<CancelLeaveRequest> findByStatus(Status status);
  
  @Query("SELECT clr FROM CancelLeaveRequest clr WHERE clr.LeaveRequest.User.id = 1")
  List<CancelLeaveRequest> findByUser(Integer id);

}
