package com.sgic.hrm.commons.repository.trainee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.trainee.TraineeReferee;
import com.sgic.hrm.commons.entity.trainee.Trainee;

public interface TraineeRefereeRepository extends JpaRepository<TraineeReferee, Integer> {
	List<TraineeReferee> findRefereeByTrainee(Trainee trainee);
}
