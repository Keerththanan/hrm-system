package com.sgic.hrm.commons.dto.par;

public class ScoreParAppraiserDtoGet {

	private Integer parContentId;
	private String parContentName;
	private Double score;

	public ScoreParAppraiserDtoGet(Integer parContentId, String parContentName, Double score) {
		this.parContentId = parContentId;
		this.parContentName = parContentName;
		this.score = score;
	}

	public ScoreParAppraiserDtoGet() {

	}

	public Integer getParContentId() {
		return parContentId;
	}

	public void setParContentId(Integer parContentId) {
		this.parContentId = parContentId;
	}

	public String getParContentName() {
		return parContentName;
	}

	public void setParContentName(String parContentName) {
		this.parContentName = parContentName;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

}
