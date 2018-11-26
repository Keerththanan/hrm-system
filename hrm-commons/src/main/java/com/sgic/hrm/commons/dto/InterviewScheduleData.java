package com.sgic.hrm.commons.dto;

import java.sql.Date;



public class InterviewScheduleData {
	
	private Integer id;
	private ApplicantData applicantDataid;
	private String interviewVenue;
	private String interviewTime;
	private Date interviewDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public ApplicantData getApplicantDataid() {
		return applicantDataid;
	}
	public void setApplicantDataid(ApplicantData applicantDataid) {
		this.applicantDataid = applicantDataid;
	}
	public String getInterviewVenue() {
		return interviewVenue;
	}
	public void setInterviewVenue(String interviewVenue) {
		this.interviewVenue = interviewVenue;
	}
	public String getInterviewTime() {
		return interviewTime;
	}
	public void setInterviewTime(String interviewTime) {
		this.interviewTime = interviewTime;
	}
	public Date getInterviewDate() {
		return interviewDate;
	}
	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}

	
}
