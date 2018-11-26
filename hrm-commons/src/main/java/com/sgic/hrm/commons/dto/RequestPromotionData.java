package com.sgic.hrm.commons.dto;

import java.sql.Date;

public class RequestPromotionData {
	private Integer id;
	private int userId;
	private int designationId;
	private String promotionRemark;
	private int recommendedBy;

	private Date createdAt;
	private Date updatedAt;

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public int getDesignationId() {
		return designationId;
	}

	public void setDesignationId(int designationId) {
		this.designationId = designationId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPromotionRemark() {
		return promotionRemark;
	}

	public void setPromotionRemark(String promotionRemark) {
		this.promotionRemark = promotionRemark;
	}

	public int getRecommendedBy() {
		return recommendedBy;
	}

	public void setRecommendedBy(int recommendedBy) {
		this.recommendedBy = recommendedBy;
	}

}