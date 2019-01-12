package com.sgic.hrm.trainer.service;

import java.util.List;

import com.sgic.hrm.commons.entity.trainer.Skill;

public interface SkillService {
	List<Skill> getAllSkill();

	boolean createSkill(Skill skill);

	boolean deleteSkill(Integer id);

	boolean updateSkill(Skill skill, Integer id);

	Skill getById(Integer id);
}
