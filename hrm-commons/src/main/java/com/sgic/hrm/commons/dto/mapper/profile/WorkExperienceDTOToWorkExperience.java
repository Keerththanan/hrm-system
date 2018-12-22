package com.sgic.hrm.commons.dto.mapper.profile;

import com.sgic.hrm.commons.dto.profile.WorkExperienceSaveDto;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.entity.WorkExperience;

public class WorkExperienceDTOToWorkExperience {
	
	public static WorkExperience map(WorkExperienceSaveDto workExperienceSaveDto) {
		WorkExperience workExperience =new WorkExperience();
		User user=new User();
		workExperience.setDesignation(workExperienceSaveDto.getDesignation());
		workExperience.setId(workExperienceSaveDto.getId());
		workExperience.setLeavingSalary(workExperienceSaveDto.getLeavingSalary());
		workExperience.setPeriodYearFrom(workExperienceSaveDto.getPeriodYearFrom());
		workExperience.setPeriodYearTo(workExperienceSaveDto.getPeriodYearTo());
		workExperience.setReasonForLeaving(workExperienceSaveDto.getReasonForLeaving());
		workExperience.setWorkName(workExperienceSaveDto.getWorkName());
		workExperience.setWorkPlace(workExperienceSaveDto.getWorkPlace());
		workExperience.setWorkType(workExperienceSaveDto.getWorkType());
		user.setId(workExperienceSaveDto.getUser());
		return workExperience;
		
	}

}
