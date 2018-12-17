package com.sgic.hrm.par.serviceCombined;

import java.util.List;

import com.sgic.hrm.commons.dto.par.ReportParAppraiseeDtoGet;
import com.sgic.hrm.commons.dto.par.ReportParAppraiseeDtoPost;
import com.sgic.hrm.commons.dto.par.ScoreParAppraiseeDtoPost;
import com.sgic.hrm.commons.entity.par.ReportParAppraise;

public interface ParReportForAppraiseeService {


	/*
	 * save report entity -save list of par score -save report record find the par
	 * object by par id save the ReportParAppraise including par object write
	 * iteratoror to save the List of ScoreParAppraisee
	 */
	
	public String saveReportAndScore(ReportParAppraiseeDtoPost reportParAppraiseeDtoPost,Integer parId);

	// update one par score
	public boolean updateParScore();

	public ReportParAppraiseeDtoGet getReportAndScore(Integer parId);
}