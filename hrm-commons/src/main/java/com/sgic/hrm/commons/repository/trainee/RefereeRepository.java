package com.sgic.hrm.commons.repository.trainee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.trainee.Referee;
import com.sgic.hrm.commons.entity.trainee.Trainee;

public interface RefereeRepository extends JpaRepository<Referee, Integer> {
	List<Referee> findRefereeByTrainee(Trainee trainee);
}
