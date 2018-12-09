package com.sgic.hrm.commons.dto.par;

import java.util.Date;
import java.util.List;

public class ReportParAppraisorDtoGet {


	private ParAppraisorDto appraisedBy;

	private List<ScoreParAppraiserDtoGet> scoreParAppraiserList;

	public ReportParAppraisorDtoGet() {

	}

	public ParAppraisorDto getAppraisedBy() {
		return appraisedBy;
	}

	public void setAppraisedBy(ParAppraisorDto appraisedBy) {
		this.appraisedBy = appraisedBy;
	}



	public List<ScoreParAppraiserDtoGet> getScoreParAppraiserList() {
		return scoreParAppraiserList;
	}

	public void setScoreParAppraiserList(List<ScoreParAppraiserDtoGet> scoreParAppraiserList) {
		this.scoreParAppraiserList = scoreParAppraiserList;
	}

}
