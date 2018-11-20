package com.sgic.hrm.commons.dto;

import java.io.File;
import java.sql.Date;

public class TerminationRequestData {
	Integer id;
	Date planedLeavingDate;
	String reason;
	File resignationLetter;
	TerminationTypeData terminationType;
	UserData employee;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getPlanedLeavingDate() {
		return planedLeavingDate;
	}

	public void setPlanedLeavingDate(Date planedLeavingDate) {
		this.planedLeavingDate = planedLeavingDate;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public File getResignationLetter() {
		return resignationLetter;
	}

	public void setResignationLetter(File resignationLetter) {
		this.resignationLetter = resignationLetter;
	}

	public TerminationTypeData getTerminationType() {
		return terminationType;
	}

	public void setTerminationType(TerminationTypeData terminationType) {
		this.terminationType = terminationType;
	}

	public UserData getEmployee() {
		return employee;
	}

	public void setEmployee(UserData employee) {
		this.employee = employee;
	}

}
