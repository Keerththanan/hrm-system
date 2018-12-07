package com.sgic.hrm.commons.dto.mapper.privilege;

import com.sgic.hrm.commons.dto.privilege.PrivilegeDto;
import com.sgic.hrm.commons.dto.privilege.PrivilegeSaveDto;
import com.sgic.hrm.commons.entity.Role;
import com.sgic.hrm.commons.entity.privilege.Permission;
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
	
	public static Privilege mapPrivilegeSaveDtoToPrivilege(PrivilegeSaveDto privilegeSaveDto) {
		Privilege privilege = new Privilege();
		Permission permission = new Permission();
		Role role = new Role();
		
		permission.setId(privilegeSaveDto.getPermission());
		role.setId(privilegeSaveDto.getRole());
		
		privilege.setId(privilegeSaveDto.getId());
		privilege.setPermission(permission);
		privilege.setRole(role);
		privilege.setEnabled(privilegeSaveDto.isEnabled());
		
		return privilege;
	}
}
