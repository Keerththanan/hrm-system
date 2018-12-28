package com.sgic.hrm.commons.trainer.entity.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.trainer.TrainingHistory;
import com.sgic.hrm.commons.trainer.dto.TrainingHistoryData;

public class TrainingHistoryToTrainingHistoryData {
	public static  TrainingHistoryData TrainingHistoryToTrainingHistoryData(TrainingHistory trainingHistory) {
		TrainingHistoryData trainingHistoryData = new TrainingHistoryData();
		if (trainingHistory !=null) {
			trainingHistoryData.setId(trainingHistory.getId());
			trainingHistoryData.setTrainerName(trainingHistory.getTrainerName());
			trainingHistoryData.setTrainingTopic(trainingHistory.getTrainingTopic());
			trainingHistoryData.setTotalCoveredhours(trainingHistory.getTotalCoveredhours());
			trainingHistoryData.setDate(trainingHistory.getDate());
		}
		return trainingHistoryData;
	}
	
	
	

	public static List<TrainingHistoryData> TrainingHistoryToTrainingHistoryData(List<TrainingHistory> trainingHistory) {
		List<TrainingHistoryData> trainingHistoryList = new ArrayList<TrainingHistoryData>();

		if (trainingHistory != null) {
			for (TrainingHistory training : trainingHistory) {
				trainingHistoryList.add(TrainingHistoryToTrainingHistoryData(training));
			}
		}
		return trainingHistoryList;
	}


}
