package com.sgic.hrm.commons.entity.trainer;

//done by daminiya
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "training_schedule", schema = "trainer")
public class TrainingSchedule implements Serializable {

	private static final long serialVersionUID = -3323930356795011743L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	private String trainingTopic;
	private Date date;
	private Time totalCoveredhours;
	private String status;
	
	@OneToOne
	@JoinColumn(name="trainer_id")
	private UserTrainer trainer;
	
    public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public UserTrainer getTrainer() {
		return trainer;
	}

	public void setTrainer(UserTrainer trainer) {
		this.trainer = trainer;
	}

	//start getter setter
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
