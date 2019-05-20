package com.sgic.hrm.commons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sgic.hrm.commons.entity.IndividualWelfare;

public interface IndividualWelfareRepository extends JpaRepository<IndividualWelfare, Integer> {

	@Query("SELECT ba FROM IndividualWelfare ba WHERE ba.welfareEvent.id = ?1 ")
	IndividualWelfare findByWelfareEventId(Integer id);
}
