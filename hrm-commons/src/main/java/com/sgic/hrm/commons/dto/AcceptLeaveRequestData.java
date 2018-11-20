package com.sgic.hrm.commons.dto;

public class AcceptLeaveRequestData {

	private Integer id;
	private LeaveRequestData LeaveRequest;
	private UserData acceptedBy;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LeaveRequestData getLeaveRequest() {
		return LeaveRequest;
	}

	public void setLeaveRequest(LeaveRequestData leaveRequest) {
		LeaveRequest = leaveRequest;
	}

	public UserData getAcceptedBy() {
		return acceptedBy;
	}

	public void setAcceptedBy(UserData acceptedBy) {
		this.acceptedBy = acceptedBy;
	}

}
