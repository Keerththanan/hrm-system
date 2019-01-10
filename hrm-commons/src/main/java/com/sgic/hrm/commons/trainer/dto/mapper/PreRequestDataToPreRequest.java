package com.sgic.hrm.commons.trainer.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.trainer.PreRequest;
import com.sgic.hrm.commons.trainer.dto.PreRequestData;

public class PreRequestDataToPreRequest {
	public static PreRequest mapToPreRequest(PreRequestData preRequestData) {
		PreRequest preRequest=new PreRequest();
		if(preRequest!=null) {
			preRequest.setId(preRequestData.getId());
			preRequest.setLink(preRequestData.getLink());
			preRequest.setResource(preRequestData.getResource());
			preRequest.setResourceName(preRequestData.getResourceName());
			preRequest.setResourceType(preRequestData.getResourceType());
			preRequest.setTrainingSchedule(TrainingScheduleDataToTrainingSchedule.mapToTrainingSchedule(preRequestData.getTrainingSchedule()));
		}
		return preRequest;

		
	}
	
	
	public static List<PreRequest> mapToPreRequestList(List<PreRequestData> preRequestDataList){
		List<PreRequest> preRequest = new ArrayList<PreRequest>();
		if(preRequestDataList!=null) {
			for(PreRequestData preRequestData:preRequestDataList) {
				preRequest.add(mapToPreRequest(preRequestData));
			}
		}
		return preRequest;
	}

}
