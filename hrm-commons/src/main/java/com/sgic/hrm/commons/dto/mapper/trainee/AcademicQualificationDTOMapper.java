package com.sgic.hrm.commons.dto.mapper.trainee;

import com.sgic.hrm.commons.dto.trainee.AcademicQualificationSaveDto;
import com.sgic.hrm.commons.entity.trainee.TraineeAcademicQualification;
import com.sgic.hrm.commons.entity.trainee.ExamType;
import com.sgic.hrm.commons.entity.trainee.Trainee;

public class AcademicQualificationDTOMapper {
	public static TraineeAcademicQualification mapAcademicQualificationSaveDtoToAcademicQualification(AcademicQualificationSaveDto academicQualificationSaveDto)
	{
		TraineeAcademicQualification traineeAcademicQualification = new TraineeAcademicQualification();
		Trainee trainee= new Trainee();
		ExamType examType = new ExamType();
		traineeAcademicQualification.setExaminationYear(academicQualificationSaveDto.getExaminationYear());
		traineeAcademicQualification.setCreatedAt(academicQualificationSaveDto.getCreatedAt());
		traineeAcademicQualification.setUpdatedAt(academicQualificationSaveDto.getUpdatedAt());
		traineeAcademicQualification.setPeriodYearFrom(academicQualificationSaveDto.getPeriodYearFrom());
		traineeAcademicQualification.setPeriodYearTo(academicQualificationSaveDto.getPeriodYearTo());
		traineeAcademicQualification.setResult(academicQualificationSaveDto.getResult());
		traineeAcademicQualification.setSchoolName(academicQualificationSaveDto.getSchoolName());
		trainee.setId(academicQualificationSaveDto.getTrainee());
		examType.setId(academicQualificationSaveDto.getExamType());
		return traineeAcademicQualification;
	}
}
