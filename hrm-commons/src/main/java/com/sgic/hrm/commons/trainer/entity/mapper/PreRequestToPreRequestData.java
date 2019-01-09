package com.sgic.hrm.commons.trainer.entity.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.trainer.PreRequest;
import com.sgic.hrm.commons.trainer.dto.PreRequestData;

public class PreRequestToPreRequestData {
	public static PreRequestData mapToPreRequestData(PreRequest preRequest ) {
		PreRequestData preRequestData = new PreRequestData();
		if(preRequest!=null) {
			preRequestData.setId(preRequest.getId());
			preRequestData.setLink(preRequest.getLink());
			preRequestData.setResource(preRequest.getResource());
			preRequestData.setResourceName(preRequest.getResourceName());
			preRequestData.setTrainer(TrainerMapper.maptoTrainerData(preRequest.getTrainer()));
			preRequestData.setTrainingSchedule(TrainingScheduleToTrainingScheduleData
					.TrainingHistoryToTrainingHistoryData(preRequest.getTrainingSchedule()));
		}
		return preRequestData;
	}
	
	public static List<PreRequestData> mapToPreRequestDataList(List<PreRequest> preRequestList){
		List<PreRequestData> preRequestData = new ArrayList<PreRequestData>();
		if(preRequestList!=null) {
			for(PreRequest preRequest:preRequestList) {
				preRequestData.add(mapToPreRequestData(preRequest));
			}
		}
		return preRequestData;
	}
	
}

