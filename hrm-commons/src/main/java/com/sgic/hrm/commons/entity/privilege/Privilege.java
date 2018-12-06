package com.sgic.hrm.commons.entity.privilege;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sgic.hrm.commons.entity.Role;

@Entity
@Table(name="privilege", schema="employee")
public class Privilege {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	private Permission permission;

	@ManyToOne
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
