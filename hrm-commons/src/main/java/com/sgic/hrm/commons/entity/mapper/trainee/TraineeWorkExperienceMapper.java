package com.sgic.hrm.commons.entity.mapper.trainee;

import java.util.ArrayList;
import java.util.List;
import com.sgic.hrm.commons.dto.trainee.TraineeWorkExperienceDto;
import com.sgic.hrm.commons.entity.trainee.TraineeWorkExperience;


public class TraineeWorkExperienceMapper {
	public static TraineeWorkExperienceDto mapWorkExperienceToWorkExperienceDto(TraineeWorkExperience traineeWorkExperience) {
		TraineeWorkExperienceDto traineeWorkExperienceDto=new TraineeWorkExperienceDto();
		traineeWorkExperienceDto.setDesignation(traineeWorkExperience.getDesignation());
		traineeWorkExperienceDto.setId(traineeWorkExperience.getId());
		traineeWorkExperienceDto.setLeavingSalary(traineeWorkExperience.getLeavingSalary());
		traineeWorkExperienceDto.setPeriodYearFrom(traineeWorkExperience.getPeriodYearFrom());
		traineeWorkExperienceDto.setPeriodYearTo(traineeWorkExperience.getPeriodYearTo());
		traineeWorkExperienceDto.setReasonForLeaving(traineeWorkExperience.getReasonForLeaving());
		traineeWorkExperienceDto.setTrainee(traineeWorkExperience.getTrainee());
		traineeWorkExperienceDto.setWorkName(traineeWorkExperience.getWorkName());
		traineeWorkExperienceDto.setWorkPlace(traineeWorkExperience.getWorkPlace());
		traineeWorkExperienceDto.setWorkType(traineeWorkExperience.getWorkType());
		return traineeWorkExperienceDto;
	}
	
	public static List<TraineeWorkExperienceDto> mapWorkExperienceListToWorkExperienceDtoList(List<TraineeWorkExperience>workExperienceList){
		List<TraineeWorkExperienceDto>workExperienceDtoList=new ArrayList<TraineeWorkExperienceDto>();
		if(workExperienceDtoList != null) {
			for(TraineeWorkExperience traineeWorkExperience:workExperienceList)
				workExperienceDtoList.add(mapWorkExperienceToWorkExperienceDto(traineeWorkExperience));
		}
		return workExperienceDtoList;
	}
}
