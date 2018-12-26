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
			availabilityData.setTrainerName(availability.getTrainerName());
			availabilityData.setStartDate(availability.getStartDate());
			availabilityData.setEndDate(availability.getEndDate());
			availabilityData.setTime(availability.getTime());
			availabilityData.setScheduledTopic(availability.getScheduledTopic());
			availabilityData.setStatus(availability.getStatus());
			
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
