package com.sgic.hrm.commons.dto.mapper.profile;

import com.sgic.hrm.commons.dto.profile.AcademicQualificationSaveDto;
import com.sgic.hrm.commons.entity.AcademicQualification;
import com.sgic.hrm.commons.entity.ExamType;
import com.sgic.hrm.commons.entity.User;

public class AcademicQualificationDTOToAcademicQualification {
	public static AcademicQualification map(AcademicQualificationSaveDto academicQualificationSaveDto)
	{
		AcademicQualification academicQualification = new AcademicQualification();
		User user= new User();
		ExamType examType = new ExamType();
		academicQualification.setExaminationYear(academicQualificationSaveDto.getExaminationYear());
		academicQualification.setCreatedAt(academicQualificationSaveDto.getCreatedAt());
		academicQualification.setUpdatedAt(academicQualificationSaveDto.getUpdatedAt());
		academicQualification.setPeriodYearFrom(academicQualificationSaveDto.getPeriodYearFrom());
		academicQualification.setPeriodYearTo(academicQualificationSaveDto.getPeriodYearTo());
		academicQualification.setResult(academicQualificationSaveDto.getResult());
		academicQualification.setSchoolName(academicQualificationSaveDto.getSchoolName());
		user.setId(academicQualificationSaveDto.getUser());
		examType.setId(academicQualificationSaveDto.getExamType());
		return academicQualification;
	}
}
