package com.sgic.hrm.commons.entity.mapper.trainee;

import java.util.ArrayList;
import java.util.List;
import com.sgic.hrm.commons.dto.trainee.WorkExperienceDto;
import com.sgic.hrm.commons.entity.trainee.TraineeWorkExperience;


public class WorkExperienceMapper {
	public static WorkExperienceDto mapWorkExperienceToWorkExperienceDto(TraineeWorkExperience traineeWorkExperience) {
		WorkExperienceDto workExperienceDto=new WorkExperienceDto();
		workExperienceDto.setDesignation(traineeWorkExperience.getDesignation());
		workExperienceDto.setId(traineeWorkExperience.getId());
		workExperienceDto.setLeavingSalary(traineeWorkExperience.getLeavingSalary());
		workExperienceDto.setPeriodYearFrom(traineeWorkExperience.getPeriodYearFrom());
		workExperienceDto.setPeriodYearTo(traineeWorkExperience.getPeriodYearTo());
		workExperienceDto.setReasonForLeaving(traineeWorkExperience.getReasonForLeaving());
		workExperienceDto.setTrainee(traineeWorkExperience.getTrainee());
		workExperienceDto.setWorkName(traineeWorkExperience.getWorkName());
		workExperienceDto.setWorkPlace(traineeWorkExperience.getWorkPlace());
		workExperienceDto.setWorkType(traineeWorkExperience.getWorkType());
		return workExperienceDto;
	}
	
	public static List<WorkExperienceDto> mapWorkExperienceListToWorkExperienceDtoList(List<TraineeWorkExperience>workExperienceList){
		List<WorkExperienceDto>workExperienceDtoList=new ArrayList<WorkExperienceDto>();
		if(workExperienceDtoList != null) {
			for(TraineeWorkExperience traineeWorkExperience:workExperienceList)
				workExperienceDtoList.add(mapWorkExperienceToWorkExperienceDto(traineeWorkExperience));
		}
		return workExperienceDtoList;
	}
}
