package com.sgic.hrm.commons.dto.mapper.trainee;

import com.sgic.hrm.commons.dto.trainee.TraineeAcademicQualificationSaveDto;
import com.sgic.hrm.commons.entity.trainee.TraineeAcademicQualification;
import com.sgic.hrm.commons.entity.trainee.TraineeExamType;
import com.sgic.hrm.commons.entity.trainee.Trainee;

public class TraineeAcademicQualificationDtoMapper {
	public static TraineeAcademicQualification mapAcademicQualificationSaveDtoToAcademicQualification(
			TraineeAcademicQualificationSaveDto traineeAcademicQualificationSaveDto) {
		TraineeAcademicQualification traineeAcademicQualification = new TraineeAcademicQualification();
		Trainee trainee = new Trainee();
		TraineeExamType traineeExamType = new TraineeExamType();
		traineeAcademicQualification.setExaminationYear(traineeAcademicQualificationSaveDto.getExaminationYear());
		traineeAcademicQualification.setCreatedAt(traineeAcademicQualificationSaveDto.getCreatedAt());
		traineeAcademicQualification.setUpdatedAt(traineeAcademicQualificationSaveDto.getUpdatedAt());
		traineeAcademicQualification.setPeriodYearFrom(traineeAcademicQualificationSaveDto.getPeriodYearFrom());
		traineeAcademicQualification.setPeriodYearTo(traineeAcademicQualificationSaveDto.getPeriodYearTo());
		traineeAcademicQualification.setResult(traineeAcademicQualificationSaveDto.getResult());
		traineeAcademicQualification.setSchoolName(traineeAcademicQualificationSaveDto.getSchoolName());
		trainee.setId(traineeAcademicQualificationSaveDto.getTrainee());
		traineeExamType.setId(traineeAcademicQualificationSaveDto.getExamType());
		return traineeAcademicQualification;
	}
}
