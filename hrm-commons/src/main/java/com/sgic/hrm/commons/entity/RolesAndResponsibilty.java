package com.sgic.hrm.commons.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class RolesAndResponsibilty {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Integer id;
	@ManyToOne
	@JoinColumn(name="user_id")
	private User userId;
	
}
