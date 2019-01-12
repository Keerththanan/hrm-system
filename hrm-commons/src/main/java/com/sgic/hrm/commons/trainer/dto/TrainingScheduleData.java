package com.sgic.hrm.commons.trainer.dto;

import java.sql.Time;
import java.util.Date;

//done by daminiya

public class TrainingScheduleData {
	private Integer id;
	private String trainingTopic;
	private Date date;
	private Time totalCoveredhours;
	private String status;
	private UserTrainerData trainer;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public UserTrainerData getTrainer() {
		return trainer;
	}

	public void setTrainer(UserTrainerData trainer) {
		this.trainer = trainer;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTrainingTopic() {
		return trainingTopic;
	}

	public void setTrainingTopic(String trainingTopic) {
		this.trainingTopic = trainingTopic;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTotalCoveredhours() {
		return totalCoveredhours;
	}

	public void setTotalCoveredhours(Time totalCoveredhours) {
		this.totalCoveredhours = totalCoveredhours;
	}

}
