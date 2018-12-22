package com.sgic.hrm.commons.entity.mapper.profile;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.profile.WorkExperienceDto;
import com.sgic.hrm.commons.entity.WorkExperience;

public class WorkExperienceMapper {
	public static WorkExperienceDto mapWorkExperienceToWorkExperienceDto(WorkExperience workExperience) {
		WorkExperienceDto workExperienceDto=new WorkExperienceDto();
		workExperienceDto.setDesignation(workExperience.getDesignation());
		workExperienceDto.setId(workExperience.getId());
		workExperienceDto.setLeavingSalary(workExperience.getLeavingSalary());
		workExperienceDto.setPeriodYearFrom(workExperience.getPeriodYearFrom());
		workExperienceDto.setPeriodYearTo(workExperience.getPeriodYearTo());
		workExperienceDto.setReasonForLeaving(workExperience.getReasonForLeaving());
		workExperienceDto.setUser(workExperience.getUser());
		workExperienceDto.setWorkName(workExperience.getWorkName());
		workExperienceDto.setWorkPlace(workExperience.getWorkPlace());
		workExperienceDto.setWorkType(workExperience.getWorkType());
		return workExperienceDto;
	}
	
	public static List<WorkExperienceDto> mapWorkExperienceListToWorkExperienceDtoList(List<WorkExperience>workExperienceList){
		List<WorkExperienceDto>workExperienceDtoList=new ArrayList<WorkExperienceDto>();
		if(workExperienceDtoList != null) {
			for(WorkExperience workExperience:workExperienceList)
				workExperienceDtoList.add(mapWorkExperienceToWorkExperienceDto(workExperience));
		}
		return workExperienceDtoList;
	}
}
