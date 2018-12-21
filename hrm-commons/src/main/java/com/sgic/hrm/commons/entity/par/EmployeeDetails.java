package com.sgic.hrm.commons.entity.par;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeeDetails", schema = "par")
public class EmployeeDetails {
@Id
private String empId;
private String empName;
private String email;


public EmployeeDetails(String empId, String empName, String email) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.email = email;
}
public EmployeeDetails() {
	
}

public String getEmpId() {
	return empId;
}
public void setEmpId(String empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}



}
