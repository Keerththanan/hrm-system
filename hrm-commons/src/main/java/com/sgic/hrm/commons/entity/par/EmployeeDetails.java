package com.sgic.hrm.commons.entity.par;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeeDetails", schema = "par")
public class EmployeeDetails {
@Id
private String EmpId;
private String EmpName;
private String Email;

public EmployeeDetails(String empId, String empName, String email) {
	super();
	EmpId = empId;
	EmpName = empName;
	Email = email;
}
public EmployeeDetails() {
	
}
public String getEmpId() {
	return EmpId;
}
public void setEmpId(String empId) {
	EmpId = empId;
}
public String getEmpName() {
	return EmpName;
}
public void setEmpName(String empName) {
	EmpName = empName;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}

}
