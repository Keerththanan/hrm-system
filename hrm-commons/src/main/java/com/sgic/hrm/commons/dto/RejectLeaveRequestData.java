package com.sgic.hrm.commons.dto;

public class RejectLeaveRequestData {

	private Integer id;
	LeaveRequestData request;
	UserData rejectedBy;
	private String reason;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LeaveRequestData getRequest() {
		return request;
	}

	public void setRequest(LeaveRequestData request) {
		this.request = request;
	}

	public UserData getRejectedBy() {
		return rejectedBy;
	}

	public void setRejectedBy(UserData rejectedBy) {
		this.rejectedBy = rejectedBy;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
