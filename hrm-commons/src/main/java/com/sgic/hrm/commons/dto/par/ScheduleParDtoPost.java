package com.sgic.hrm.commons.dto.par;

import java.util.Date;
import java.util.List;

import com.sgic.hrm.commons.entity.par.EmployeeDetails;

public class ScheduleParDtoPost {

	private String empId;
	private Date scheduleDate;
	private String employeeID;
	private String employeeEmail;

	private List<ScheduleParAppraisorsDtoPost> scheduleParAppraisorsList;
	private List<ScheduleParContentDtoPost> scheduleParContentList;

	
	
	public ScheduleParDtoPost(String empId, Date scheduleDate, String employeeID, String employeeEmail) {
	
		this.empId = empId;
		this.scheduleDate = scheduleDate;
		this.employeeID = employeeID;
		this.employeeEmail = employeeEmail;
	}


	public ScheduleParDtoPost() {

	}


	public String getEmployeeID() {
		return employeeID;
	}


	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}


	public String getEmployeeEmail() {
		return employeeEmail;
	}


	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}


	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Date getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(Date scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	public List<ScheduleParAppraisorsDtoPost> getScheduleParAppraisorsList() {
		return scheduleParAppraisorsList;
	}

	public void setScheduleParAppraisorsList(List<ScheduleParAppraisorsDtoPost> scheduleParAppraisorsList) {
		this.scheduleParAppraisorsList = scheduleParAppraisorsList;
	}

	public List<ScheduleParContentDtoPost> getScheduleParContentList() {
		return scheduleParContentList;
	}

	public void setScheduleParContentList(List<ScheduleParContentDtoPost> scheduleParContentList) {
		this.scheduleParContentList = scheduleParContentList;
	}

}