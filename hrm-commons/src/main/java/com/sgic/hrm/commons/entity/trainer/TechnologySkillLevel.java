package com.sgic.hrm.commons.entity.trainer;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="technology_skill_level" , schema="trainer")

public class TechnologySkillLevel implements Serializable {
	
	private static final long serialVersionUID = -3323930356795011743L;
		
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	
	private Integer id;
	private String technology;
	
	@ManyToOne
	@JoinColumn(name="skill_id")
	private Skill skill;
	
	private Integer level;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
}
