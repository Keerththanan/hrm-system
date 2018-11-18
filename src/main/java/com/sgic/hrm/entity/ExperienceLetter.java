package com.sgic.hrm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "xpletter", schema = "xpletter")
public class ExperienceLetter {
	@Id
	Integer id;
	String name;
}
