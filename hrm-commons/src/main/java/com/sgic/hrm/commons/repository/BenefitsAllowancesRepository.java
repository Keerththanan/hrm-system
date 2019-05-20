package com.sgic.hrm.commons.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sgic.hrm.commons.entity.BenefitsAllowancesEntity;
import com.sgic.hrm.commons.entity.IndividualWelfare;

public interface BenefitsAllowancesRepository extends JpaRepository<IndividualWelfare, Integer>{

	@Query("SELECT ba FROM IndividualWelfare ba WHERE ba.welfareEvent.id = ?1 ")
	List<BenefitsAllowancesEntity> findByWelfareEventId(Integer id);
}
