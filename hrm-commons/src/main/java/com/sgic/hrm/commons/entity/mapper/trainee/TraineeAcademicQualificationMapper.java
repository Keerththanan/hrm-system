package com.sgic.hrm.commons.entity.mapper.trainee;

import java.util.ArrayList;
import java.util.List;
import com.sgic.hrm.commons.dto.trainee.TraineeAcademicQualificationDto;
import com.sgic.hrm.commons.entity.trainee.TraineeAcademicQualification;


public class TraineeAcademicQualificationMapper {
	public static TraineeAcademicQualificationDto mapAcademicQualificationToAcademicQualificationDto(TraineeAcademicQualification traineeAcademicQualification) {
		TraineeAcademicQualificationDto traineeAcademicQualificationDto=new TraineeAcademicQualificationDto();
		
		traineeAcademicQualificationDto.setId(traineeAcademicQualification.getId());
		traineeAcademicQualificationDto.setCreatedAt(traineeAcademicQualification.getCreatedAt());
		traineeAcademicQualificationDto.setExaminationYear(traineeAcademicQualification.getExaminationYear());
		traineeAcademicQualificationDto.setExamType(traineeAcademicQualification.getExamType());
		traineeAcademicQualificationDto.setPeriodYearFrom(traineeAcademicQualification.getPeriodYearFrom());
		traineeAcademicQualificationDto.setPeriodYearTo(traineeAcademicQualification.getPeriodYearTo());
		traineeAcademicQualificationDto.setResult(traineeAcademicQualification.getResult());
		traineeAcademicQualificationDto.setSchoolName(traineeAcademicQualification.getSchoolName());
		traineeAcademicQualificationDto.setUpdatedAt(traineeAcademicQualification.getUpdatedAt());
		traineeAcademicQualificationDto.setTrainee(traineeAcademicQualification.getTrainee());
		return traineeAcademicQualificationDto;
		
	}
	
	public static List<TraineeAcademicQualificationDto> mapAcademicQualificationListToAcademicQualificationDtoList(List<TraineeAcademicQualification> academicQualificationList){
		List<TraineeAcademicQualificationDto> academicQualificationDtoList =new ArrayList<TraineeAcademicQualificationDto>();
		if(academicQualificationList !=null) {
			for(TraineeAcademicQualification traineeAcademicQualification:academicQualificationList)
				academicQualificationDtoList.add(mapAcademicQualificationToAcademicQualificationDto(traineeAcademicQualification));
		}
		return academicQualificationDtoList;
		
	}
}
