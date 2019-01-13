package com.sgic.hrm.commons.trainer.entity.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.trainer.TechnologySkillLevel;
import com.sgic.hrm.commons.trainer.dto.TechnologySkillLevelDto;

public class TechnologySkillLevelMapper {
	public static TechnologySkillLevelDto mapToTechnologySkillLevelDTO(TechnologySkillLevel technologySkillLevel) {
		TechnologySkillLevelDto technologySkillLevelDto = new TechnologySkillLevelDto();
		if (technologySkillLevel != null) {
			technologySkillLevelDto.setId(technologySkillLevel.getId());
			technologySkillLevelDto.setTechnology(technologySkillLevel.getTechnology());
			technologySkillLevelDto.setSkill(SkillMapper.mapToSkillDTO(technologySkillLevel.getSkill()));
			technologySkillLevelDto.setLevel(technologySkillLevel.getLevel());
		}
		return technologySkillLevelDto;
	}

	public static List<TechnologySkillLevelDto> mapToTechnologySkillLevelDTO(
		      List<TechnologySkillLevel> technologySkillLevelList) {
		    List<TechnologySkillLevelDto> technologySkillLevelDto = new ArrayList<TechnologySkillLevelDto>();
	
		    if (technologySkillLevelList != null) {
		      for (TechnologySkillLevel technologySkillLevel : technologySkillLevelList) {
		    	  technologySkillLevelDto.add(mapToTechnologySkillLevelDTO(technologySkillLevel));
		      }
		    }
		    return technologySkillLevelDto;
		  }
		}


