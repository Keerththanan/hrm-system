package com.sgic.hrm.commons.dto;

public class RequestPromotionData {
	private Integer id;
	private int userId;
	private int designationId;
	private String promotionRemark;
	private String recommendedBy;

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

	public String getRecommendedBy() {
		return recommendedBy;
	}

	public void setRecommendedBy(String recommendedBy) {
		this.recommendedBy = recommendedBy;
	}

}
