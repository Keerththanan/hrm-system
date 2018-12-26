package com.sgic.hrm.commons.trainer.dto;

import java.sql.Date;
import java.sql.Time;

public class ScheduleData {
	
	private Integer id;
	private String trainerName;
	private Date startDate;
	private Date endDate;
	private Time startTime;
	private Time endTime;
	private String scheduledTopic;
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
	
	public Time getStartTime() {
		return startTime;
	}
	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}
	public Time getEndTime() {
		return endTime;
	}
	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}
	public String getScheduledTopic() {
		return scheduledTopic;
	}
	public void setScheduledTopic(String scheduledTopic) {
		this.scheduledTopic = scheduledTopic;
	}
	

}
