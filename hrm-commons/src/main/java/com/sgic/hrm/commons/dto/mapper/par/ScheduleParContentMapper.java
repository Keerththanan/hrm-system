package com.sgic.hrm.commons.dto.mapper.par;

import com.sgic.hrm.commons.dto.par.ScheduleParContentDTO;
import com.sgic.hrm.commons.entity.par.ScheduleParContent;

public class ScheduleParContentMapper {
	public static ScheduleParContent dtoToEntity(ScheduleParContentDTO scheduleParContentDTO) {
		ScheduleParContent scheduleParContent =new ScheduleParContent();
		scheduleParContent.setParContentId(scheduleParContentDTO.getParContentId());
		return scheduleParContent;
		
	}
	
	public static ScheduleParContentDTO entityToDto(ScheduleParContent scheduleParContent) {
		ScheduleParContentDTO scheduleParContentDTO =new ScheduleParContentDTO();
		scheduleParContentDTO.setParContentId(scheduleParContent.getParContentId());
		return scheduleParContentDTO;
		
	}

}