package com.sgic.hrm.commons.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
@Table(schema = "employee", name = "request_promotion")
public class RequestPromotion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
//	@ManyToOne
//	@JoinColumn(name = "user_id")
	private int userId;
	
//	@OneToOne
//	@JoinColumn(name = "id")
	private int designationId;
	
	private String promotionRemark;
	private int recommendedBy;
	
	@CreationTimestamp
	private Date createdAt;
	
	@UpdateTimestamp
	private Date updatedAt;

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
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

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

}
