package com.sgic.hrm.commons.entity.mapper.privilege;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.privilege.PrivilegeDto;
import com.sgic.hrm.commons.entity.privilege.Privilege;

public class PrivilegeMapper {
	
	public static PrivilegeDto mapPrivilegeToPrivilegeDto(Privilege privilege) {
		PrivilegeDto privilegeDto = new PrivilegeDto();

		privilegeDto.setId(privilege.getId());
		privilegeDto.setAuthorizeType(privilege.getAuthorizeType());
		privilegeDto.setModule(privilege.getModule());
		privilegeDto.setRole(privilege.getRole());
		privilegeDto.setEnabled(privilege.isEnabled());

		return privilegeDto;
	}

	public static List<PrivilegeDto> mapPrivilegeListToPrivilegeDtoList(List<Privilege> privilegeList) {
		List<PrivilegeDto> privilegeDtoList = new ArrayList<PrivilegeDto>();

		if (privilegeList != null) {
			for (Privilege privilege : privilegeList) {
				privilegeDtoList.add(mapPrivilegeToPrivilegeDto(privilege));
			}
		}
		return privilegeDtoList;
	}

}
