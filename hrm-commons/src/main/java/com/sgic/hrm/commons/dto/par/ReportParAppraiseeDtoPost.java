package com.sgic.hrm.commons.dto.par;

import java.util.List;

import com.sgic.hrm.commons.entity.par.ScoreParAppraisee;

public class ReportParAppraiseeDtoPost {
	
	
	private List<ScoreParAppraiseeDtoPost> scoreParAppraiseeList;

	
	public List<ScoreParAppraiseeDtoPost> getScoreParAppraiseeList() {
		return scoreParAppraiseeList;
	}
	public void setScoreParAppraiseeList(List<ScoreParAppraiseeDtoPost> scoreParAppraiseeList) {
		this.scoreParAppraiseeList = scoreParAppraiseeList;
	}
	

	
	public ReportParAppraiseeDtoPost() {
		
	}
}