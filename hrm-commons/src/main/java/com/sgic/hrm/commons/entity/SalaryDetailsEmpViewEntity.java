package com.sgic.hrm.commons.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "employee", name = "salary_details_emp_view")
public class SalaryDetailsEmpViewEntity {

	@Id
	Integer id;
	String empName;
	Date appointmentDate;
	Integer basicSalary;
	Integer increment;
	Integer deductions;
	Integer allowances;
	Integer statutoryPayment;
	Integer netSalary;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public Integer getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(Integer basicSalary) {
		this.basicSalary = basicSalary;
	}

	public Integer getIncrement() {
		return increment;
	}

	public void setIncrement(Integer increment) {
		this.increment = increment;
	}

	public Integer getDeductions() {
		return deductions;
	}

	public void setDeductions(Integer deductions) {
		this.deductions = deductions;
	}

	public Integer getAllowances() {
		return allowances;
	}

	public void setAllowances(Integer allowances) {
		this.allowances = allowances;
	}

	public Integer getStatutoryPayment() {
		return statutoryPayment;
	}

	public void setStatutoryPayment(Integer statutoryPayment) {
		this.statutoryPayment = statutoryPayment;
	}

	public Integer getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(Integer netSalary) {
		this.netSalary = netSalary;
	}
}
