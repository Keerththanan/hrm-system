package com.sgic.hrm.commons.dto;

public class AcceptLeaveRequestData {

	private Integer id;
	private LeaveRequestData request;
	private UserData acceptedBy;

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

	public UserData getAcceptedBy() {
		return acceptedBy;
	}

	public void setAcceptedBy(UserData acceptedBy) {
		this.acceptedBy = acceptedBy;
	}

}
