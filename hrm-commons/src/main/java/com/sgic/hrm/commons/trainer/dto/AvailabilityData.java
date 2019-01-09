package com.sgic.hrm.commons.trainer.dto;

import java.util.Date;

public class AvailabilityData {
	
	private Integer id;
	private Date date;
	private TrainerData trainerId;
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
	public TrainerData getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(TrainerData trainerId) {
		this.trainerId = trainerId;
	}
	
	
	

}
