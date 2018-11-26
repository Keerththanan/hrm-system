package com.sgic.hrm.commons.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class UserCareerDevelopmentPlanSelf implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1917334021724684496L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne(cascade = { CascadeType.PERSIST })
	@JoinColumn(name = "cdp_Id")
	private CareerDevelopmentPlan cdpName;

	@ManyToOne(cascade = { CascadeType.PERSIST })
	@JoinColumn(name = "cdp_Id")
	private User userName;
	private String status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CareerDevelopmentPlan getCdpName() {
		return cdpName;
	}

	public void setCdpName(CareerDevelopmentPlan cdpName) {
		this.cdpName = cdpName;
	}

	public User getUserName() {
		return userName;
	}

	public void setUserName(User userName) {
		this.userName = userName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
