package com.sgic.hrm.commons.entity.par;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "scoreParAppraisee", schema = "employee")
public class ScoreParAppraisee {

	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;
	private String parContentId;
	private Double score;

	@ManyToOne
	@JoinColumn(name = "report_par_appraise_id")
	private ReportParAppraise reportParAppraise;

	public ScoreParAppraisee(String parContentId, Double score) {
		this.parContentId = parContentId;
		this.score = score;
	}

	public ScoreParAppraisee() {

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
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public ReportParAppraise getReportParAppraise() {
		return reportParAppraise;
	}

	public void setReportParAppraise(ReportParAppraise reportParAppraise) {
		this.reportParAppraise = reportParAppraise;
	}

}
