package com.sgic.hrm.commons.dto;

public class PromotionData {
	
	private Integer id;
	private int requestId;
	private int designationId;
	private int promotedDate;
	private String remark;
	private int salary;
	private int promotedBy;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public int getDesignationId() {
		return designationId;
	}
	public void setDesignationId(int designationId) {
		this.designationId = designationId;
	}
	public int getPromotedDate() {
		return promotedDate;
	}
	public void setPromotedDate(int promotedDate) {
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
	public int getPromotedBy() {
		return promotedBy;
	}
	public void setPromotedBy(int promotedBy) {
		this.promotedBy = promotedBy;
	}
	
	

}
