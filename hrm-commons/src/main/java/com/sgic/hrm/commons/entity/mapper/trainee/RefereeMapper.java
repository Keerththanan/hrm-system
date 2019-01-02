package com.sgic.hrm.commons.entity.mapper.trainee;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.trainee.RefereeDto;
import com.sgic.hrm.commons.entity.trainee.Referee;

public class RefereeMapper {
	public static RefereeDto mapRefereeToRefereeDto(Referee referee) {
		RefereeDto refereeDto=new RefereeDto();
		refereeDto.setAddress(referee.getAddress());
		refereeDto.setContactNo(referee.getContactNo());
		refereeDto.setEmail(referee.getEmail());
		refereeDto.setId(referee.getId());
		refereeDto.setRefereeName(referee.getRelationship());
		refereeDto.setRelationship(referee.getRelationship());
		refereeDto.setTrainee(referee.getTrainee());
		return refereeDto;
	}
	
	public static List<RefereeDto> mapRefereeListToRefereeDtoList(List<Referee>refereeList){
		List<RefereeDto>refereeDtoList=new ArrayList<RefereeDto>();
		if(refereeDtoList != null) {
			for(Referee referee:refereeList)
				refereeDtoList.add(mapRefereeToRefereeDto(referee));
			
		}
		return refereeDtoList;
	}
}
