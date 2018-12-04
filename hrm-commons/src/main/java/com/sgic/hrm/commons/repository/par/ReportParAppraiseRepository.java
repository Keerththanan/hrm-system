package com.sgic.hrm.commons.repository.par;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.hrm.commons.entity.par.ReportParAppraise;

@Repository
public interface ReportParAppraiseRepository extends JpaRepository<ReportParAppraise, Integer> {
	ReportParAppraise findReportParAppraiseById(Integer id);

}