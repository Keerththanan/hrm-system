package com.sgic.hrm.trainee.service;

import java.util.List;
import java.util.Optional;

import com.sgic.hrm.commons.entity.Department;
import com.sgic.hrm.commons.entity.Role;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.entity.trainee.Trainee;

public interface TraineeService {
	 public boolean addTrainee(Trainee trainee, Department department);

	  List<Trainee> getTrainee();

	  boolean editTrainee(Trainee trainee, Integer id);

	  boolean deleteTrainee(Integer id);

	  public Trainee findTraineeById(Integer id);

	  public Trainee findByTraineeName(String fullName);
}
