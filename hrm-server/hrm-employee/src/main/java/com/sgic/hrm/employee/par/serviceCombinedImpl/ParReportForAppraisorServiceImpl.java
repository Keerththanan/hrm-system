package com.sgic.hrm.employee.par.serviceCombinedImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.dto.mapper.par.ScoreParAppraiserMapper;
import com.sgic.hrm.commons.dto.par.ParAppraisorDto;
import com.sgic.hrm.commons.dto.par.ReportParAppraiseeDtoGet;
import com.sgic.hrm.commons.dto.par.ReportParAppraisorDtoGet;
import com.sgic.hrm.commons.dto.par.ReportParAppraisorDtoPost;
import com.sgic.hrm.commons.dto.par.ScoreParAppraiseeDtoGet;
import com.sgic.hrm.commons.dto.par.ScoreParAppraiserDtoGet;
import com.sgic.hrm.commons.dto.par.ScoreParAppraiserDtoPost;
import com.sgic.hrm.commons.entity.par.Par;
import com.sgic.hrm.commons.entity.par.ParAppraisor;
import com.sgic.hrm.commons.entity.par.ParContent;
import com.sgic.hrm.commons.entity.par.ReportParAppraise;
import com.sgic.hrm.commons.entity.par.ReportParAppraisor;
import com.sgic.hrm.commons.entity.par.ScoreParAppraisee;
import com.sgic.hrm.commons.entity.par.ScoreParAppraisor;
import com.sgic.hrm.employee.par.service.ParAppraisorService;
import com.sgic.hrm.employee.par.service.ParContentService;
import com.sgic.hrm.employee.par.service.ParService;
import com.sgic.hrm.employee.par.service.ReportParAppraisorService;
import com.sgic.hrm.employee.par.service.ScoreParAppraisorService;
import com.sgic.hrm.employee.par.serviceCombined.ParReportForAppraisorService;

@Service
public class ParReportForAppraisorServiceImpl implements ParReportForAppraisorService {
	@Autowired
	ParService parService;
	@Autowired
	ReportParAppraisorService reportParAppraisorService;
	@Autowired
	ScoreParAppraisorService scoreParAppraisorService;
	@Autowired
	ParAppraisorService parAppraisorService;
	@Autowired
	ParContentService parContentService;

	@Override
	public void saveReportAndScoreAppraisor(Integer parId, ReportParAppraisor reportParAppraisor,
			List<ScoreParAppraisor> scoreParAppraisorList) {
		if (parService.findParById(parId) != null) {
			Par parObj = parService.findParById(parId);
			reportParAppraisorService.createReportParAppraise(reportParAppraisor, parObj);
			Iterator<ScoreParAppraisor> iterator = scoreParAppraisorList.iterator();
			while (iterator.hasNext()) {
				scoreParAppraisorService.createScoreParAppraisor(iterator.next(), reportParAppraisor);
			}

		}
	}

	@Override
	public String saveReportAndScoreAppraisor(ReportParAppraisorDtoPost reportParAppraisorDtoPost) {
		String msg = null;
		ReportParAppraisor reportParAppraisor = new ReportParAppraisor();
		// Mapping goes here
		reportParAppraisor.setId(reportParAppraisorDtoPost.getReportId());
		reportParAppraisor.setAppraisorId(reportParAppraisorDtoPost.getAppraisedById());
		reportParAppraisor.setAppraisedDate(reportParAppraisorDtoPost.getAppraisedDate());

		// sequence of steps goes here with proper validation
		if (parService.findParById(reportParAppraisorDtoPost.getParId()) != null) {
			if (reportParAppraisorService.findReportParAppraisorById(reportParAppraisorDtoPost.getReportId()) == null) {

				Par parObj = parService.findParById(reportParAppraisorDtoPost.getParId());
				reportParAppraisorService.createReportParAppraise(reportParAppraisor, parObj);
				Iterator<ScoreParAppraiserDtoPost> iteratorDTO = reportParAppraisorDtoPost.getScoreParAppraiserList()
						.iterator();
				int i = 0;
				while (iteratorDTO.hasNext()) {
					String pk = reportParAppraisor.getId() + "_" + i;
					ScoreParAppraiserDtoPost scoreParAppraiserDtoPost=iteratorDTO.next();
					ParContent parContent=parContentService.findParContentById(scoreParAppraiserDtoPost.getParContentId());
					scoreParAppraisorService.createScoreParAppraisor(
							ScoreParAppraiserMapper.dtoToEntity(pk, parContent,scoreParAppraiserDtoPost), reportParAppraisor);
					i++;
				}

				msg = "success";
			} else {
				msg = "report id is already exist";
			}

		} else {
			msg = "par id is not found";
		}
		return msg;
	}

	@Override
	public List<ReportParAppraisorDtoGet> getParReportForAppraiserByParId (Integer parId) {

		// find par by id
		Par par = parService.findParById(parId);
		// set the par id at dto

		// find the report by par id and the dto
		List<ReportParAppraisor> reportParAppraiserList = reportParAppraisorService.findReportParAppraiserByPar(par);
		
		List<ReportParAppraisorDtoGet> reportParAppraisorDtoGetList=new ArrayList<>();
		
		for (ReportParAppraisor reportParAppraisor : reportParAppraiserList) {
			ReportParAppraisorDtoGet reportParAppraisorDtoGet = new ReportParAppraisorDtoGet();
			//to be in mapper
			reportParAppraisorDtoGet.setParId(par.getId());
			reportParAppraisorDtoGet.setReportId(reportParAppraisor.getId());
			
			ParAppraisor parAppraisor=parAppraisorService.findParAppraisorByAppraiserId(reportParAppraisor.getAppraisorId());
			//to be in dto map appraisor
			ParAppraisorDto parAppraisorDto=new ParAppraisorDto();
			parAppraisorDto.setAppraiserId(parAppraisor.getAppraiserId());
			parAppraisorDto.setAppraiserEmpId(parAppraisor.getEmpId());
			parAppraisorDto.setAppraiserName(parAppraisor.getEmpName());
			
			reportParAppraisorDtoGet.setAppraisedBy(parAppraisorDto);
			
			reportParAppraisorDtoGet.setAppraisedDate(reportParAppraisor.getAppraisedDate());

			Iterator<ScoreParAppraisor> iteratorDTO = scoreParAppraisorService.getScore(reportParAppraisor).iterator();

		
			// dto score list
			List<ScoreParAppraiserDtoGet> scoreParAppraiserDtoGetList = new ArrayList<>();
//			
//			// loop to pull values and set to dto list
			while (iteratorDTO.hasNext()) {
				ScoreParAppraiserDtoGet scoreParAppraiserDtoGet = new ScoreParAppraiserDtoGet();

				ScoreParAppraisor scoreParAppraiser = iteratorDTO.next();

				// to be enhance more by finding method
				scoreParAppraiserDtoGet.setParContentId(scoreParAppraiser.getParContent().getId());
				scoreParAppraiserDtoGet.setParContentName(scoreParAppraiser.getParContent().getContentName());
				scoreParAppraiserDtoGet.setScore(scoreParAppraiser.getScore());

				scoreParAppraiserDtoGetList.add(scoreParAppraiserDtoGet);

			}
			reportParAppraisorDtoGet.setScoreParAppraiserList(scoreParAppraiserDtoGetList);
			reportParAppraisorDtoGetList.add(reportParAppraisorDtoGet);
			
		}

		return reportParAppraisorDtoGetList;
	}

}