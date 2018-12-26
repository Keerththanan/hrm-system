package com.sgic.hrm.commons.trainer.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.trainer.Availability;
import com.sgic.hrm.commons.trainer.dto.AvailabilityData;



public class AvailabilityDataToAvailability {
	
	public static Availability mapToAvailability(AvailabilityData availabilityData) {
		Availability availability = new Availability();
		if (availabilityData != null) {
			availability.setId(availabilityData.getId());
			availability.setTrainerName(availabilityData.getTrainerName());
			availability.setStartDate(availabilityData.getStartDate());
			availability.setEndDate(availabilityData.getEndDate());
			availability.setTime(availabilityData.getTime());
			availability.setScheduledTopic(availabilityData.getScheduledTopic());
			availability.setStatus(availabilityData.getStatus());
			
		}
		return availability;
	}
	
	public static List<Availability> mapAvailabilityDataList(List<AvailabilityData> availabilityDataList) {
		List<Availability> availability = new ArrayList<Availability>();

		if (availabilityDataList != null) {
			for (AvailabilityData availabilityData : availabilityDataList) {
				availability.add(mapToAvailability(availabilityData));
		      }
		    }
		    return availability;
	}



}
