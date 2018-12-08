//package com.sgic.hrm.commons.entity.mapper.privilege;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.sgic.hrm.commons.dto.privilege.PermissionDto;
//import com.sgic.hrm.commons.entity.privilege.Permission;
//
//public class PermissionMapper {
//	
//	public static PermissionDto mapPermissionToPermissionDto(Permission permission) {
//		PermissionDto permissionDto = new PermissionDto();
//
//		permissionDto.setId(permission.getId());
//		permissionDto.setAuthorizeType(permission.getAuthorizeType());
//		permissionDto.setModule(permission.getModule());
//		permissionDto.setPrivileges(permission.getPrivileges());
//
//		return permissionDto;
//	}
//
//	public static List<PermissionDto> mapPermissionListToPermissionDtoList(List<Permission> permissionList) {
//		List<PermissionDto> permissionDtoList = new ArrayList<>();
//
//		if (permissionList != null) {
//			for (Permission Permission : permissionList) {
//				permissionDtoList.add(mapPermissionToPermissionDto(Permission));
//			}
//		}
//		return permissionDtoList;
//	}
//
//}
