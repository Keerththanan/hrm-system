package com.sgic.hrm.commons.entity.privilege;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sgic.hrm.commons.entity.Role;

@Entity
@Table(name = "privilege", schema = "employee")
@JsonPropertyOrder({"id", "authorizeType"})
public class Privilege {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("id")
	private Integer id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonProperty("authorizeType")
	private AuthorizeType authorizeType;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "module_id", nullable = false)
	private Module module;

	@ManyToOne(fetch = FetchType.EAGER)
	private Role role;
	private boolean isEnabled;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public AuthorizeType getAuthorizeType() {
		return authorizeType;
	}

	public void setAuthorizeType(AuthorizeType authorizeType) {
		this.authorizeType = authorizeType;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
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
