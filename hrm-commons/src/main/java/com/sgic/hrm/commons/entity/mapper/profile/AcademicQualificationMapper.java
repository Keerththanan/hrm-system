package com.sgic.hrm.commons.entity.mapper.profile;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.profile.AcademicQualificationDto;
import com.sgic.hrm.commons.entity.AcademicQualification;

public class AcademicQualificationMapper {
	public static AcademicQualificationDto mapAcademicQualificationToAcademicQualificationDto(AcademicQualification academicQualification) {
		AcademicQualificationDto academicQualificationDto=new AcademicQualificationDto();
		
		academicQualificationDto.setId(academicQualification.getId());
		academicQualificationDto.setCreatedAt(academicQualification.getCreatedAt());
		academicQualificationDto.setExaminationYear(academicQualification.getExaminationYear());
		academicQualificationDto.setExamType(academicQualification.getExamType());
		academicQualificationDto.setPeriodYearFrom(academicQualification.getPeriodYearFrom());
		academicQualificationDto.setPeriodYearTo(academicQualification.getPeriodYearTo());
		academicQualificationDto.setResult(academicQualification.getResult());
		academicQualificationDto.setSchoolName(academicQualification.getSchoolName());
		academicQualificationDto.setUpdatedAt(academicQualification.getUpdatedAt());
		academicQualificationDto.setUser(academicQualification.getUser());
		
		return academicQualificationDto;
		
	}
	
	public static List<AcademicQualificationDto> mapAcademicQualificationListToAcademicQualificationDtoList(List<AcademicQualification> academicQualificationList){
		List<AcademicQualificationDto> academicQualificationDtoList =new ArrayList<AcademicQualificationDto>();
		if(academicQualificationList !=null) {
			for(AcademicQualification academicQualification:academicQualificationList)
				academicQualificationDtoList.add(mapAcademicQualificationToAcademicQualificationDto(academicQualification));
		}
		return academicQualificationDtoList;
		
	}
}
