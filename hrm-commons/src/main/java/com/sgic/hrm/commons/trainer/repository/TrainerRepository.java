package com.sgic.hrm.commons.trainer.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.trainer.Trainer;

<<<<<<< HEAD
public interface TrainerRepository extends JpaRepository<Trainer, Integer> {

=======
public interface TrainerRepository extends JpaRepository<Trainer, Integer>{
	Trainer findTrainerById(Integer id);
//	Trainer findTrainerByName(String username);
>>>>>>> 25335ffa3b3f8812eadcea9a71ac58ced17d3f54
}
