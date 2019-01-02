package com.sgic.hrm.commons.dto.mapper.profile;

import com.sgic.hrm.commons.dto.profile.RolesAndResponsibilitySaveDto;
import com.sgic.hrm.commons.entity.Job;
import com.sgic.hrm.commons.entity.KeyActivity;
import com.sgic.hrm.commons.entity.Location;
import com.sgic.hrm.commons.entity.RolesAndResponsibilites;
import com.sgic.hrm.commons.entity.User;

public class RolesAndResponsibilitesDtoToRolesAndResponsibilites {
	public static RolesAndResponsibilites map(RolesAndResponsibilitySaveDto rolesAndResponsibilitySaveDto) {
		RolesAndResponsibilites rolesAndResponsibilites = new RolesAndResponsibilites();
		rolesAndResponsibilites.setOverAllPurpose(rolesAndResponsibilitySaveDto.getOverAllPurpose());
		rolesAndResponsibilites.setResponsibility(rolesAndResponsibilitySaveDto.getResponsibility());
		User user = new User();
		user.setId(rolesAndResponsibilitySaveDto.getUser());
		Location location = new Location();
		location.setId(rolesAndResponsibilitySaveDto.getLocation());
		KeyActivity keyActivity = new KeyActivity();
		keyActivity.setId(rolesAndResponsibilitySaveDto.getKeyActivity());
		Job job = new Job();
		job.setId(rolesAndResponsibilitySaveDto.getJob());
		return rolesAndResponsibilites;

	}

}
