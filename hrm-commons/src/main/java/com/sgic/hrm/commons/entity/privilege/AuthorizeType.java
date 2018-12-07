package com.sgic.hrm.commons.entity.privilege;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "authorize_type", schema = "employee")
public class AuthorizeType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
