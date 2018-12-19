package com.sgic.hrm.commons.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.CarryforwardRequest;
import com.sgic.hrm.commons.entity.User;

public interface CarryforwardRequestRepository extends JpaRepository<CarryforwardRequest, Integer> {
	
	Optional<CarryforwardRequest> findByUser(User user);

}
