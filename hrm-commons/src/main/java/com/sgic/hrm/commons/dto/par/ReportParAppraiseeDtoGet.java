package com.sgic.hrm.commons.dto.par;

import java.util.List;

public class ReportParAppraiseeDtoGet{

	private String reportId;
	private Integer parId;
	private List<ScoreParAppraiseeDtoGet> scoreParAppraiseeList;
	
	
	public String getReportId() {
		return reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	public Integer getParId() {
		return parId;
	}
	public void setParId(Integer parId) {
		this.parId = parId;
	}

	public List<ScoreParAppraiseeDtoGet> getScoreParAppraiseeList() {
		return scoreParAppraiseeList;
	}
	public void setScoreParAppraiseeList(List<ScoreParAppraiseeDtoGet> scoreParAppraiseeList) {
		this.scoreParAppraiseeList = scoreParAppraiseeList;
	}
	public ReportParAppraiseeDtoGet (String reportId,Integer parId) {
		this.reportId=reportId;
		this.parId=parId;	
	}
	public ReportParAppraiseeDtoGet() {
		
	}
}
