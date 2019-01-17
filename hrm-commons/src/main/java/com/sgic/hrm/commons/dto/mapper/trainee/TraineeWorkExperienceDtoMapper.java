package com.sgic.hrm.commons.dto.mapper.trainee;

import com.sgic.hrm.commons.dto.trainee.TraineeWorkExperienceSaveDto;
import com.sgic.hrm.commons.entity.trainee.Trainee;
import com.sgic.hrm.commons.entity.trainee.TraineeWorkExperience;

public class TraineeWorkExperienceDtoMapper {

	public static TraineeWorkExperience map(TraineeWorkExperienceSaveDto traineeWorkExperienceSaveDto) {
		TraineeWorkExperience traineeWorkExperience = new TraineeWorkExperience();
		Trainee trainee = new Trainee();
		traineeWorkExperience.setDesignation(traineeWorkExperienceSaveDto.getDesignation());
		traineeWorkExperience.setId(traineeWorkExperienceSaveDto.getId());
		traineeWorkExperience.setLeavingSalary(traineeWorkExperienceSaveDto.getLeavingSalary());
		traineeWorkExperience.setPeriodYearFrom(traineeWorkExperienceSaveDto.getPeriodYearFrom());
		traineeWorkExperience.setPeriodYearTo(traineeWorkExperienceSaveDto.getPeriodYearTo());
		traineeWorkExperience.setReasonForLeaving(traineeWorkExperienceSaveDto.getReasonForLeaving());
		traineeWorkExperience.setWorkName(traineeWorkExperienceSaveDto.getWorkName());
		traineeWorkExperience.setWorkPlace(traineeWorkExperienceSaveDto.getWorkPlace());
		traineeWorkExperience.setWorkType(traineeWorkExperienceSaveDto.getWorkType());
		trainee.setId(traineeWorkExperienceSaveDto.getTrainee());
		return traineeWorkExperience;

	}

}
