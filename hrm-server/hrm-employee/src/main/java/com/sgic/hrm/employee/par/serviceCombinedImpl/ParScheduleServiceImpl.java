package com.sgic.hrm.employee.par.serviceCombinedImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.dto.mapper.par.ScheduleParAppraisorsMapper;
import com.sgic.hrm.commons.dto.mapper.par.ScheduleParContentMapper;
import com.sgic.hrm.commons.dto.par.ScheduleParAppraisorsDtoPost;
import com.sgic.hrm.commons.dto.par.ScheduleParContentDtoPost;
import com.sgic.hrm.commons.dto.par.ScheduleParDtoPost;
import com.sgic.hrm.commons.entity.par.Par;
import com.sgic.hrm.commons.entity.par.ScheduleParAppraisor;
import com.sgic.hrm.commons.entity.par.ScheduleParContent;
import com.sgic.hrm.employee.par.service.ParService;
import com.sgic.hrm.employee.par.service.ScheduleParAppraisorService;
import com.sgic.hrm.employee.par.service.ScheduleParContentService;
import com.sgic.hrm.employee.par.serviceCombined.ParScheduleService;



@Service
public class ParScheduleServiceImpl implements ParScheduleService {

	@Autowired
	ParService parService;

	@Autowired
	ScheduleParAppraisorService scheduleParAppraisorService;

	@Autowired
	ScheduleParContentService scheduleParContentService;


	@Override
	public ScheduleParDtoPost getSchedulePar(Integer parId) {
		Par par = parService.findParById(parId);
		Iterator<ScheduleParAppraisor> iteratorScheduledAppraisor = scheduleParAppraisorService
				.findScheduleParAppraisorByParId(par).iterator();
	
		List<ScheduleParAppraisorsDtoPost> listScheduleParAppraisorDTO = new ArrayList<>();
		while (iteratorScheduledAppraisor.hasNext()) {

			listScheduleParAppraisorDTO.add(ScheduleParAppraisorsMapper.entityToDto(iteratorScheduledAppraisor.next()));
		}
		
		Iterator<ScheduleParContent> iteratorScheduleParContent = scheduleParContentService
				.findScheduleParContentByParId(par).iterator();
		List<ScheduleParContentDtoPost> listScheduleParContentDTO = new ArrayList<>();
		while (iteratorScheduleParContent.hasNext()) {
			listScheduleParContentDTO.add(ScheduleParContentMapper.entityToDto(iteratorScheduleParContent.next()));
		}

		ScheduleParDtoPost scheduleParDtoPost = new ScheduleParDtoPost();
		scheduleParDtoPost.setScheduleParAppraisorsList(listScheduleParAppraisorDTO);
		scheduleParDtoPost.setScheduleParContentList(listScheduleParContentDTO);
		return scheduleParDtoPost;
	}


	@Override
	public void createSchedulePar(Par par, List<ScheduleParAppraisorsDtoPost> scheduleParAppraisorList,
			List<ScheduleParContentDtoPost> scheduleParContentList) {
		// save par object
		parService.createPar(par);

		// save Appraisor List
		Iterator<ScheduleParAppraisorsDtoPost> iteratorScheduledAppraisor = scheduleParAppraisorList.iterator();
		while (iteratorScheduledAppraisor.hasNext()) {

			scheduleParAppraisorService.createScheduleParAppraisor(
					ScheduleParAppraisorsMapper.dtoToEntity(iteratorScheduledAppraisor.next()), par);
		}

		// save Content List
		Iterator<ScheduleParContentDtoPost> iteratorScheduledContent = scheduleParContentList.iterator();
		while (iteratorScheduledContent.hasNext()) {
			scheduleParContentService.createScheduleParContent(
					ScheduleParContentMapper.dtoToEntity(iteratorScheduledContent.next()), par);
		}
		
	}

}