package com.sgic.hrm.employee.par.service;

import java.util.List;

import com.sgic.hrm.commons.dto.par.ReportParAppraiseeDtoPost;
import com.sgic.hrm.commons.dto.par.ScoreParAppraiseeDtoPost;
import com.sgic.hrm.commons.entity.par.ReportParAppraise;

public interface ParReportForAppraiseeService {

	/*
	 * save report entity -save list of par score -save report record find the par
	 * object by par id save the ReportParAppraise including par object write
	 * iteratoror to save the List of ScoreParAppraisee
	 */
	//public void saveReportAndScore(Integer parId, ReportParAppraise reportParAppraise,
			//List<ScoreParAppraiseeDtoPost> scoreParAppraiseeList);

	// update one par score
	public boolean updateParScore();

	public void saveReportAndScore(Integer parId,List<ScoreParAppraiseeDtoPost> scheduleParAppraisorList,ReportParAppraise reportParAppraise);

	public String saveReportAndScore(ReportParAppraiseeDtoPost reportParAppraiseeDtoPost);
}
