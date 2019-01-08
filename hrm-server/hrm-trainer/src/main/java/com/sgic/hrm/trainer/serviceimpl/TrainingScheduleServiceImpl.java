package com.sgic.hrm.trainer.serviceimpl;
//Done by Daminiya
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.trainer.TrainingSchedule;
import com.sgic.hrm.commons.trainer.repository.TrainingScheduleRepository;
import com.sgic.hrm.trainer.service.TrainingScheduleService;

@Service
public class TrainingScheduleServiceImpl implements TrainingScheduleService {
	@Autowired
	private TrainingScheduleRepository trainingHistoryRepository;

	@Override
	public boolean addTrainingHistory(TrainingSchedule trainingHistory) {
		trainingHistoryRepository.save(trainingHistory);
		return true;
	}

	@Override
	public List<TrainingSchedule> getAllTrainingHistory() {
		return trainingHistoryRepository.findAll();
	}

	@Override
	public boolean editTrainingHistory(TrainingSchedule trainingHistory) {
		boolean success = false;
		if (trainingHistoryRepository.getOne(trainingHistory.getId()) != null) {
			trainingHistoryRepository.save(trainingHistory);
			success = true;
		}
		return success;
	}

	@Override
	public boolean deleteTrainingHistory(Integer id) {
		TrainingSchedule trainingHistory = trainingHistoryRepository.getOne(id);
		if (trainingHistory.getId() == (id)) {
			trainingHistoryRepository.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public TrainingSchedule getById(Integer id) {
		return trainingHistoryRepository.getOne(id);
	}

	@Override
	public TrainingSchedule getOneTrainingHistory(Integer id) {
		return trainingHistoryRepository.findById(id).orElse(null);
	}

	@Override
	public boolean updateTrainingHistory(Integer id, TrainingSchedule trainingHistory) {
		if (trainingHistoryRepository.getOne(id) != null) {
			trainingHistory.setId(id);
			trainingHistoryRepository.save(trainingHistory);
			return true;
		}
		return false;
	}

}
