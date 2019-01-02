package com.sgic.hrm.trainee.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.Department;
import com.sgic.hrm.commons.entity.trainee.Trainee;
import com.sgic.hrm.commons.repository.trainee.TraineeRepository;
import com.sgic.hrm.trainee.service.TraineeService;
@Service
public class TraineeServiceImpl implements TraineeService{
	@Autowired
	private TraineeRepository traineeRepository;
	@Override
	public boolean addTrainee(Trainee trainee, Department department) {
		traineeRepository.save(trainee);
		return true;
	}

	@Override
	public List<Trainee> getTrainee() {
		return traineeRepository.findAll();
	}

	@Override
	public boolean editTrainee(Trainee trainee, Integer id) {
		if(traineeRepository.getOne(id) != null) {
			traineeRepository.save(trainee);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteTrainee(Integer id) {
		if(traineeRepository.getOne(id) != null) {
			traineeRepository.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public Trainee findTraineeById(Integer id) {
		return traineeRepository.findTraineeById(id);
		
	}

	@Override
	public Trainee findByTraineeName(String fullName) {
		return traineeRepository.findByName(fullName);
		
	}

}
