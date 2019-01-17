package com.sgic.hrm.commons.entity.mapper.trainee;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.trainee.TraineeRefereeDto;
import com.sgic.hrm.commons.entity.trainee.TraineeReferee;

public class TraineeRefereeMapper {
	public static TraineeRefereeDto mapRefereeToRefereeDto(TraineeReferee traineeReferee) {
		TraineeRefereeDto traineeRefereeDto = new TraineeRefereeDto();
		traineeRefereeDto.setAddress(traineeReferee.getAddress());
		traineeRefereeDto.setContactNo(traineeReferee.getContactNo());
		traineeRefereeDto.setEmail(traineeReferee.getEmail());
		traineeRefereeDto.setId(traineeReferee.getId());
		traineeRefereeDto.setRefereeName(traineeReferee.getRefereeName());
		traineeRefereeDto.setRelationship(traineeReferee.getRelationship());
		traineeRefereeDto.setTrainee(traineeReferee.getTrainee());
		return traineeRefereeDto;
	}

	public static List<TraineeRefereeDto> mapRefereeListToRefereeDtoList(List<TraineeReferee> refereeList) {
		List<TraineeRefereeDto> refereeDtoList = new ArrayList<TraineeRefereeDto>();
		if (refereeDtoList != null) {
			for (TraineeReferee traineeReferee : refereeList)
				refereeDtoList.add(mapRefereeToRefereeDto(traineeReferee));

		}
		return refereeDtoList;
	}
}
