package com.sgic.hrm.commons.repository.trainee;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.trainee.Trainee;

public interface TraineeRepository extends JpaRepository<Trainee, Integer>{
	
	 Trainee findByName(String fullName);
	 Trainee findTraineeById(Integer id);
}
