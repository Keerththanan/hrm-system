package com.sgic.hrm.commons.trainer.dto;
//done by daminiya
import java.sql.Date;
import java.sql.Timestamp;

public class TrainingScheduleData {
	private Integer id;
	private String trainerName;
	private String trainingTopic;
	private Date date;
	private Timestamp totalCoveredhours;
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
	public Timestamp getTotalCoveredhours() {
		return totalCoveredhours;
	}
	public void setTotalCoveredhours(Timestamp totalCoveredhours) {
		this.totalCoveredhours = totalCoveredhours;
	}
	
}
