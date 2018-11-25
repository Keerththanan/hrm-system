package com.sgic.hrm.commons.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class GeneralWelfare {
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer Id;
	private String generalWelfare_name;
	private String details;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getGeneralWelfare_name() {
		return generalWelfare_name;
	}
	public void setGeneralWelfare_name(String generalWelfare_name) {
		this.generalWelfare_name = generalWelfare_name;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}

}
