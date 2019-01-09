package com.sgic.hrm.commons.trainer.dto;

public class PaymentData {
	private Integer id;
	private Double amount;
	private String status;

	private TrainingScheduleData trainingSchedule;

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

	public TrainingScheduleData getTrainingSchedule() {
		return trainingSchedule;
	}

	public void setTrainingSchedule(TrainingScheduleData trainingSchedule) {
		this.trainingSchedule = trainingSchedule;
	}

}