package com.sgic.hrm.commons.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "interview_panel", schema = "employee")
public class InterviewPanel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1995265402050053499L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "interview_selection_id")
	private InterviewSelection interviewSelectionId;

	private String interviewPanelNo;
	private String startTime;
	private String endTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public InterviewSelection getInterviewSelectionId() {
		return interviewSelectionId;
	}

	public void setInterviewSelectionId(InterviewSelection interviewSelectionId) {
		this.interviewSelectionId = interviewSelectionId;
	}

	public String getInterviewPanelNo() {
		return interviewPanelNo;
	}

	public void setInterviewPanelNo(String interviewPanelNo) {
		this.interviewPanelNo = interviewPanelNo;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

}
