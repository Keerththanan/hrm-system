package com.sgic.hrm.commons.dto.privilege;

import com.sgic.hrm.commons.entity.Role;
import com.sgic.hrm.commons.entity.privilege.AuthorizeType;
import com.sgic.hrm.commons.entity.privilege.Module;

public class PrivilegeDto {
	private Integer id;
	private Module module;
	private AuthorizeType authorizeType;
	private Role role;
	private boolean isEnabled;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public AuthorizeType getAuthorizeType() {
		return authorizeType;
	}

	public void setAuthorizeType(AuthorizeType authorizeType) {
		this.authorizeType = authorizeType;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

}
