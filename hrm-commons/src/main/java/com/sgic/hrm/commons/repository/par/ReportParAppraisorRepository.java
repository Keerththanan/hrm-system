package com.sgic.hrm.commons.repository.par;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.par.Par;
import com.sgic.hrm.commons.entity.par.ReportParAppraisor;

public interface ReportParAppraisorRepository extends JpaRepository<ReportParAppraisor, String> {
	ReportParAppraisor findReportParAppraiseById(String id);
	
	public List<ReportParAppraisor> findReportParAppraisorByPar(Par par);
}