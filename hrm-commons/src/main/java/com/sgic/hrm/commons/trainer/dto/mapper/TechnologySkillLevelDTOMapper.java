package com.sgic.hrm.commons.trainer.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.trainer.TechnologySkillLevel;
import com.sgic.hrm.commons.trainer.dto.TechnologySkillLevelDTO;

public class TechnologySkillLevelDTOMapper {
	
	public static TechnologySkillLevel mapToTechnologySkillLevel(TechnologySkillLevelDTO technologySkillLevelDTO) {
		TechnologySkillLevel technologySkillLevel = new TechnologySkillLevel();
		if (technologySkillLevelDTO != null) {
			technologySkillLevel.setId(technologySkillLevelDTO.getId());
			technologySkillLevel.setTechnology(technologySkillLevelDTO.getTechnology());
			technologySkillLevel.setSkill(technologySkillLevelDTO.getSkill());
			technologySkillLevel.setLevel(technologySkillLevelDTO.getLevel());
		}
		return technologySkillLevel;
	}

	public static List<TechnologySkillLevel> mapToTerminationTypeDataList(
		      List<TechnologySkillLevelDTO> technologySkillLevelDTOList) {
		    
	
		    if (technologySkillLevelDTOList != null) {
		    	List<TechnologySkillLevel> technologySkillLevelList = new ArrayList<TechnologySkillLevel>();
		      for (TechnologySkillLevelDTO technologySkillLevelDTO : technologySkillLevelDTOList) {
		    	  technologySkillLevelList.add(mapToTechnologySkillLevel(technologySkillLevelDTO));
		      
		    }
		    return technologySkillLevelList;
		  
		}
		    return null;
	
	}
}

