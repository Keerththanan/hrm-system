package com.sgic.hrm.commons.dto.profile;

import java.sql.Date;
import com.sgic.hrm.commons.entity.AppointmentType;
import com.sgic.hrm.commons.entity.Department;
import com.sgic.hrm.commons.entity.Designation;
import com.sgic.hrm.commons.entity.User;

public class AppointmentDto {
	private Integer id;
	private String jobDesc;
	private Date appoinmentDate;
	private User user;
	private Designation designation;
	private AppointmentType appointmentType;
	private Department department;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Designation getDesignation() {
		return designation;
	}
	public void setDesignation(Designation designation) {
		this.designation = designation;
	}
	public AppointmentType getAppointmentType() {
		return appointmentType;
	}
	public void setAppointmentType(AppointmentType appointmentType) {
		this.appointmentType = appointmentType;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	
}
