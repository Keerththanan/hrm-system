package com.sgic.hrm.commons.trainer.dto.mapper;

import com.sgic.hrm.commons.entity.trainer.Payment;
import com.sgic.hrm.commons.entity.trainer.TrainingSchedule;
import com.sgic.hrm.commons.trainer.dto.PaymentData;
import com.sgic.hrm.commons.trainer.dto.PaymentSaveData;

public class PaymentDataMapper {
	private PaymentDataMapper() {
	}

	public static Payment paymentDataMapper(PaymentData paymentData) {
		Payment payment = new Payment();

		payment.setId(paymentData.getId());
		payment.setAmount(paymentData.getAmount());
		payment.setStatus(paymentData.getStatus());

		payment.setTrainingSchedule(TrainingScheduleDataToTrainingSchedule
				.TrainingScheduleDataToTrainingSchedule(paymentData.getTrainingSchedule()));
		return payment;
	}

	public static Payment paymentSaveDataMapper(PaymentSaveData paymentSaveData) {
		Payment payment = new Payment();
		TrainingSchedule trainingSchedule = new TrainingSchedule();

		payment.setId(paymentSaveData.getId());
		payment.setAmount(paymentSaveData.getAmount());
		payment.setStatus(paymentSaveData.getStatus());

		trainingSchedule.setId(paymentSaveData.getTrainingSchedule());
		payment.setTrainingSchedule(trainingSchedule);

		return payment;
	}

}
