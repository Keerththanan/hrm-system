package com.sgic.hrm.commons.trainer.dto.mapper;

//done by daminiya
import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.trainer.TrainingSchedule;
import com.sgic.hrm.commons.trainer.dto.TrainingScheduleData;

public class TrainingScheduleDataToTrainingSchedule {

	public static TrainingSchedule mapToTrainingSchedule(TrainingScheduleData trainingScheduleData) {
		TrainingSchedule trainingSchedule = new TrainingSchedule();

		if (trainingScheduleData != null) {
			trainingSchedule.setId(trainingScheduleData.getId());
        	trainingSchedule.setTotalCoveredhours(trainingScheduleData.getTotalCoveredhours());
			trainingSchedule.setTrainingTopic(trainingScheduleData.getTrainingTopic());
			trainingSchedule.setDate(trainingScheduleData.getDate());
			trainingSchedule.setStatus(trainingScheduleData.getStatus());
			trainingSchedule.setTrainer(UserTrainerDataMapper.mapToTrainer(trainingScheduleData.getTrainer()));

		}

		return trainingSchedule;

	}

	public static List<TrainingSchedule> mapToTrainingScheduleList(List<TrainingScheduleData> trainingScheduleList) {
		List<TrainingSchedule> trainingDto = new ArrayList<TrainingSchedule>();

		if (trainingScheduleList != null) {
			for (TrainingScheduleData trainingScheduleData : trainingScheduleList) {
				trainingDto.add(mapToTrainingSchedule(trainingScheduleData));
			}
		}
		return trainingDto;
	}

}
