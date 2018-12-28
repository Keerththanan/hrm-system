package com.sgic.hrm.trainer.service;

import java.util.List;

import com.sgic.hrm.commons.entity.trainer.Payment;

public interface PaymentService {

	boolean addPayment(Payment payment);

	List<Payment> getAllPayment();

	boolean editPayment(Payment payment, Integer id);

	boolean deletePayment(Integer id);

	Payment getById(Integer id);
}
