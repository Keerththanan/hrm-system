package com.sgic.hrm.commons.entity.trainer;

//done by daminiya
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sgic.hrm.commons.entity.User;

@Entity
@Table(name = "training_schedule", schema = "trainer")
public class TrainingSchedule implements Serializable {

	private static final long serialVersionUID = -3323930356795011743L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	private String trainerName;
	private String trainingTopic;
	private Date date;
	private Timestamp totalCoveredhours;
	private String status;
	
	@OneToOne
	@JoinColumn(name="trainer_id")
	private Trainer trainer;
	
    public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	//start getter setter
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
