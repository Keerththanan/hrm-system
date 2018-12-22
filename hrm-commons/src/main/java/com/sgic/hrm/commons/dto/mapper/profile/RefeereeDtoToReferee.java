package com.sgic.hrm.commons.dto.mapper.profile;

import com.sgic.hrm.commons.dto.profile.RefereesSaveDto;
import com.sgic.hrm.commons.entity.Referee;
import com.sgic.hrm.commons.entity.User;

public class RefeereeDtoToReferee {
	public static Referee map(RefereesSaveDto refereesSaveDto) {
		Referee referee= new Referee();
		User user=new User();
		referee.setAddress(refereesSaveDto.getAddress());
		referee.setContactNo(refereesSaveDto.getContactNo());
		referee.setId(refereesSaveDto.getId());
		referee.setRefereeName(refereesSaveDto.getRefereeName());
		referee.setRelationship(refereesSaveDto.getRelationship());
		referee.setEmail(refereesSaveDto.getEmail());
		user.setId(refereesSaveDto.getUser());
		return referee;
		
	}
}
