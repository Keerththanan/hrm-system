package com.sgic.hrm.commons.entity.mapper.profile;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.profile.RolesAndResponsibilityDto;
import com.sgic.hrm.commons.entity.RolesAndResponsibilites;

public class RolesAndResponsibilityMapper {
	public static RolesAndResponsibilityDto mapRolesAndResponsibilitesToRolesAndResponsibilityDto(
			RolesAndResponsibilites rolesAndResponsibility) {
		RolesAndResponsibilityDto rolesAndResponsibilityDto = new RolesAndResponsibilityDto();

		rolesAndResponsibilityDto.setId(rolesAndResponsibility.getId());
		rolesAndResponsibilityDto.setJob(rolesAndResponsibility.getJob());
		rolesAndResponsibilityDto.setKeyActivity(rolesAndResponsibility.getKeyActivity());
		rolesAndResponsibilityDto.setLocation(rolesAndResponsibility.getLocation());
		rolesAndResponsibilityDto.setOverAllPurpose(rolesAndResponsibility.getOverAllPurpose());
		rolesAndResponsibilityDto.setResponsibility(rolesAndResponsibility.getResponsibility());
		rolesAndResponsibilityDto.setUser(rolesAndResponsibility.getUser());

		return rolesAndResponsibilityDto;

	}

	public static List<RolesAndResponsibilityDto> mapRolesAndResponsibilityListToRolesAndResponsibilityDtoList(List<RolesAndResponsibilites> rolesAndResponsibilityList){
		List<RolesAndResponsibilityDto> rolesAndResponsibilityDtoList=new ArrayList<RolesAndResponsibilityDto>();
		if(rolesAndResponsibilityList !=null) {
			for(RolesAndResponsibilites rolesAndResponsibility:rolesAndResponsibilityList)
				rolesAndResponsibilityDtoList.add(mapRolesAndResponsibilitesToRolesAndResponsibilityDto(rolesAndResponsibility));
		}
		return rolesAndResponsibilityDtoList;
	}
}