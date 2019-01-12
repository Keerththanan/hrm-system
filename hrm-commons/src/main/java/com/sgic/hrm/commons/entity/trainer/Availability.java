package com.sgic.hrm.commons.entity.trainer;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema="trainer", name="availability")
public class Availability implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8000619408674424017L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Date date;
	
	@ManyToOne
	@JoinColumn(name="trainer_id")
	private UserTrainer trainerId;
	
	
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
	public UserTrainer getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(UserTrainer trainerId) {
		this.trainerId = trainerId;
	}
	
	
	

}
