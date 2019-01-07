package com.sgic.hrm.trainer.service;
//done by Daminiya
import java.util.List;

import com.sgic.hrm.commons.entity.trainer.TrainingSchedule;

public interface TrainingScheduleService {
	boolean addTrainingHistory(TrainingSchedule trainingHistory);

	List<TrainingSchedule> getAllTrainingHistory();

	boolean editTrainingHistory(TrainingSchedule trainingHistory);

	boolean deleteTrainingHistory(Integer id);

	TrainingSchedule getById(Integer id);

	TrainingSchedule getOneTrainingHistory(Integer id);

	boolean updateTrainingHistory(Integer id, TrainingSchedule trainingHistory);
}
