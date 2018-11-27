package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.RolesAndResponsibilityDto;
import com.sgic.hrm.commons.entity.RolesAndResponsibilites;

public class RolesAndResponsibilitesDtoToRolesAndResponsibilites {
	public static RolesAndResponsibilites map(RolesAndResponsibilityDto rolesAndResponsibilityDto) {
		RolesAndResponsibilites rolesAndResponsibilites=new RolesAndResponsibilites();
		
		rolesAndResponsibilites.setId(rolesAndResponsibilityDto.getId());
		rolesAndResponsibilites.setOverAllPurpose(rolesAndResponsibilityDto.getOverAllPurpose());
		rolesAndResponsibilites.setResponsibility(rolesAndResponsibilityDto.getResponsibility());
		return rolesAndResponsibilites;
		
	}

}
