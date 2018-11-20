package com.sgic.hrm.commons.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="user",schema="employee")
public class UserEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7848968070083039949L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private Integer user_id;
	@Column(name="user_name")
	private String user_name;
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="role_id")
	private RoleEntity role_id;
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public RoleEntity getRole_id() {
		return role_id;
	}
	public void setRole_id(RoleEntity role_id) {
		this.role_id = role_id;
	}
	
	

}
