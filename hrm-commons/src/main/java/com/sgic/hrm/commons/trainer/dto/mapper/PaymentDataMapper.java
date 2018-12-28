package com.sgic.hrm.commons.trainer.dto.mapper;

import com.sgic.hrm.commons.dto.mapper.UserDataMapper;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.entity.trainer.Payment;
import com.sgic.hrm.commons.trainer.dto.PaymentData;
import com.sgic.hrm.commons.trainer.dto.PaymentSaveData;

public class PaymentDataMapper {
	private PaymentDataMapper() {
	}

	public static Payment paymentDataMapper(PaymentData paymentData) {
		Payment payment = new Payment();

		payment.setId(paymentData.getId());
		payment.setTrainingDate(paymentData.getTrainingDate());
		payment.setAmountPaid(paymentData.getAmountPaid());
		payment.setRemainingAmount(paymentData.getRemainingAmount());
		payment.setPaymentStatus(paymentData.getPaymentStatus());

		payment.setUser(UserDataMapper.userDataMapper(paymentData.getUser()));
		return payment;

	}

	public static Payment paymentSaveDataMapper(PaymentSaveData paymentSaveData) {
		Payment payment = new Payment();
		User user = new User();

		payment.setId(paymentSaveData.getId());
		payment.setTrainingDate(paymentSaveData.getTrainingDate());
		payment.setAmountPaid(paymentSaveData.getAmountPaid());
		payment.setRemainingAmount(paymentSaveData.getRemainingAmount());
		payment.setPaymentStatus(paymentSaveData.getPaymentStatus());

		user.setId(paymentSaveData.getUser());
		payment.setUser(user);

		return payment;
	}

}
