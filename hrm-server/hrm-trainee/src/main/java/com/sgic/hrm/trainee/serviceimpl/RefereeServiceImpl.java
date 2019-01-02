package com.sgic.hrm.trainee.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.trainee.Referee;
import com.sgic.hrm.commons.entity.trainee.Trainee;
import com.sgic.hrm.commons.repository.trainee.RefereeRepository;
import com.sgic.hrm.commons.repository.trainee.TraineeRepository;
import com.sgic.hrm.trainee.service.RefereeService;

@Service
public class RefereeServiceImpl implements RefereeService {
	@Autowired
	private RefereeRepository refereeRepository;
	@Autowired
	private TraineeRepository traineeRepository;

	@Override
	public boolean addReferee(Referee referee, Trainee trainee) {
		referee.setTrainee(trainee);
		refereeRepository.save(referee);
		return false;
	}

	@Override
	public List<Referee> getAllReferee() {
		return refereeRepository.findAll();
	}

	@Override
	public boolean editReferee(Referee referee, int id, Trainee trainee) {
		if (refereeRepository.getOne(id) != null) {
			referee.setId(id);
			referee.setTrainee(trainee);
			refereeRepository.save(referee);
			return true;
		}
		return false;
	}

	@Override
	public Optional<Referee> getRefereeById(int id) {
		return refereeRepository.findById(id);
	}

	@Override
	public boolean deleteReferee(int id) {
		if (refereeRepository.getOne(id) != null) {
			refereeRepository.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public List<Referee> getRefereeByTraineeId(Integer id) {
		return refereeRepository.findRefereeByUser(traineeRepository.findTraineeById(id));
	}

}
