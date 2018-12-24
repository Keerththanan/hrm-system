package com.sgic.hrm.commons.dto.profile;

import java.sql.Date;

public class AppointmentSaveDto {
	private Integer id;
	private Integer user;
	private Integer designation;
	private Integer appointmentType;
	private Integer department;
	private String jobDesc;
	private Date appoinmentDate;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getUser() {
		return user;
	}
	public void setUser(Integer user) {
		this.user = user;
	}
	public String getJobDesc() {
		return jobDesc;
	}
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}
	public Date getAppoinmentDate() {
		return appoinmentDate;
	}
	public void setAppoinmentDate(Date appoinmentDate) {
		this.appoinmentDate = appoinmentDate;
	}
	public Integer getDesignation() {
		return designation;
	}
	public void setDesignation(Integer designation) {
		this.designation = designation;
	}
	public Integer getAppointmentType() {
		return appointmentType;
	}
	public void setAppointmentType(Integer appointmentType) {
		this.appointmentType = appointmentType;
	}
	public Integer getDepartment() {
		return department;
	}
	public void setDepartment(Integer department) {
		this.department = department;
	}
	
	
}
