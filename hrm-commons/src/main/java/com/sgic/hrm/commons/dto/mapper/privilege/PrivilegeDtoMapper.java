package com.sgic.hrm.commons.dto.mapper.privilege;

import com.sgic.hrm.commons.dto.privilege.PrivilegeDto;
import com.sgic.hrm.commons.entity.privilege.Privilege;

public class PrivilegeDtoMapper {
	public static Privilege mapPrivilegeDtoToPrivilege(PrivilegeDto privilegeDto) {
		Privilege privilege = new Privilege();

		privilege.setId(privilegeDto.getId());
		privilege.setAuthorizeType(privilegeDto.getAuthorizeType());
		privilege.setModule(privilegeDto.getModule());
		privilege.setRole(privilegeDto.getRole());
		privilege.setEnabled(privilegeDto.isEnabled());

		return privilege;
	}
}
