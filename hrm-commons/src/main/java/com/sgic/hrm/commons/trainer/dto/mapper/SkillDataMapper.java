package com.sgic.hrm.commons.trainer.dto.mapper;

//done by_Sujaany
import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.trainer.Skill;
import com.sgic.hrm.commons.trainer.dto.SkillData;

public class SkillDataMapper {
	public static Skill mapToSkill(SkillData skillData) {
		Skill skill = new Skill();
		if (skillData != null) {
			skill.setId(skillData.getId());
			skill.setSkill(skillData.getSkill());
		}
		return skill;
	}

	public static List<Skill> mapToSkillList(List<SkillData> skillDataList) {
		List<Skill> skillList = new ArrayList<Skill>();

		if (skillDataList != null) {
			for (SkillData skillData : skillDataList) {
				skillList.add(mapToSkill(skillData));
			}
		}
		return skillList;
	}
}
