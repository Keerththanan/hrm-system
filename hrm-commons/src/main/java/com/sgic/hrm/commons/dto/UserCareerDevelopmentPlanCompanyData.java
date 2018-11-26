package com.sgic.hrm.commons.dto;

public class UserCareerDevelopmentPlanCompanyData {

	Integer id;
    CareerDevelopmentPlanData cdpId;
    UserData userName;
	String status;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public CareerDevelopmentPlanData getCdpId() {
		return cdpId;
	}
	public void setCdpId(CareerDevelopmentPlanData cdpId) {
		this.cdpId = cdpId;
	}
	public UserData getUserName() {
		return userName;
	}
	public void setUserName(UserData userName) {
		this.userName = userName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
