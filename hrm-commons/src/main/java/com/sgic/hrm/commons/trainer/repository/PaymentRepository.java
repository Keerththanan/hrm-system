package com.sgic.hrm.commons.trainer.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.sgic.hrm.commons.entity.trainer.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

//	@Query("select payment from Payment as payment where payment.trainer.id=?1")
//	List<Payment> findByTrainerId(int id);
}
