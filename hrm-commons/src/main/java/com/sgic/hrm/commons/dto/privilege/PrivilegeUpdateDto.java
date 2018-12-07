package com.sgic.hrm.commons.dto.privilege;

import com.sgic.hrm.commons.enums.RoleName;

public class PrivilegeUpdateDto {

	private String authorizeName;
	private RoleName roleName;
	private String moduleName;
	private boolean isEnabled;

	public String getAuthorizeName() {
		return authorizeName;
	}

	public RoleName getRoleName() {
		return roleName;
	}

	public String getModuleName() {
		return moduleName;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setAuthorizeName(String authorizeName) {
		this.authorizeName = authorizeName;
	}

	public void setRoleName(RoleName roleName) {
		this.roleName = roleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

}
