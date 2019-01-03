package com.sgic.hrm.trainee.service;

import java.util.List;
import java.util.Optional;

import com.sgic.hrm.commons.entity.trainee.Referee;
import com.sgic.hrm.commons.entity.trainee.Trainee;

public interface RefereeService {

	boolean addReferee(Referee referee, Trainee trainee);

	List<Referee> getAllReferee();

	boolean editReferee(Referee referee, int id, Trainee trainee);

	Optional<Referee> getRefereeById(int id);

	boolean deleteReferee(int id);

	List<Referee> getRefereeByTraineeId(Integer id);

}
