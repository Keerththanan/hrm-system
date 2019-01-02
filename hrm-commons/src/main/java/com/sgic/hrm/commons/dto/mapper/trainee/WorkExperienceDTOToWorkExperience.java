package com.sgic.hrm.commons.dto.mapper.trainee;

import com.sgic.hrm.commons.dto.trainee.WorkExperienceSaveDto;
import com.sgic.hrm.commons.entity.trainee.Trainee;
import com.sgic.hrm.commons.entity.trainee.TraineeWorkExperience;

public class WorkExperienceDTOToWorkExperience {
	
	public static TraineeWorkExperience map(WorkExperienceSaveDto workExperienceSaveDto) {
		TraineeWorkExperience traineeWorkExperience =new TraineeWorkExperience();
		Trainee trainee=new Trainee();
		traineeWorkExperience.setDesignation(workExperienceSaveDto.getDesignation());
		traineeWorkExperience.setId(workExperienceSaveDto.getId());
		traineeWorkExperience.setLeavingSalary(workExperienceSaveDto.getLeavingSalary());
		traineeWorkExperience.setPeriodYearFrom(workExperienceSaveDto.getPeriodYearFrom());
		traineeWorkExperience.setPeriodYearTo(workExperienceSaveDto.getPeriodYearTo());
		traineeWorkExperience.setReasonForLeaving(workExperienceSaveDto.getReasonForLeaving());
		traineeWorkExperience.setWorkName(workExperienceSaveDto.getWorkName());
		traineeWorkExperience.setWorkPlace(workExperienceSaveDto.getWorkPlace());
		traineeWorkExperience.setWorkType(workExperienceSaveDto.getWorkType());
		trainee.setId(workExperienceSaveDto.getTrainee());
		return traineeWorkExperience;
		
	}

}
