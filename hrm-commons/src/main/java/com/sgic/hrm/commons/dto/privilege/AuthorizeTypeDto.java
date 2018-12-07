package com.sgic.hrm.commons.dto.privilege;

public class AuthorizeTypeDto {
	private Integer id;
	private String authorizeTypeName;

	public Integer getId() {
		return id;
	}

	public String getAuthorizeTypeName() {
		return authorizeTypeName;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setAuthorizeTypeName(String authorizeTypeName) {
		this.authorizeTypeName = authorizeTypeName;
	}

}
