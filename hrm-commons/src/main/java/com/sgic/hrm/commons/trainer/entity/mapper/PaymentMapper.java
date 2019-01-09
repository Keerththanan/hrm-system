package com.sgic.hrm.commons.trainer.entity.mapper;

import com.sgic.hrm.commons.entity.trainer.Payment;
import com.sgic.hrm.commons.trainer.dto.PaymentData;

public class PaymentMapper {

	public static PaymentData paymentMapper(Payment payment) {
		PaymentData paymentData = new PaymentData();

		paymentData.setId(payment.getId());
		paymentData.setAmount(payment.getAmount());
		paymentData.setStatus(payment.getStatus());

		paymentData.setTrainingSchedule(TrainingScheduleToTrainingScheduleData
				.TrainingHistoryToTrainingHistoryData(payment.getTrainingSchedule()));
		return paymentData;

	}

}
