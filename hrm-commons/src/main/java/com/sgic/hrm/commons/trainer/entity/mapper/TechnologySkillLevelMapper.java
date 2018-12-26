package com.sgic.hrm.commons.trainer.entity.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.trainer.TechnologySkillLevel;
import com.sgic.hrm.commons.trainer.dto.TechnologySkillLevelDTO;

public class TechnologySkillLevelMapper {
	public static TechnologySkillLevelDTO mapToTechnologySkillLevelDTO(TechnologySkillLevel technologySkillLevel) {
		TechnologySkillLevelDTO technologySkillLevelDTO = new TechnologySkillLevelDTO();
		if (technologySkillLevel != null) {
			technologySkillLevelDTO.setId(technologySkillLevel.getId());
			technologySkillLevelDTO.setTechnology(technologySkillLevel.getTechnology());
			technologySkillLevelDTO.setSkill(technologySkillLevel.getSkill());
			technologySkillLevelDTO.setLevel(technologySkillLevel.getLevel());
		}
		return technologySkillLevelDTO;
	}

	public static List<TechnologySkillLevelDTO> mapToTerminationTypeDataList(
		      List<TechnologySkillLevel> technologySkillLevelList) {
		    List<TechnologySkillLevelDTO> technologySkillLevelDTO = new ArrayList<TechnologySkillLevelDTO>();
	
		    if (technologySkillLevelList != null) {
		      for (TechnologySkillLevel technologySkillLevel : technologySkillLevelList) {
		    	  technologySkillLevelDTO.add(mapToTechnologySkillLevelDTO(technologySkillLevel));
		      }
		    }
		    return technologySkillLevelDTO;
		  }
		}


