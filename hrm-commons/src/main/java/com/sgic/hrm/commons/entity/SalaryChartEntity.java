package com.sgic.hrm.commons.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "employee", name = "salary_chart")
public class SalaryChartEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6380894775207406278L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String empName;
	private Integer basicSalary;
	private String payee;
	private Integer netSalary;
	private Integer statutoryPayment;
	private Integer loan;
	private Integer epf8;
	private Integer etf3;
	private Integer epf12;
	private Integer stampDuty;

	@ManyToOne
	@JoinColumn(name = "user_salarychart")
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getEpf8() {
		return epf8;
	}

	public void setEpf8(Integer epf8) {
		this.epf8 = epf8;
	}

	public Integer getEtf3() {
		return etf3;
	}

	public void setEtf3(Integer etf3) {
		this.etf3 = etf3;
	}

	public Integer getEpf12() {
		return epf12;
	}

	public void setEpf12(Integer epf12) {
		this.epf12 = epf12;
	}

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

	public Integer getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(Integer basicSalary) {
		this.basicSalary = basicSalary;
	}

	public String getPayee() {
		return payee;
	}

	public void setPayee(String payee) {
		this.payee = payee;
	}

	public Integer getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(Integer netSalary) {
		this.netSalary = netSalary;
	}

	public Integer getStatutoryPayment() {
		return statutoryPayment;
	}

	public void setStatutoryPayment(Integer statutoryPayment) {
		this.statutoryPayment = statutoryPayment;
	}

	public Integer getLoan() {
		return loan;
	}

	public void setLoan(Integer loan) {
		this.loan = loan;
	}

	public Integer getStampDuty() {
		return stampDuty;
	}

	public void setStampDuty(Integer stampDuty) {
		this.stampDuty = stampDuty;
	}

}
