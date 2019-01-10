package com.sgic.hrm.commons.trainer.entity.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.trainer.Skill;
import com.sgic.hrm.commons.trainer.dto.SkillData;

public class SkillMapper {
	
	public static SkillData mapToSkillDTO(Skill skill) {
		SkillData skillData = new SkillData();
		if (skill != null) {
			skillData.setId(skill.getId());
			skillData.setSkill(skill.getSkill());
		}
		return skillData;

}
	
	  public static List<SkillData> mapToSkillDTOList(
    List<Skill> skillList) {
  List<SkillData> skillData = new ArrayList<SkillData>();

  if (skillList != null) {
    for (Skill skill : skillList) {
  	  skillData.add(mapToSkillDTO(skill));
    }
  }
  return skillData;
}
}
	

