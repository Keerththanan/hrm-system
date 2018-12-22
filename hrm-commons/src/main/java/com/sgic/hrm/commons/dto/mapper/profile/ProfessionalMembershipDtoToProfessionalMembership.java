package com.sgic.hrm.commons.dto.mapper.profile;

import com.sgic.hrm.commons.dto.profile.ProfessionalMembershipSaveDto;
import com.sgic.hrm.commons.entity.ProfessionalMembership;
import com.sgic.hrm.commons.entity.User;

public class ProfessionalMembershipDtoToProfessionalMembership {

	public static ProfessionalMembership map(ProfessionalMembershipSaveDto professionalMembershipSaveDto ) {
		ProfessionalMembership professionalMembership=new ProfessionalMembership();
		User user=new User();
		professionalMembership.setAward(professionalMembershipSaveDto.getAward());
		professionalMembership.setEventName(professionalMembershipSaveDto.getEventName());
		professionalMembership.setEventType(professionalMembershipSaveDto.getEventType());
		professionalMembership.setId(professionalMembershipSaveDto.getId());
		professionalMembership.setOrganizationName(professionalMembershipSaveDto.getOrganizationName());
		professionalMembership.setPeriodYearFrom(professionalMembershipSaveDto.getPeriodYearFrom());
		professionalMembership.setPeriodYearTo(professionalMembershipSaveDto.getPeriodYearTo());
		user.setId(professionalMembershipSaveDto.getUser());
		return professionalMembership;
	}
}
