package com.sgic.hrm.commons.trainer.dto;

import java.util.Date;

public class AvailabilityData {
	
	private Integer id;
	private Date date;
	private UserTrainerData trainerId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public UserTrainerData getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(UserTrainerData trainerId) {
		this.trainerId = trainerId;
	}
	
	
	

}
