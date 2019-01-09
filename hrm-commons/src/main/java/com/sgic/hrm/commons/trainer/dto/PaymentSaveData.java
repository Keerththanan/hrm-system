package com.sgic.hrm.commons.trainer.dto;

public class PaymentSaveData {
	private Integer id;
	private Double amount;
	private String status;

	private Integer trainingSchedule;

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

	public Integer getTrainingSchedule() {
		return trainingSchedule;
	}

	public void setTrainingSchedule(Integer trainingSchedule) {
		this.trainingSchedule = trainingSchedule;
	}

}
