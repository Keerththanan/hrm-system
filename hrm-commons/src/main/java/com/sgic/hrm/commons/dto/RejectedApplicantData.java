package com.sgic.hrm.commons.dto;



public class RejectedApplicantData {
	
	private Integer id;
	private ApplicantData applicantDataid;
	private String reason;
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
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	

}
