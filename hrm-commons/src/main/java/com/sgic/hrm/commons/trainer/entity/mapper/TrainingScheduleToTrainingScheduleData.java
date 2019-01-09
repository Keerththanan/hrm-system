package com.sgic.hrm.commons.trainer.entity.mapper;
//done by daminiya
import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.trainer.TrainingSchedule;
import com.sgic.hrm.commons.trainer.dto.TrainingScheduleData;

public class TrainingScheduleToTrainingScheduleData {
	public static  TrainingScheduleData mapToTrainingScheduleData(TrainingSchedule trainingSchedule) {
		TrainingScheduleData trainingScheduleData = new TrainingScheduleData();
		if (trainingSchedule !=null) {
			trainingScheduleData.setId(trainingSchedule.getId());
			trainingScheduleData.setTrainingTopic(trainingSchedule.getTrainingTopic());
			trainingScheduleData.setTotalCoveredhours(trainingSchedule.getTotalCoveredhours());
			trainingScheduleData.setDate(trainingSchedule.getDate());
			trainingScheduleData.setStatus(trainingSchedule.getStatus());
			trainingScheduleData.setTrainer(TrainerMapper.maptoTrainerData(trainingSchedule.getTrainer()));
		}
		return trainingScheduleData;
	}
	
	
	public static List<TrainingScheduleData> mapToTrainingScheduleDataList(List<TrainingSchedule> trainingSchedule) {
		List<TrainingScheduleData> trainingScheduleList = new ArrayList<TrainingScheduleData>();

		if (trainingSchedule != null) {
			for (TrainingSchedule training : trainingSchedule) {
				trainingScheduleList.add(mapToTrainingScheduleData(training));
			}
		}
		return trainingScheduleList;
	}


}
