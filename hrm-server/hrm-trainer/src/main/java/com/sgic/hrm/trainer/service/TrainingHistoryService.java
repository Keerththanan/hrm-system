package com.sgic.hrm.trainer.service;

import java.util.List;

import com.sgic.hrm.commons.entity.trainer.TrainingHistory;

public interface TrainingHistoryService {
	boolean addTrainingHistory(TrainingHistory trainingHistory);

	List<TrainingHistory> getAllTrainingHistory();

	boolean editTrainingHistory(TrainingHistory trainingHistory);

	boolean deleteTrainingHistory(Integer id);

	TrainingHistory getById(Integer id);

	TrainingHistory getOneTrainingHistory(Integer id);

	boolean updateTrainingHistory(Integer id, TrainingHistory trainingHistory);
}
