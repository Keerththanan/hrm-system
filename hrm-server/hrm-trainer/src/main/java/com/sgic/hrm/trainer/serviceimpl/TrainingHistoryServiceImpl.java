package com.sgic.hrm.trainer.serviceimpl;
//Done by Daminiya
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.trainer.TrainingHistory;
import com.sgic.hrm.commons.trainer.repository.TrainingHistoryRepository;
import com.sgic.hrm.trainer.service.TrainingHistoryService;

@Service
public class TrainingHistoryServiceImpl implements TrainingHistoryService {
	@Autowired
	private TrainingHistoryRepository trainingHistoryRepository;

	@Override
	public boolean addTrainingHistory(TrainingHistory trainingHistory) {
		trainingHistoryRepository.save(trainingHistory);
		return true;
	}

	@Override
	public List<TrainingHistory> getAllTrainingHistory() {
		return trainingHistoryRepository.findAll();
	}

	@Override
	public boolean editTrainingHistory(TrainingHistory trainingHistory) {
		boolean success = false;
		if (trainingHistoryRepository.getOne(trainingHistory.getId()) != null) {
			trainingHistoryRepository.save(trainingHistory);
			success = true;
		}
		return success;
	}

	@Override
	public boolean deleteTrainingHistory(Integer id) {
		TrainingHistory trainingHistory = trainingHistoryRepository.getOne(id);
		if (trainingHistory.getId() == (id)) {
			trainingHistoryRepository.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public TrainingHistory getById(Integer id) {
		return trainingHistoryRepository.getOne(id);
	}

	@Override
	public TrainingHistory getOneTrainingHistory(Integer id) {
		return trainingHistoryRepository.findById(id).orElse(null);
	}

	@Override
	public boolean updateTrainingHistory(Integer id, TrainingHistory trainingHistory) {
		if (trainingHistoryRepository.getOne(id) != null) {
			trainingHistory.setId(id);
			trainingHistoryRepository.save(trainingHistory);
			return true;
		}
		return false;
	}

}
