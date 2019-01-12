package com.sgic.hrm.commons.trainer.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.sgic.hrm.commons.entity.trainer.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

//	@Query("select payment from Payment as payment where payment.trainer.id=?1")
//	List<Payment> findByTrainerId(int id);
//	
//	@Query("select p from Payment p join p.trainingSchedule t where t.trainer_id=?1")
//	List<Payment> findByTrainerId(int id);
	
//	select * 
//	from trainer.payment join trainer.training_schedule 
//	on trainer.payment.training_schedule_id=trainer.training_schedule.id
//	where trainer.training_schedule.date <= NOW() AND trainer.training_schedule.trainer_id=2;

	
//	@Query("select p from Payment p join p.trainingSchedule t where t.trainer_id=?1")
//	List<Payment> findByTrainerId(int id);

}
