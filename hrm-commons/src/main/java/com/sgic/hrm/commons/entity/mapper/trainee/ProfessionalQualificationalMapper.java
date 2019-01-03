package com.sgic.hrm.commons.entity.mapper.trainee;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.trainee.ProfessionalQualificationalDto;
import com.sgic.hrm.commons.entity.trainee.ProfessionalQualification;

public class ProfessionalQualificationalMapper {
	public static ProfessionalQualificationalDto mapProfessionalQualificationalToProfessionalQualificationalDto(
			ProfessionalQualification professionalQualification) {
		ProfessionalQualificationalDto professionalQualificationalDto = new ProfessionalQualificationalDto();

		professionalQualificationalDto.setId(professionalQualification.getId());
		professionalQualificationalDto.setCourseName(professionalQualification.getCourseName());
		professionalQualificationalDto.setCourseType(professionalQualification.getCourseType());
		professionalQualificationalDto.setExaminationYear(professionalQualification.getExaminationYear());
		professionalQualificationalDto.setGpa(professionalQualification.getGpa());
		professionalQualificationalDto.setInsituteName(professionalQualification.getInsituteName());
		professionalQualificationalDto.setPeriodYearFrom(professionalQualification.getPeriodYearFrom());
		professionalQualificationalDto.setPeriodYearTo(professionalQualification.getPeriodYearTo());
		professionalQualificationalDto.setResult(professionalQualification.getResult());
		professionalQualificationalDto.setTrainee(professionalQualification.getTrainee());

		return professionalQualificationalDto;
	}

	public static List<ProfessionalQualificationalDto> mapProfessionalQualificationListToProfessionalQulaificationalDtoList(
			List<ProfessionalQualification> professionalQualificationList) {
		List<ProfessionalQualificationalDto> professionalQualificationalDtoList = new ArrayList<ProfessionalQualificationalDto>();

		if (professionalQualificationList != null) {
			for (ProfessionalQualification professionalQualification : professionalQualificationList) {
				professionalQualificationalDtoList
						.add(mapProfessionalQualificationalToProfessionalQualificationalDto(professionalQualification));
			}
		}

		return professionalQualificationalDtoList;
	}
}
