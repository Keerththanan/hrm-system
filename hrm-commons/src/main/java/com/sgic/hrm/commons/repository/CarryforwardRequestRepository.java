package com.sgic.hrm.commons.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sgic.hrm.commons.entity.CarryforwardRequest;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.enums.Status;

public interface CarryforwardRequestRepository extends JpaRepository<CarryforwardRequest, Integer> {
	
	Optional<CarryforwardRequest> findByUser(User user);
	List<CarryforwardRequest> findByStatusOrderById(Status status);
	
	//@Query("SELECT cfr FROM CarryforwardRequest cfr WHERE cfr.userId <> ?1")
	public List<CarryforwardRequest> findByUserNot(User user);
	

}
