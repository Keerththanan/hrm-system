package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.AcademicQualificationDTO;
import com.sgic.hrm.commons.entity.AcademicQualification;

public class AcademicQualificationDTOToAcademicQualification {
	public static AcademicQualification map(AcademicQualificationDTO academicQualificationDto)
	{
		AcademicQualification academicQualification = new AcademicQualification();
		academicQualification.setExaminationYear(academicQualificationDto.getExaminationYear());
		academicQualification.setCreatedAt(academicQualificationDto.getCreatedAt());
		academicQualification.setUpdatedAt(academicQualificationDto.getUpdatedAt());
		academicQualification.setPeriodYearFrom(academicQualificationDto.getPeriodYearFrom());
		academicQualification.setPeriodYearTo(academicQualificationDto.getPeriodYearTo());
		academicQualification.setResult(academicQualificationDto.getResult());
		academicQualification.setSchoolName(academicQualificationDto.getSchoolName());
		return academicQualification;
	}
}
