package com.sgic.hrm.commons.entity.privilege;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "permission", schema = "employee")
public class Permission {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	private AuthorizeType authorizeType;

	@ManyToOne
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
