package com.sgic.hrm.employee.par.service;

import java.util.List;

import com.sgic.hrm.commons.entity.par.Par;
import com.sgic.hrm.commons.entity.par.ReportParAppraise;
import com.sgic.hrm.commons.entity.par.ReportParAppraisor;

public interface ReportParAppraisorService {
	public void createReportParAppraise(ReportParAppraisor reportParAppraisor,Par par);

	public ReportParAppraisor findReportParAppraisorById(Integer reportId);

	public List<ReportParAppraisor> findReportParAppraiserByPar(Par par);
	
}