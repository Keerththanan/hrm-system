package com.sgic.hrm.commons.dto;

public class IndividualWelfareData {
	
	private Integer Id;
	private String employee_name;
	private String individualWelfare_name;
	private Integer amount;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getIndividualWelfare_name() {
		return individualWelfare_name;
	}
	public void setIndividualWelfare_name(String individualWelfare_name) {
		this.individualWelfare_name = individualWelfare_name;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}

}






