package com.sgic.hrm.commons.entity.mapper.trainee;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.trainee.TraineeProfessionalQualificationalDto;
import com.sgic.hrm.commons.entity.trainee.TraineeProfessionalQualification;

public class TraineeProfessionalQualificationalMapper {
	public static TraineeProfessionalQualificationalDto mapProfessionalQualificationalToProfessionalQualificationalDto(
			TraineeProfessionalQualification traineeProfessionalQualification) {
		TraineeProfessionalQualificationalDto traineeProfessionalQualificationalDto = new TraineeProfessionalQualificationalDto();

		traineeProfessionalQualificationalDto.setId(traineeProfessionalQualification.getId());
		traineeProfessionalQualificationalDto.setCourseName(traineeProfessionalQualification.getCourseName());
		traineeProfessionalQualificationalDto.setCourseType(traineeProfessionalQualification.getCourseType());
		traineeProfessionalQualificationalDto.setExaminationYear(traineeProfessionalQualification.getExaminationYear());
		traineeProfessionalQualificationalDto.setGpa(traineeProfessionalQualification.getGpa());
		traineeProfessionalQualificationalDto.setInsituteName(traineeProfessionalQualification.getInsituteName());
		traineeProfessionalQualificationalDto.setPeriodYearFrom(traineeProfessionalQualification.getPeriodYearFrom());
		traineeProfessionalQualificationalDto.setPeriodYearTo(traineeProfessionalQualification.getPeriodYearTo());
		traineeProfessionalQualificationalDto.setResult(traineeProfessionalQualification.getResult());
		traineeProfessionalQualificationalDto.setTrainee(traineeProfessionalQualification.getTrainee());

		return traineeProfessionalQualificationalDto;
	}

	public static List<TraineeProfessionalQualificationalDto> mapProfessionalQualificationListToProfessionalQulaificationalDtoList(
			List<TraineeProfessionalQualification> professionalQualificationList) {
		List<TraineeProfessionalQualificationalDto> professionalQualificationalDtoList = new ArrayList<TraineeProfessionalQualificationalDto>();

		if (professionalQualificationList != null) {
			for (TraineeProfessionalQualification traineeProfessionalQualification : professionalQualificationList) {
				professionalQualificationalDtoList.add(mapProfessionalQualificationalToProfessionalQualificationalDto(
						traineeProfessionalQualification));
			}
		}

		return professionalQualificationalDtoList;
	}
}
