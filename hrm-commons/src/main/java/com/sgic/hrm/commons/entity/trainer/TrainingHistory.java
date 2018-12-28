package com.sgic.hrm.commons.entity.trainer;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="training_history" , schema="trainer")
public class TrainingHistory implements Serializable {
	
	
	private static final long serialVersionUID = -3323930356795011743L;
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	
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
