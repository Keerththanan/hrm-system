package com.sgic.hrm.commons.dto;

import java.sql.Date;

public class PromotionData {

	private Integer id;
	private UserData userId;
	private DesignationData designationId;
	private Date promotedDate;
	private String remark;
	private int salary;
	private String promotedBy;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public DesignationData getDesignationId() {
		return designationId;
	}

	public void setDesignationId(DesignationData designationId) {
		this.designationId = designationId;
	}

	
	public UserData getUserId() {
		return userId;
	}

	public void setUserId(UserData userId) {
		this.userId = userId;
	}

	public Date getPromotedDate() {
		return promotedDate;
	}

	public void setPromotedDate(Date promotedDate) {
		this.promotedDate = promotedDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getPromotedBy() {
		return promotedBy;
	}

	public void setPromotedBy(String promotedBy) {
		this.promotedBy = promotedBy;
	}

}
