package com.sgic.hrm.commons.trainer.entity.mapper;
//done by daminiya
import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.trainer.TrainingSchedule;
import com.sgic.hrm.commons.trainer.dto.TrainingScheduleData;

public class TrainingScheduleToTrainingScheduleData {
	public static  TrainingScheduleData TrainingScheduleToTrainingScheduleData(TrainingSchedule trainingSchedule) {
		TrainingScheduleData trainingScheduleData = new TrainingScheduleData();
		if (trainingSchedule !=null) {
			trainingScheduleData.setId(trainingSchedule.getId());
			trainingScheduleData.setTrainerName(trainingSchedule.getTrainerName());
			trainingScheduleData.setTrainingTopic(trainingSchedule.getTrainingTopic());
			trainingScheduleData.setTotalCoveredhours(trainingSchedule.getTotalCoveredhours());
			trainingScheduleData.setDate(trainingSchedule.getDate());
		}
		return trainingScheduleData;
	}
	
	
	public static List<TrainingScheduleData> TrainingScheduleToTrainingScheduleData(List<TrainingSchedule> trainingSchedule) {
		List<TrainingScheduleData> trainingScheduleList = new ArrayList<TrainingScheduleData>();

		if (trainingSchedule != null) {
			for (TrainingSchedule training : trainingSchedule) {
				trainingScheduleList.add(TrainingScheduleToTrainingScheduleData(training));
			}
		}
		return trainingScheduleList;
	}


}
