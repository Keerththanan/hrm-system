package com.sgic.hrm.commons.trainer.entity.mapper;

import com.sgic.hrm.commons.entity.mapper.UserMapper;
import com.sgic.hrm.commons.entity.trainer.Payment;
import com.sgic.hrm.commons.trainer.dto.PaymentData;

public class PaymentMapper {

	public static PaymentData paymentMapper(Payment payment) {
		PaymentData paymentData = new PaymentData();

		paymentData.setId(payment.getId());
		paymentData.setTrainingDate(payment.getTrainingDate());
		paymentData.setAmountPaid(payment.getAmountPaid());
		paymentData.setRemainingAmount(payment.getRemainingAmount());
		paymentData.setPaymentStatus(payment.getPaymentStatus());

		paymentData.setUser(UserMapper.userMapper(payment.getUser()));

		return paymentData;

	}
}
