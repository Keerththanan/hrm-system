package com.sgic.hrm.commons.dto.mapper.trainee;

import com.sgic.hrm.commons.dto.trainee.ProfessionalMembershipDto;
import com.sgic.hrm.commons.dto.trainee.ProfessionalMembershipSaveDto;
import com.sgic.hrm.commons.entity.trainee.ProfessionalMembership;
import com.sgic.hrm.commons.entity.trainee.Trainee;

public class ProfessionalMembershipDtoMapper {
	public static ProfessionalMembership mapProfessionalMembershipSaveDtoToProfeesionalMembership(ProfessionalMembershipSaveDto professionalMembershipSaveDto) {
		ProfessionalMembership professionalMembership =new ProfessionalMembership();
		Trainee trainee=new Trainee();
		
		trainee.setId(professionalMembershipSaveDto.getId());
		professionalMembership.setAward(professionalMembershipSaveDto.getAward());
		professionalMembership.setEventName(professionalMembershipSaveDto.getEventName());
		professionalMembership.setEventType(professionalMembershipSaveDto.getEventType());
		professionalMembership.setId(professionalMembershipSaveDto.getId());
		professionalMembership.setOrganizationName(professionalMembershipSaveDto.getOrganizationName());
		professionalMembership.setPeriodYearFrom(professionalMembershipSaveDto.getPeriodYearFrom());
		professionalMembership.setPeriodYearTo(professionalMembershipSaveDto.getPeriodYearTo());
		professionalMembership.setTrainee(trainee);
		
		return professionalMembership;
		
	}
public static ProfessionalMembership mapProfessionalMembershipDtoToProfessionalMembership(ProfessionalMembershipDto professionalMembershipDto) {
	ProfessionalMembership professionalMembership =new ProfessionalMembership();
	
	professionalMembership.setAward(professionalMembershipDto.getAward());
	professionalMembership.setEventName(professionalMembershipDto.getEventName());
	professionalMembership.setEventType(professionalMembershipDto.getEventType());
	professionalMembership.setId(professionalMembershipDto.getId());
	professionalMembership.setOrganizationName(professionalMembership.getOrganizationName());
	professionalMembership.setPeriodYearFrom(professionalMembershipDto.getPeriodYearFrom());
	professionalMembership.setPeriodYearTo(professionalMembershipDto.getPeriodYearTo());
	professionalMembership.setTrainee(professionalMembershipDto.getTrainee());
	
	return professionalMembership;
	
}
}
