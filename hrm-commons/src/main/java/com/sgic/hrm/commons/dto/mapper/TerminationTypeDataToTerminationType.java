package com.sgic.hrm.commons.dto.mapper;


import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.TerminationTypeData;
import com.sgic.hrm.commons.entity.TerminationType;

public class TerminationTypeDataToTerminationType {
	
	public static TerminationType mapToTerminationType(TerminationTypeData terminationTypeData ) {
		TerminationType terminationType = new TerminationType();
		if (terminationTypeData != null) {
			terminationType.setId(terminationTypeData.getId());
			terminationType.setTerminationTypeValue(terminationTypeData.getTerminationType());
			return terminationType;
		}
		return null;
	}
	
	public static List<TerminationType> mapToTerminationTypeDataList(List<TerminationTypeData> terminationTypeDataList) {
		List<TerminationType> TerminationType = new ArrayList<TerminationType>();

		if (terminationTypeDataList != null) {
			for (TerminationTypeData terminationTypeData : terminationTypeDataList) {
				TerminationType.add(mapToTerminationType(terminationTypeData));
			}
			return TerminationType;
			
		}
		return null;
		
}
}
