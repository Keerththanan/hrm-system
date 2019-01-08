package com.sgic.hrm.commons.trainer.entity.mapper;
//done by daminiya
import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.trainer.TrainingSchedule;
import com.sgic.hrm.commons.trainer.dto.TrainingScheduleData;

public class TrainingScheduleToTrainingScheduleData {
	public static  TrainingScheduleData TrainingHistoryToTrainingHistoryData(TrainingSchedule trainingHistory) {
		TrainingScheduleData trainingHistoryData = new TrainingScheduleData();
		if (trainingHistory !=null) {
			trainingHistoryData.setId(trainingHistory.getId());
			trainingHistoryData.setTrainerName(trainingHistory.getTrainerName());
			trainingHistoryData.setTrainingTopic(trainingHistory.getTrainingTopic());
			trainingHistoryData.setTotalCoveredhours(trainingHistory.getTotalCoveredhours());
			trainingHistoryData.setDate(trainingHistory.getDate());
		}
		return trainingHistoryData;
	}
	
	
	public static List<TrainingScheduleData> TrainingHistoryToTrainingHistoryData(List<TrainingSchedule> trainingHistory) {
		List<TrainingScheduleData> trainingHistoryList = new ArrayList<TrainingScheduleData>();

		if (trainingHistory != null) {
			for (TrainingSchedule training : trainingHistory) {
				trainingHistoryList.add(TrainingHistoryToTrainingHistoryData(training));
			}
		}
		return trainingHistoryList;
	}


}
