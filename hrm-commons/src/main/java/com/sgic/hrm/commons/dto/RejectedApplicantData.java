package com.sgic.hrm.commons.dto;



public class RejectedApplicantData {
	
	private Integer id;
	private ApplicantData applicantid;
	private String reason;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public ApplicantData getApplicantid() {
		return applicantid;
	}
	public void setApplicantid(ApplicantData applicantid) {
		this.applicantid = applicantid;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	

}
