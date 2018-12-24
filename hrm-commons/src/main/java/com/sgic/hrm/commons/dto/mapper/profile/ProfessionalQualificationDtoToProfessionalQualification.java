package com.sgic.hrm.commons.dto.mapper.profile;

import com.sgic.hrm.commons.dto.profile.ProfessionalQualificationSaveDto;
import com.sgic.hrm.commons.entity.ProfessionalQualification;
import com.sgic.hrm.commons.entity.User;

public class ProfessionalQualificationDtoToProfessionalQualification {

	public static ProfessionalQualification map(ProfessionalQualificationSaveDto professionalQualificationSaveDto) {
		
		ProfessionalQualification professionalQualification=new ProfessionalQualification();
		User user = new User();
		professionalQualification.setCourseName(professionalQualificationSaveDto.getCourseName());
		professionalQualification.setCourseType(professionalQualificationSaveDto.getCourseType());
		professionalQualification.setExaminationYear(professionalQualificationSaveDto.getExaminationYear());
		professionalQualification.setId(professionalQualificationSaveDto.getId());
		professionalQualification.setGpa(professionalQualificationSaveDto.getGpa());
		professionalQualification.setPeriodYearFrom(professionalQualificationSaveDto.getPeriodYearFrom());
		professionalQualification.setPeriodYearTo(professionalQualificationSaveDto.getPeriodYearTo());;
		professionalQualification.setResult(professionalQualificationSaveDto.getResult());
		professionalQualification.setInsituteName(professionalQualificationSaveDto.getInsituteName());
		user.setId(professionalQualificationSaveDto.getUser());
		return professionalQualification;
		
	}
}
