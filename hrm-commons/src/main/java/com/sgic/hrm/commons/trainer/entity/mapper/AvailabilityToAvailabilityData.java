package com.sgic.hrm.commons.trainer.entity.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.trainer.Availability;
import com.sgic.hrm.commons.trainer.dto.AvailabilityData;



public class AvailabilityToAvailabilityData {
	public static AvailabilityData mapToAvailabilityData(Availability availability) {
		AvailabilityData availabilityData = new AvailabilityData();
		if (availability != null) {
			availabilityData.setId(availability.getId());
			availabilityData.setDate(availability.getDate());
			availabilityData.setTrainerId(TrainerMapper.maptoTrainerData(availability.getTrainerId()));
			
		}
		return availabilityData;

}
	
	public static List<AvailabilityData> mapToAvailabilityDataList(List<Availability> availabilityList) {
		List<AvailabilityData> availabilityDataList = new ArrayList<AvailabilityData>();

		if (availabilityDataList != null) {
			for (Availability availability : availabilityList) {
				availabilityDataList.add(mapToAvailabilityData(availability));
			}
		}
		return availabilityDataList;
	}

}
