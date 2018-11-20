package com.sgic.hrm.commons.dto;

public class CancelLeaveRequestData {

	private Integer id;
	private LeaveRequestData leaveRequest;
	private String reason;
	private StatusData status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LeaveRequestData getLeaveRequest() {
		return leaveRequest;
	}

	public void setLeaveRequest(LeaveRequestData leaveRequest) {
		this.leaveRequest = leaveRequest;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public StatusData getStatus() {
		return status;
	}

	public void setStatus(StatusData status) {
		this.status = status;
	}

}
