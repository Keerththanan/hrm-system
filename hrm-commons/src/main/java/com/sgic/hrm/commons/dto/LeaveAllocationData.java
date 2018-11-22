package com.sgic.hrm.commons.dto;

public class LeaveAllocationData {

	private Integer id;
	private UserData user;
	private LeaveTypeData leaveType;
	private Float allocatedDays;
	private Float utilizedDays;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UserData getUser() {
		return user;
	}

	public void setUser(UserData user) {
		this.user = user;
	}

	public LeaveTypeData getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(LeaveTypeData leaveType) {
		this.leaveType = leaveType;
	}

	public Float getAllocatedDays() {
		return allocatedDays;
	}

	public void setAllocatedDays(Float allocatedDays) {
		this.allocatedDays = allocatedDays;
	}

	public Float getUtilizedDays() {
		return utilizedDays;
	}

	public void setUtilizedDays(Float utilizedDays) {
		this.utilizedDays = utilizedDays;
	}

}
