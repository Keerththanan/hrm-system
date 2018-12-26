package com.sgic.hrm.commons.trainer.dto;

import java.sql.Date;
import java.sql.Time;

public class AvailabilityData {
	
	private Integer id;
	private String trainerName;
	private Date startDate;
	private Date endDate;
	private Time time;
	private String scheduledTopic;
	private String status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public String getScheduledTopic() {
		return scheduledTopic;
	}
	public void setScheduledTopic(String scheduledTopic) {
		this.scheduledTopic = scheduledTopic;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
