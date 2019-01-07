package com.sgic.hrm.commons.trainer.dto.mapper;
//done by daminiya
import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.trainer.TrainingSchedule;
import com.sgic.hrm.commons.trainer.dto.TrainingScheduleData;

public class TrainingScheduleDataToTrainingSchedule {

	public static TrainingSchedule TrainingHistoryDataToTrainingHistory(TrainingScheduleData trainingHistoryData) {
		TrainingSchedule trainingHistory = new TrainingSchedule();
		
			if (trainingHistoryData != null) {
				trainingHistory.setId(trainingHistoryData.getId());
				trainingHistory.setTrainerName(trainingHistoryData.getTrainerName());
				trainingHistory.setTotalCoveredhours(trainingHistoryData.getTotalCoveredhours());
				trainingHistory.setTrainingTopic(trainingHistoryData.getTrainingTopic());
				trainingHistory.setDate(trainingHistoryData.getDate());
				
			}

			return trainingHistory;             

		
	}
	
	
	  public static List<TrainingSchedule> mapToTrainingHistoryList(
	      List<TrainingScheduleData> trainingHistoryList) {
	    List<TrainingSchedule> trainingDto = new ArrayList<TrainingSchedule>();

	    if (trainingHistoryList != null) {
	      for (TrainingScheduleData trainingHistoryData :trainingHistoryList) {
	        trainingDto.add(TrainingHistoryDataToTrainingHistory(trainingHistoryData));
	      }
	    }
	    return trainingDto;
	  }


}
