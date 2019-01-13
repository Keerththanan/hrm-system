package com.sgic.hrm.commons.entity.mapper.trainee;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.trainee.TraineeProfessionalMembershipDto;
import com.sgic.hrm.commons.entity.trainee.TraineeProfessionalMembership;

public class TraineeProfessionalMembershipMapper {
	public static TraineeProfessionalMembershipDto mapProfessinalMembershipToProfessionalMembershipDto(
			TraineeProfessionalMembership traineeProfessionalMembership) {
		TraineeProfessionalMembershipDto traineeProfessionalMembershipDto = new TraineeProfessionalMembershipDto();

		traineeProfessionalMembershipDto.setId(traineeProfessionalMembership.getId());
		traineeProfessionalMembershipDto.setAward(traineeProfessionalMembership.getAward());
		traineeProfessionalMembershipDto.setEventName(traineeProfessionalMembership.getEventName());
		traineeProfessionalMembershipDto.setEventType(traineeProfessionalMembership.getEventType());
		traineeProfessionalMembershipDto.setOrganizationName(traineeProfessionalMembership.getOrganizationName());
		traineeProfessionalMembershipDto.setPeriodYearFrom(traineeProfessionalMembership.getPeriodYearFrom());
		traineeProfessionalMembershipDto.setPeriodYearTo(traineeProfessionalMembership.getPeriodYearTo());
		traineeProfessionalMembershipDto.setTrainee(traineeProfessionalMembership.getTrainee());

		return traineeProfessionalMembershipDto;
	}

	public static List<TraineeProfessionalMembershipDto> mapProfessionalMembershipListToProfessionalMembershipDtoList(
			List<TraineeProfessionalMembership> professionalMembershipList) {
		List<TraineeProfessionalMembershipDto> professionalMembershipDtoList = new ArrayList<TraineeProfessionalMembershipDto>();

		if (professionalMembershipList != null) {
			for (TraineeProfessionalMembership traineeProfessionalMembership : professionalMembershipList) {
				professionalMembershipDtoList
						.add(mapProfessinalMembershipToProfessionalMembershipDto(traineeProfessionalMembership));
			}
		}
		return professionalMembershipDtoList;
	}
}
