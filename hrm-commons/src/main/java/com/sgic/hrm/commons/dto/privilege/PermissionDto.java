package com.sgic.hrm.commons.dto.privilege;

import com.sgic.hrm.commons.entity.privilege.AuthorizeType;
import com.sgic.hrm.commons.entity.privilege.Module;

public class PermissionDto {

	private Integer id;
	private AuthorizeType authorizeType;
	private Module module;

	public Integer getId() {
		return id;
	}

	public AuthorizeType getAuthorizeType() {
		return authorizeType;
	}

	public Module getModule() {
		return module;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setAuthorizeType(AuthorizeType authorizeType) {
		this.authorizeType = authorizeType;
	}

	public void setModule(Module module) {
		this.module = module;
	}

}
