package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.profile.RolesAndResponsibilitySaveDto;
import com.sgic.hrm.commons.entity.Job;
import com.sgic.hrm.commons.entity.KeyActivity;
import com.sgic.hrm.commons.entity.Location;
import com.sgic.hrm.commons.entity.RolesAndResponsibilites;
import com.sgic.hrm.commons.entity.User;

public class RolesAndResponsibilitesDtoToRolesAndResponsibilites {
	public static RolesAndResponsibilites map(RolesAndResponsibilitySaveDto rolesAndResponsibilitySaveDto) {
		RolesAndResponsibilites rolesAndResponsibilites=new RolesAndResponsibilites();
		User user = new User();
		Location location = new Location();
		KeyActivity keyActivity = new KeyActivity();
		Job job =  new Job();
		rolesAndResponsibilites.setId(rolesAndResponsibilitySaveDto.getId());
		rolesAndResponsibilites.setOverAllPurpose(rolesAndResponsibilitySaveDto.getOverAllPurpose());
		rolesAndResponsibilites.setResponsibility(rolesAndResponsibilitySaveDto.getResponsibility());
		user.setId(rolesAndResponsibilitySaveDto.getUser());
		location.setId(rolesAndResponsibilitySaveDto.getLocation());
		keyActivity.setId(rolesAndResponsibilitySaveDto.getKeyActivity());
		job.setId(rolesAndResponsibilitySaveDto.getJob());
		return rolesAndResponsibilites;
		
	}

}
