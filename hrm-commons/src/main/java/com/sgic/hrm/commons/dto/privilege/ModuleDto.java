package com.sgic.hrm.commons.dto.privilege;

import java.util.List;

import com.sgic.hrm.commons.entity.privilege.Privilege;

public class ModuleDto {
	private Integer id;
	private String moduleName;
	private List<Privilege> privileges;

	public Integer getId() {
		return id;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public List<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(List<Privilege> privileges) {
		this.privileges = privileges;
	}

}
