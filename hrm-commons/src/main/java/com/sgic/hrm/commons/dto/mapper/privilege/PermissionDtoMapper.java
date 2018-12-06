package com.sgic.hrm.commons.dto.mapper.privilege;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.privilege.PermissionDto;
import com.sgic.hrm.commons.entity.privilege.Permission;

public class PermissionDtoMapper {
	
	public static Permission mapPermissionDtoToPermission(PermissionDto permissionDto) {
		Permission permission = new Permission();

		permission.setId(permissionDto.getId());
		permission.setPermissionName(permissionDto.getPermissionName());
		permission.setModule(permissionDto.getModule());

		return permission;
	}

	public static List<Permission> mapPermissionDtoListToPermissionList(List<PermissionDto> permissionDtoList) {
		List<Permission> permissionList = new ArrayList<Permission>();

		if (permissionDtoList != null) {
			for (PermissionDto permissionDto : permissionDtoList) {
				permissionList.add(mapPermissionDtoToPermission(permissionDto));
			}
		}
		return permissionList;
	}
}
