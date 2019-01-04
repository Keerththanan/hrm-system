package com.sgic.hrm.commons.trainer.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.sgic.hrm.commons.entity.trainer.Trainer;

public interface TrainerRepository extends JpaRepository<Trainer, Integer>{
	
}
