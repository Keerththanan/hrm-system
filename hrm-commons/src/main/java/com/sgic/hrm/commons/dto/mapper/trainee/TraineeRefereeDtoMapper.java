package com.sgic.hrm.commons.dto.mapper.trainee;

import com.sgic.hrm.commons.dto.trainee.TraineeRefereeSaveDto;
import com.sgic.hrm.commons.entity.trainee.TraineeReferee;
import com.sgic.hrm.commons.entity.trainee.Trainee;

public class TraineeRefereeDtoMapper {
	public static TraineeReferee map(TraineeRefereeSaveDto traineeRefereeSaveDto) {
		TraineeReferee traineeReferee = new TraineeReferee();
		Trainee trainee = new Trainee();
		traineeReferee.setAddress(traineeRefereeSaveDto.getAddress());
		traineeReferee.setContactNo(traineeRefereeSaveDto.getContactNo());
		traineeReferee.setId(traineeRefereeSaveDto.getId());
		traineeReferee.setRefereeName(traineeRefereeSaveDto.getRefereeName());
		traineeReferee.setRelationship(traineeRefereeSaveDto.getRelationship());
		traineeReferee.setEmail(traineeRefereeSaveDto.getEmail());
		trainee.setId(traineeRefereeSaveDto.getTrainee());
		return traineeReferee;

	}
}
