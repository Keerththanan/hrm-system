package com.sgic.hrm.commons.trainer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sgic.hrm.commons.entity.trainer.Trainer;

public interface TrainerRepository extends JpaRepository<Trainer, Integer>{
//	Trainer findTrainerById(Integer id);
//	Trainer findTrainerByName(String fullname);
	
//	@Query("select p from Payment p join p.trainingSchedule t where t.trainer_id=?1")
//	List<Payment> findByTrainerId(int id);

	
//	select * 
//	from trainer.payment join trainer.training_schedule 
//	on trainer.payment.training_schedule_id=trainer.training_schedule.id
//	where trainer.training_schedule.date <= NOW() AND trainer.training_schedule.trainer_id=2;

}
