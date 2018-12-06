package com.sgic.hrm.commons.dto.mapper.privilege;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.privilege.PrivilegeDto;
import com.sgic.hrm.commons.entity.privilege.Privilege;

public class PrivilegeDtoMapper {
	public static Privilege mapPrivilegeDtoToPrivilege(PrivilegeDto privilegeDto) {
		Privilege privilege = new Privilege();

		privilege.setId(privilegeDto.getId());
		privilege.setPermission(privilegeDto.getPermission());
		privilege.setRole(privilegeDto.getRole());
		privilege.setEnabled(privilegeDto.isEnabled());

		return privilege;
	}

	public static List<Privilege> mapPrivilegeDtoListToPrivilegeList(List<PrivilegeDto> privilegeListDto) {
		List<Privilege> privilegeList = new ArrayList<Privilege>();

		if (privilegeListDto != null) {
			for (PrivilegeDto privilegeDto : privilegeListDto) {
				privilegeList.add(mapPrivilegeDtoToPrivilege(privilegeDto));
			}
		}
		return privilegeList;
	}
}
