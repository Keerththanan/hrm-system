package com.sgic.hrm.commons.entity.mapper.trainee;

import java.util.ArrayList;
import java.util.List;
import com.sgic.hrm.commons.dto.trainee.AcademicQualificationDto;
import com.sgic.hrm.commons.entity.trainee.TraineeAcademicQualification;


public class AcademicQualificationMapper {
	public static AcademicQualificationDto mapAcademicQualificationToAcademicQualificationDto(TraineeAcademicQualification traineeAcademicQualification) {
		AcademicQualificationDto academicQualificationDto=new AcademicQualificationDto();
		
		academicQualificationDto.setId(traineeAcademicQualification.getId());
		academicQualificationDto.setCreatedAt(traineeAcademicQualification.getCreatedAt());
		academicQualificationDto.setExaminationYear(traineeAcademicQualification.getExaminationYear());
		academicQualificationDto.setExamType(traineeAcademicQualification.getExamType());
		academicQualificationDto.setPeriodYearFrom(traineeAcademicQualification.getPeriodYearFrom());
		academicQualificationDto.setPeriodYearTo(traineeAcademicQualification.getPeriodYearTo());
		academicQualificationDto.setResult(traineeAcademicQualification.getResult());
		academicQualificationDto.setSchoolName(traineeAcademicQualification.getSchoolName());
		academicQualificationDto.setUpdatedAt(traineeAcademicQualification.getUpdatedAt());
		academicQualificationDto.setTrainee(traineeAcademicQualification.getTrainee());
		return academicQualificationDto;
		
	}
	
	public static List<AcademicQualificationDto> mapAcademicQualificationListToAcademicQualificationDtoList(List<TraineeAcademicQualification> academicQualificationList){
		List<AcademicQualificationDto> academicQualificationDtoList =new ArrayList<AcademicQualificationDto>();
		if(academicQualificationList !=null) {
			for(TraineeAcademicQualification traineeAcademicQualification:academicQualificationList)
				academicQualificationDtoList.add(mapAcademicQualificationToAcademicQualificationDto(traineeAcademicQualification));
		}
		return academicQualificationDtoList;
		
	}
}
