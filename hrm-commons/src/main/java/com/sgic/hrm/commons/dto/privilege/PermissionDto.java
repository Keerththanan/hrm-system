package com.sgic.hrm.commons.dto.privilege;

import com.sgic.hrm.commons.entity.privilege.Module;

public class PermissionDto {

	private Integer id;
	private String permissionName;
	private Module module;

	public Integer getId() {
		return id;
	}

	public String getPermissionName() {
		return permissionName;
	}

	public Module getModule() {
		return module;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	public void setModule(Module module) {
		this.module = module;
	}

}
