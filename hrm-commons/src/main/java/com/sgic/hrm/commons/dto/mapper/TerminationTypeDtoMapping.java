package com.sgic.hrm.commons.dto.mapper;


import java.util.ArrayList;
import java.util.List;
import com.sgic.hrm.commons.dto.TerminationTypeDto;
import com.sgic.hrm.commons.entity.TerminationType;

public class TerminationTypeDtoMapping {
	
	public static TerminationTypeDto terminationTypeToTerminationTypeDto(TerminationType terminationType ) {
		TerminationTypeDto terminationTypeDto = new TerminationTypeDto();
		if (terminationType != null) {
			terminationTypeDto.setId(terminationType.getId());
			terminationTypeDto.setTerminationType(terminationType.getTerminationTypeValue());
			return terminationTypeDto;
		}
		return null;
	}
	
	public static List<TerminationTypeDto> terminationTypeToTerminationTypeDtoList(List<TerminationType> terminationTypeList) {
		List<TerminationTypeDto> TerminationTypeDto = new ArrayList<TerminationTypeDto>();

		if (terminationTypeList != null) {
			for (TerminationType terminationType : terminationTypeList) {
				TerminationTypeDto.add(terminationTypeToTerminationTypeDto(terminationType));
			}
			return TerminationTypeDto;
			
		}
		return null;
		
}
}
