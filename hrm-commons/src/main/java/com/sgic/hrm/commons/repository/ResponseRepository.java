package com.sgic.hrm.commons.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.Response;
import com.sgic.hrm.commons.entity.User;

public interface ResponseRepository extends JpaRepository<Response, Integer> {
	List<Response> findByRelevantIndividual(User user);

}
