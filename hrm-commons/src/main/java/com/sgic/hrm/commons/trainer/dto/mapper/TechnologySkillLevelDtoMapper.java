package com.sgic.hrm.commons.trainer.dto.mapper;

//done by_Sujaany
import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.trainer.TechnologySkillLevel;
import com.sgic.hrm.commons.trainer.dto.TechnologySkillLevelDto;

public class TechnologySkillLevelDtoMapper {
	public static TechnologySkillLevel mapToTechnologySkillLevel(TechnologySkillLevelDto technologySkillLevelDto) {
		TechnologySkillLevel technologySkillLevel = new TechnologySkillLevel();
		if (technologySkillLevelDto != null) {
			technologySkillLevel.setId(technologySkillLevelDto.getId());
			technologySkillLevel.setTechnology(technologySkillLevelDto.getTechnology());
			technologySkillLevel.setSkill(SkillDataMapper.mapToSkill(technologySkillLevelDto.getSkill()));
			technologySkillLevel.setLevel(technologySkillLevelDto.getLevel());
		}
		return technologySkillLevel;
	}

	public static List<TechnologySkillLevel> mapToTechnologySkillLevel(
			List<TechnologySkillLevelDto> technologySkillLevelDTOList) {
		if (technologySkillLevelDTOList != null) {
			List<TechnologySkillLevel> technologySkillLevelList = new ArrayList<TechnologySkillLevel>();
			for (TechnologySkillLevelDto technologySkillLevelDto : technologySkillLevelDTOList) {
				technologySkillLevelList.add(mapToTechnologySkillLevel(technologySkillLevelDto));
			}
			return technologySkillLevelList;
		}
		return null;
	}
}
