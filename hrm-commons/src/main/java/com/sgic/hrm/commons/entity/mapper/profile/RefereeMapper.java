package com.sgic.hrm.commons.entity.mapper.profile;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.profile.RefereesDto;
import com.sgic.hrm.commons.entity.Referee;

public class RefereeMapper {
	public static RefereesDto mapRefereeToRefereeDto(Referee referee) {
		RefereesDto refereesDto=new RefereesDto();
		refereesDto.setAddress(referee.getAddress());
		refereesDto.setContactNo(referee.getContactNo());
		refereesDto.setEmail(referee.getEmail());
		refereesDto.setId(referee.getId());
		refereesDto.setRefereeName(referee.getRelationship());
		refereesDto.setRelationship(referee.getRelationship());
		refereesDto.setUser(referee.getUser());
		return refereesDto;
	}
	
	public static List<RefereesDto> mapRefereeListToRefereeDtoList(List<Referee>refereeList){
		List<RefereesDto>refereeDtoList=new ArrayList<RefereesDto>();
		if(refereeDtoList != null) {
			for(Referee referee:refereeList)
				refereeDtoList.add(mapRefereeToRefereeDto(referee));
			
		}
		return refereeDtoList;
	}
}
