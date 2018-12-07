package com.sgic.hrm.commons.dto.privilege;

import com.sgic.hrm.commons.entity.Role;
import com.sgic.hrm.commons.entity.privilege.Permission;

public class PrivilegeDto {
	private Integer id;
	private Permission permission;
	private Role role;
	private boolean isEnabled;

	public Integer getId() {
		return id;
	}

	public Permission getPermission() {
		return permission;
	}

	public Role getRole() {
		return role;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

}
