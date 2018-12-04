package com.sgic.hrm.commons.dto.mapper.par;

import com.sgic.hrm.commons.dto.par.ScheduleParContentDtoPost;
import com.sgic.hrm.commons.entity.par.ScheduleParContent;

public class ScheduleParContentMapper {
	public static ScheduleParContent dtoToEntity(ScheduleParContentDtoPost scheduleParContentDtoPost) {
		ScheduleParContent scheduleParContent =new ScheduleParContent();
		scheduleParContent.setParContentId(scheduleParContentDtoPost.getParContentId());
		return scheduleParContent;
		
	}
	
	public static ScheduleParContentDtoPost entityToDto(ScheduleParContent scheduleParContent) {
		ScheduleParContentDtoPost scheduleParContentDtoPost =new ScheduleParContentDtoPost();
		scheduleParContentDtoPost.setParContentId(scheduleParContent.getParContentId());
		return scheduleParContentDtoPost;
		
	}

}