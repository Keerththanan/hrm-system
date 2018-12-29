package com.sgic.hrm.commons.trainer.dto.mapper;
//done by daminiya
import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.trainer.TrainingHistory;
import com.sgic.hrm.commons.trainer.dto.TrainingHistoryData;

public class TrainingHistoryDataToTrainingHistory {

	public static TrainingHistory TrainingHistoryDataToTrainingHistory(TrainingHistoryData trainingHistoryData) {
		TrainingHistory trainingHistory = new TrainingHistory();
		
			if (trainingHistoryData != null) {
				trainingHistory.setId(trainingHistoryData.getId());
				trainingHistory.setTrainerName(trainingHistoryData.getTrainerName());
				trainingHistory.setTotalCoveredhours(trainingHistoryData.getTotalCoveredhours());
				trainingHistory.setTrainingTopic(trainingHistoryData.getTrainingTopic());
				trainingHistory.setDate(trainingHistoryData.getDate());
				
			}

			return trainingHistory;             

		
	}
	
	
	  public static List<TrainingHistory> mapToTrainingHistoryList(
	      List<TrainingHistoryData> trainingHistoryList) {
	    List<TrainingHistory> trainingDto = new ArrayList<TrainingHistory>();

	    if (trainingHistoryList != null) {
	      for (TrainingHistoryData trainingHistoryData :trainingHistoryList) {
	        trainingDto.add(TrainingHistoryDataToTrainingHistory(trainingHistoryData));
	      }
	    }
	    return trainingDto;
	  }


}
