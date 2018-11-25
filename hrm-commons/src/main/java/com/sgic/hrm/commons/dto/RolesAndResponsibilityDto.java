package com.sgic.hrm.commons.dto;

public class RolesAndResponsibilityDto {
	private Integer id;
	private Integer userId;
	private Integer jobId;
	private Integer locatioId;
	private Integer keyActivityId;
	private String responsibility;
	private String overAllPurpose;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getJobId() {
		return jobId;
	}
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}
	public Integer getLocatioId() {
		return locatioId;
	}
	public void setLocatioId(Integer locatioId) {
		this.locatioId = locatioId;
	}
	public Integer getKeyActivityId() {
		return keyActivityId;
	}
	public void setKeyActivityId(Integer keyActivityId) {
		this.keyActivityId = keyActivityId;
	}
	public String getResponsibility() {
		return responsibility;
	}
	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}
	public String getOverAllPurpose() {
		return overAllPurpose;
	}
	public void setOverAllPurpose(String overAllPurpose) {
		this.overAllPurpose = overAllPurpose;
	}
	
}
