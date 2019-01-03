package com.sgic.hrm.trainee.service;

import java.util.List;

import com.sgic.hrm.commons.entity.trainee.Department;
import com.sgic.hrm.commons.entity.trainee.Trainee;

public interface TraineeService {
	public boolean addTrainee(Trainee trainee, Department department);

	List<Trainee> getTrainee();

	Trainee getTraineeById(Integer id);

	boolean editTrainee(Trainee trainee, Department department, Integer id);

	boolean deleteTrainee(Integer id);

	public Trainee findTraineeById(Integer id);

	public Trainee findByTraineeName(String fullName);
}
