package com.sgic.hrm.commons.dto.mapper.par;

import com.sgic.hrm.commons.dto.par.ScheduleParAppraisorsDtoPost;
import com.sgic.hrm.commons.entity.par.ScheduleParAppraisor;

public class ScheduleParAppraisorsMapper {

	public static ScheduleParAppraisor dtoToEntity(ScheduleParAppraisorsDtoPost scheduleParAppraisorsDtoPost) {
		ScheduleParAppraisor scheduleParAppraisor=new ScheduleParAppraisor();
		scheduleParAppraisor.setAppraisor_id(scheduleParAppraisorsDtoPost.getAppraisorId());
		return scheduleParAppraisor;
	}
	
	public static ScheduleParAppraisorsDtoPost entityToDto(ScheduleParAppraisor scheduleParAppraisor) {
		ScheduleParAppraisorsDtoPost scheduleParAppraisorDTO=new ScheduleParAppraisorsDtoPost();
		scheduleParAppraisorDTO.setAppraisorId(scheduleParAppraisor.getAppraisor_id());
		
	
		return scheduleParAppraisorDTO;
	}
}