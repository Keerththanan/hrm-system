package com.sgic.hrm.commons.entity.mapper.profile;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.profile.ProfessionalMembershipDto;
import com.sgic.hrm.commons.entity.ProfessionalMembership;

public class ProfessionalMembershipMapper {
	public static ProfessionalMembershipDto mapProfessionalMembershipToProfessionalMembershipDto(ProfessionalMembership professionalMembership) {
		ProfessionalMembershipDto professionalMembershipDto =new ProfessionalMembershipDto();
		professionalMembershipDto.setId(professionalMembership.getId());
		professionalMembershipDto.setAward(professionalMembership.getAward());
		professionalMembershipDto.setEventName(professionalMembership.getEventName());
		professionalMembershipDto.setEventType(professionalMembership.getEventType());
		professionalMembershipDto.setOrganizationName(professionalMembership.getOrganizationName());
		professionalMembershipDto.setPeriodYearFrom(professionalMembership.getPeriodYearFrom());
		professionalMembershipDto.setPeriodYearTo(professionalMembership.getPeriodYearTo());
		professionalMembershipDto.setUser(professionalMembership.getUser());
		
		return professionalMembershipDto;
		
	}
	public static List<ProfessionalMembershipDto> mapProfessionalMembershipListToProfessionalMembershipDtoList(List<ProfessionalMembership> professionalMembershipList){
		List<ProfessionalMembershipDto> professionalMembershipDtoList=new ArrayList<ProfessionalMembershipDto>();
		if(professionalMembershipList !=null) {
			for(ProfessionalMembership professionalMembership:professionalMembershipList)
				professionalMembershipDtoList.add(mapProfessionalMembershipToProfessionalMembershipDto(professionalMembership));
		}
		return professionalMembershipDtoList;
	}
	
}
