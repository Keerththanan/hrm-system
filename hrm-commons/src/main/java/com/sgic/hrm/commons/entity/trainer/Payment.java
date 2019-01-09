package com.sgic.hrm.commons.entity.trainer;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;;

@Entity
@Table(schema = "trainer", name = "payment")
public class Payment implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3323930356795011743L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Double amount;
	private String status;

	@ManyToOne
	@JoinColumn(name = "trainingSchedule_id")
	private TrainingSchedule trainingSchedule;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public TrainingSchedule getTrainingSchedule() {
		return trainingSchedule;
	}

	public void setTrainingSchedule(TrainingSchedule trainingSchedule) {
		this.trainingSchedule = trainingSchedule;
	}

}
