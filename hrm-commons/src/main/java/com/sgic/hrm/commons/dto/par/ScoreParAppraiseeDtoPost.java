package com.sgic.hrm.commons.dto.par;

public class ScoreParAppraiseeDtoPost {

	private Integer parContentId;
	private Double score;
	private String comment;
	private String parContentName;

	public Integer getParContentId() {
		return parContentId;
	}

	public void setParContentId(Integer parContentId) {
		this.parContentId = parContentId;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getParContentName() {
		return parContentName;
	}

	public void setParContentName(String parContentName) {
		this.parContentName = parContentName;
	}

	public ScoreParAppraiseeDtoPost(Integer parContentId, Double score) {
		this.parContentId = parContentId;
		this.score = score;
	}

	public ScoreParAppraiseeDtoPost() {
	}
}
