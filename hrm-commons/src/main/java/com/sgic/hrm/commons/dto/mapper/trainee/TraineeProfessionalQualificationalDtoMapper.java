package com.sgic.hrm.commons.dto.mapper.trainee;

import com.sgic.hrm.commons.dto.trainee.TraineeProfessionalQualificationalDto;
import com.sgic.hrm.commons.dto.trainee.TraineeProfessionalQualificationalSaveDto;
import com.sgic.hrm.commons.entity.trainee.TraineeProfessionalQualification;
import com.sgic.hrm.commons.entity.trainee.Trainee;

public class TraineeProfessionalQualificationalDtoMapper {

	public static TraineeProfessionalQualification mapProfessionalQualificationalSaveDtoToProfessionalQualification(
			TraineeProfessionalQualificationalSaveDto traineeProfessionalQualificationalSaveDto) {
		TraineeProfessionalQualification traineeProfessionalQualification = new TraineeProfessionalQualification();
		Trainee trainee = new Trainee();

		trainee.setId(traineeProfessionalQualificationalSaveDto.getId());

		traineeProfessionalQualification.setId(traineeProfessionalQualificationalSaveDto.getId());
		traineeProfessionalQualification.setCourseName(traineeProfessionalQualificationalSaveDto.getCourseName());
		traineeProfessionalQualification.setCourseType(traineeProfessionalQualificationalSaveDto.getCourseType());
		traineeProfessionalQualification
				.setExaminationYear(traineeProfessionalQualificationalSaveDto.getExaminationYear());
		traineeProfessionalQualification.setGpa(traineeProfessionalQualificationalSaveDto.getGpa());
		traineeProfessionalQualification.setInsituteName(traineeProfessionalQualificationalSaveDto.getInsituteName());
		traineeProfessionalQualification
				.setPeriodYearFrom(traineeProfessionalQualificationalSaveDto.getPeriodYearFrom());
		traineeProfessionalQualification.setPeriodYearTo(traineeProfessionalQualificationalSaveDto.getPeriodYearTo());
		traineeProfessionalQualification.setResult(traineeProfessionalQualificationalSaveDto.getResult());
		traineeProfessionalQualification.setTrainee(trainee);

		return traineeProfessionalQualification;

	}

	public static TraineeProfessionalQualification mapProfessionalQualificationalDtoToProfessionalQualification(
			TraineeProfessionalQualificationalDto traineeProfessionalQualificationalDto) {
		TraineeProfessionalQualification traineeProfessionalQualification = new TraineeProfessionalQualification();

		traineeProfessionalQualification.setId(traineeProfessionalQualificationalDto.getId());
		traineeProfessionalQualification.setCourseName(traineeProfessionalQualificationalDto.getCourseName());
		traineeProfessionalQualification.setCourseType(traineeProfessionalQualificationalDto.getCourseType());
		traineeProfessionalQualification.setExaminationYear(traineeProfessionalQualificationalDto.getExaminationYear());
		traineeProfessionalQualification.setGpa(traineeProfessionalQualificationalDto.getGpa());
		traineeProfessionalQualification.setInsituteName(traineeProfessionalQualificationalDto.getInsituteName());
		traineeProfessionalQualification.setPeriodYearFrom(traineeProfessionalQualificationalDto.getPeriodYearFrom());
		traineeProfessionalQualification.setPeriodYearTo(traineeProfessionalQualificationalDto.getPeriodYearTo());
		traineeProfessionalQualification.setResult(traineeProfessionalQualificationalDto.getResult());
		traineeProfessionalQualification.setTrainee(traineeProfessionalQualificationalDto.getTrainee());

		return traineeProfessionalQualification;

	}

}
