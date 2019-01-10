package com.sgic.hrm.commons.repository.trainee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.sgic.hrm.commons.entity.trainee.Trainee;

public interface TraineeRepository extends JpaRepository<Trainee, Integer> {

	Trainee findByName(String fullName);

	Trainee findTraineeById(Integer id);

	@Query("Select t from Trainee t Where t.employment = ?1")
	List<Trainee> findTraineeByEmployment(String employment);
	
	@Query("Select t from Trainee t Where t.fullName like lower(concat(?1,'%'))")
	List<Trainee> findTraineeByFullName(String fullName);
	
	
}
