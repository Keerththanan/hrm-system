package com.sgic.hrm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "project", schema = "project")
public class Project {
	@Id
	Integer id;
	String project;
	

}
