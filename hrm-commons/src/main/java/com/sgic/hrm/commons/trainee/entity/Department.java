package com.sgic.hrm.commons.trainee.entity;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department",schema="trainee")

public class Department implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7766090764871412095L;
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Integer id;
	private String departmentName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
}

