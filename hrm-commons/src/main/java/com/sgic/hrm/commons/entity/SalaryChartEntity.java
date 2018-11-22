package com.sgic.hrm.commons.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "employee", name = "salary_chart")
public class SalaryChartEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
//	@Column(unique=true,length=5)
//	String empId;
	String empName;
	int basicSalary;
	String payee;
	int netSalary;
	int statutoryPayment;
	int loan;
	int epf;
	int stampDuty;

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

	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}

	public String getPayee() {
		return payee;
	}

	public void setPayee(String payee) {
		this.payee = payee;
	}

	public int getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(int netSalary) {
		this.netSalary = netSalary;
	}

	public int getStatutoryPayment() {
		return statutoryPayment;
	}

	public void setStatutoryPayment(int statutoryPayment) {
		this.statutoryPayment = statutoryPayment;
	}

	public int getLoan() {
		return loan;
	}

	public void setLoan(int loan) {
		this.loan = loan;
	}

	public int getEpf() {
		return epf;
	}

	public void setEpf(int epf) {
		this.epf = epf;
	}

	public int getStampDuty() {
		return stampDuty;
	}

	public void setStampDuty(int stampDuty) {
		this.stampDuty = stampDuty;
	}

}
