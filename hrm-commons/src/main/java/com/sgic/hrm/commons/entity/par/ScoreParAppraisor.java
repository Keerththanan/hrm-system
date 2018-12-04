package com.sgic.hrm.commons.entity.par;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ScoreParAppraisor", schema = "employee")
public class ScoreParAppraisor {
	
	@Id
	private String id;
	private String parContentId;
	private Double Score;
	
	@ManyToOne
	@JoinColumn(name="report_par_appraisor_id")
	private ReportParAppraisor reportParAppraisor;

	
	
	
	public ScoreParAppraisor(String id, String parContentId, Double score) {
		this.id = id;
		this.parContentId = parContentId;
		Score = score;	
	}
	public ScoreParAppraisor() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParContentId() {
		return parContentId;
	}

	public void setParContentId(String parContentId) {
		this.parContentId = parContentId;
	}

	public Double getScore() {
		return Score;
	}

	public void setScore(Double score) {
		Score = score;
	}

	public ReportParAppraisor getReportParAppraisor() {
		return reportParAppraisor;
	}

	public void setReportParAppraisor(ReportParAppraisor reportParAppraisor) {
		this.reportParAppraisor = reportParAppraisor;
	}

	

	
}
