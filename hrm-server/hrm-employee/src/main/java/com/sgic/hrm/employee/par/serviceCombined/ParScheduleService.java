package com.sgic.hrm.employee.par.serviceCombined;

import java.util.List;

import com.sgic.hrm.commons.dto.par.ScheduleParAppraisorsDTO;
import com.sgic.hrm.commons.dto.par.ScheduleParContentDTO;
import com.sgic.hrm.commons.dto.par.ScheduleParDTO;
import com.sgic.hrm.commons.entity.par.Par;



public interface ParScheduleService {

	/*
	 create entity in par
	 	par id
	 	emp id
	 	date
	 	time
	 save list of appraisors at parAppraisors table
	 	array of
	 	[par id
	 	apprasor id]
	 save list of par content
	 	array of
	 	[par id
	 	content id]
	 */
	
	public void createSchedulePar(Par par,
			List<ScheduleParAppraisorsDTO> scheduleParAppraisorList,
			List<ScheduleParContentDTO> scheduleParContentList);
	// get schedule par
	
		public ScheduleParDTO getSchedulePar(Integer parId);
		
		//add par content 
		// remove par content
		
		// add par appraisor
		
		// delete schedule par
}