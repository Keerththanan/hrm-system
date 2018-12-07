package com.sgic.hrm.commons.entity.privilege;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="module", schema="employee")
public class Module {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String moduleName;

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
}
