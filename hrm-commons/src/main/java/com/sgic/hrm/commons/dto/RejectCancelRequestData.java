package com.sgic.hrm.commons.dto;

public class RejectCancelRequestData {

	private Integer id;
	private CancelLeaveRequestData cancelLeaveRequest;
	private UserData user;
	private String reason;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CancelLeaveRequestData getCancelLeaveRequest() {
		return cancelLeaveRequest;
	}

	public void setCancelLeaveRequest(CancelLeaveRequestData cancelLeaveRequest) {
		this.cancelLeaveRequest = cancelLeaveRequest;
	}

	public UserData getUser() {
		return user;
	}

	public void setUser(UserData user) {
		this.user = user;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
