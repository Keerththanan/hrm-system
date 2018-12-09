package com.sgic.hrm.commons.dto.par;


import java.util.List;

public class ReportParAppraisorDtoPost {
	

	private Integer appraisedById;

	private List<ScoreParAppraiserDtoPost> scoreParAppraiserList;

	public ReportParAppraisorDtoPost(Integer appraisedById) {
	

		this.appraisedById = appraisedById;

	}

	public ReportParAppraisorDtoPost() {

	}


	public Integer getAppraisedById() {
		return appraisedById;
	}

	public void setAppraisedById(Integer appraisedById) {
		this.appraisedById = appraisedById;
	}

	public List<ScoreParAppraiserDtoPost> getScoreParAppraiserList() {
		return scoreParAppraiserList;
	}

	public void setScoreParAppraiserList(List<ScoreParAppraiserDtoPost> scoreParAppraiserList) {
		this.scoreParAppraiserList = scoreParAppraiserList;
	}

}
