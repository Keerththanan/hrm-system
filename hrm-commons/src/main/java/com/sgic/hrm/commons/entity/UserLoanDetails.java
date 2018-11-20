package com.sgic.hrm.commons.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_loan_details",schema="employee")
public class UserLoanDetails implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = -6999466993121815342L;
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="user_loan_id")
private Integer user_loan_id;
@Column(name="loan_obtained_date")
private Date loan_obtained_date;
@Column(name="installment_period")
private Integer installment_period;
@Column(name="installment_amount")
private Integer installment_amount;
@Column(name="redumption_date")
private Date redumption_date;

@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
@JoinColumn(name="user_id")
private UserEntity user_id;

@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
@JoinColumn(name="loan_id")
private LoanDetailsEntity loanDetailsEntity;


public LoanDetailsEntity getLoanDetailsEntity() {
	return loanDetailsEntity;
}

public void setLoanDetailsEntity(LoanDetailsEntity loanDetailsEntity) {
	this.loanDetailsEntity = loanDetailsEntity;
}

public Integer getUser_loan_id() {
	return user_loan_id;
}

public void setUser_loan_id(Integer user_loan_id) {
	this.user_loan_id = user_loan_id;
}

public Date getLoan_obtained_date() {
	return loan_obtained_date;
}

public void setLoan_obtained_date(Date loan_obtained_date) {
	this.loan_obtained_date = loan_obtained_date;
}

public Integer getInstallment_period() {
	return installment_period;
}

public void setInstallment_period(Integer installment_period) {
	this.installment_period = installment_period;
}

public Integer getInstallment_amount() {
	return installment_amount;
}

public void setInstallment_amount(Integer installment_amount) {
	this.installment_amount = installment_amount;
}

public Date getRedumption_date() {
	return redumption_date;
}

public void setRedumption_date(Date redumption_date) {
	this.redumption_date = redumption_date;
}

public UserEntity getUser_id() {
	return user_id;
}

public void setUser_id(UserEntity user_id) {
	this.user_id = user_id;
}

}
