package com.sgic.hrm.commons.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.sgic.hrm.commons.entity.LeaveRequest;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.enums.Status;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Integer>{
  
  List<LeaveRequest> findByUserOrderByIdDesc(User user);
  
  List<LeaveRequest> findByStatusOrderByIdDesc(Status status);
  
  List<LeaveRequest> findAllByOrderByIdDesc();

}
