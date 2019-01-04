package com.sgic.hrm.commons.dto.mapper.trainee;

import com.sgic.hrm.commons.dto.trainee.TraineeProfessionalMembershipDto;
import com.sgic.hrm.commons.dto.trainee.TraineeProfessionalMembershipSaveDto;
import com.sgic.hrm.commons.entity.trainee.TraineeProfessionalMembership;
import com.sgic.hrm.commons.entity.trainee.Trainee;

public class TraineeProfessionalMembershipDtoMapper {
	public static TraineeProfessionalMembership mapProfessionalMembershipSaveDtoToProfeesionalMembership(TraineeProfessionalMembershipSaveDto traineeProfessionalMembershipSaveDto) {
		TraineeProfessionalMembership traineeProfessionalMembership =new TraineeProfessionalMembership();
		Trainee trainee=new Trainee();
		
		trainee.setId(traineeProfessionalMembershipSaveDto.getId());
		traineeProfessionalMembership.setAward(traineeProfessionalMembershipSaveDto.getAward());
		traineeProfessionalMembership.setEventName(traineeProfessionalMembershipSaveDto.getEventName());
		traineeProfessionalMembership.setEventType(traineeProfessionalMembershipSaveDto.getEventType());
		traineeProfessionalMembership.setId(traineeProfessionalMembershipSaveDto.getId());
		traineeProfessionalMembership.setOrganizationName(traineeProfessionalMembershipSaveDto.getOrganizationName());
		traineeProfessionalMembership.setPeriodYearFrom(traineeProfessionalMembershipSaveDto.getPeriodYearFrom());
		traineeProfessionalMembership.setPeriodYearTo(traineeProfessionalMembershipSaveDto.getPeriodYearTo());
		traineeProfessionalMembership.setTrainee(trainee);
		
		return traineeProfessionalMembership;
		
	}
public static TraineeProfessionalMembership mapProfessionalMembershipDtoToProfessionalMembership(TraineeProfessionalMembershipDto traineeProfessionalMembershipDto) {
	TraineeProfessionalMembership traineeProfessionalMembership =new TraineeProfessionalMembership();
	
	traineeProfessionalMembership.setAward(traineeProfessionalMembershipDto.getAward());
	traineeProfessionalMembership.setEventName(traineeProfessionalMembershipDto.getEventName());
	traineeProfessionalMembership.setEventType(traineeProfessionalMembershipDto.getEventType());
	traineeProfessionalMembership.setId(traineeProfessionalMembershipDto.getId());
	traineeProfessionalMembership.setOrganizationName(traineeProfessionalMembership.getOrganizationName());
	traineeProfessionalMembership.setPeriodYearFrom(traineeProfessionalMembershipDto.getPeriodYearFrom());
	traineeProfessionalMembership.setPeriodYearTo(traineeProfessionalMembershipDto.getPeriodYearTo());
	traineeProfessionalMembership.setTrainee(traineeProfessionalMembershipDto.getTrainee());
	
	return traineeProfessionalMembership;
	
}
}
