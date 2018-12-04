package com.sgic.hrm.commons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sgic.hrm.commons.entity.DiscussionSchedule;
import com.sgic.hrm.commons.entity.TerminationRequest;

public interface DiscussionScheduleRepository extends JpaRepository<DiscussionSchedule, Integer>{
	
	DiscussionSchedule findByTerminationRequest(TerminationRequest terminationRequest);
	
	@Query("SELECT ds FROM DiscussionSchedule ds WHERE ds.terminationRequest.employee.id = ?1")
	DiscussionSchedule findByUser(Integer id);
}
