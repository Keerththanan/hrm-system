package com.sgic.hrm.commons.dto.mapper.trainee;

import com.sgic.hrm.commons.dto.trainee.RefereeSaveDto;
import com.sgic.hrm.commons.entity.trainee.Referee;
import com.sgic.hrm.commons.entity.trainee.Trainee;

public class RefereeDtoToReferee {
	public static Referee map(RefereeSaveDto refereeSaveDto) {
		Referee referee = new Referee();
		Trainee trainee = new Trainee();
		referee.setAddress(refereeSaveDto.getAddress());
		referee.setContactNo(refereeSaveDto.getContactNo());
		referee.setId(refereeSaveDto.getId());
		referee.setRefereeName(refereeSaveDto.getRefereeName());
		referee.setRelationship(refereeSaveDto.getRelationship());
		referee.setEmail(refereeSaveDto.getEmail());
		trainee.setId(refereeSaveDto.getTrainee());
		return referee;

	}
}
