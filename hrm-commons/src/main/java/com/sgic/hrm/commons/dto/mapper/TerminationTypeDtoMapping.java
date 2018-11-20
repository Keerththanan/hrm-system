package com.sgic.hrm.commons.dto.mapper;


import java.util.ArrayList;
import java.util.List;
import com.sgic.hrm.commons.dto.TerminationTypeData;
import com.sgic.hrm.commons.entity.TerminationType;

public class TerminationTypeDtoMapping {
	
	public static TerminationTypeData terminationTypeToTerminationTypeDto(TerminationType terminationType ) {
		TerminationTypeData terminationTypeDto = new TerminationTypeData();
		if (terminationType != null) {
			terminationTypeDto.setId(terminationType.getId());
			terminationTypeDto.setTerminationType(terminationType.getTerminationTypeValue());
			return terminationTypeDto;
		}
		return null;
	}
	
	public static List<TerminationTypeData> terminationTypeToTerminationTypeDtoList(List<TerminationType> terminationTypeList) {
		List<TerminationTypeData> TerminationTypeDto = new ArrayList<TerminationTypeData>();

		if (terminationTypeList != null) {
			for (TerminationType terminationType : terminationTypeList) {
				TerminationTypeDto.add(terminationTypeToTerminationTypeDto(terminationType));
			}
			return TerminationTypeDto;
			
		}
		return null;
		
}
}
