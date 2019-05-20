package com.sgic.hrm.commons.repository.par;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.par.Par;
import com.sgic.hrm.commons.entity.par.ReportParAppraise;
import com.sgic.hrm.commons.entity.par.ReportParAppraisor;

public interface ReportParAppraisorRepository extends JpaRepository<ReportParAppraisor, Integer> {
	ReportParAppraisor findReportParAppraiseById(Integer id);
	
	public List<ReportParAppraisor> findReportParAppraisorByPar(Par par);
}