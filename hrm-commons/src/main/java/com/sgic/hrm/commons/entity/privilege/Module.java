package com.sgic.hrm.commons.entity.privilege;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name = "module", schema = "employee")
@JsonPropertyOrder({"id", "moduleName", "privilege"})
public class Module {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("moduleName")
	private String moduleName;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "module")
	@JsonIgnore
	@JsonProperty("privilege")
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
