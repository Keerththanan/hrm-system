package com.sgic.hrm.employee.par.serviceCombinedImpl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.dto.mapper.par.ScoreParAppraiseeMapper;
import com.sgic.hrm.commons.dto.par.ReportParAppraiseeDtoPost;
import com.sgic.hrm.commons.dto.par.ScoreParAppraiseeDtoPost;
import com.sgic.hrm.commons.entity.par.Par;
import com.sgic.hrm.commons.entity.par.ReportParAppraise;
import com.sgic.hrm.employee.par.service.ParReportForAppraiseeService;
import com.sgic.hrm.employee.par.service.ParService;
import com.sgic.hrm.employee.par.service.ReportParAppraiseeService;
import com.sgic.hrm.employee.par.service.ScoreParAppraiseeService;

@Service
public class ParReportForAppraiseeServiceImpl implements ParReportForAppraiseeService {
	@Autowired
	ParService parservice;
	@Autowired
	ReportParAppraiseeService reportParAppraiseService;
	@Autowired
	ScoreParAppraiseeService scoreParAppraiseeService;

	@Override
	public void saveReportAndScore(Integer parId, List<ScoreParAppraiseeDtoPost> scoreParAppraiseeList,
			ReportParAppraise reportParAppraise) {

		if (parservice.findParById(parId) != null) {
			Par parObj = parservice.findParById(parId);
			reportParAppraiseService.createReportParAppraise(reportParAppraise, parObj);
			Iterator<ScoreParAppraiseeDtoPost> iteratorDTO = scoreParAppraiseeList.iterator();
			int i = 0;
			while (iteratorDTO.hasNext()) {
				String pk = reportParAppraise.getId() + "_" + i;
				scoreParAppraiseeService.createScoreParAppraisee(
						ScoreParAppraiseeMapper.dtoToEntity(pk, iteratorDTO.next()), reportParAppraise);
				i++;
			}

		}
	}

	@Override
	public String saveReportAndScore(ReportParAppraiseeDtoPost reportParAppraiseeDtoPost) {

		String msg = new String();
		ReportParAppraise reportParAppraise = new ReportParAppraise();
		reportParAppraise.setId(reportParAppraiseeDtoPost.getReportId());

		if (parservice.findParById(reportParAppraiseeDtoPost.getParId()) != null) {
			if (reportParAppraiseService.findReportParAppraiseeById(reportParAppraiseeDtoPost.getReportId()) == null) {

				Par parObj = parservice.findParById(reportParAppraiseeDtoPost.getParId());
				reportParAppraiseService.createReportParAppraise(reportParAppraise, parObj);
				Iterator<ScoreParAppraiseeDtoPost> iteratorDTO = reportParAppraiseeDtoPost.getScoreParAppraiseeList()
						.iterator();
				int i = 0;
				while (iteratorDTO.hasNext()) {
					String pk = reportParAppraise.getId() + "_" + i;
					scoreParAppraiseeService.createScoreParAppraisee(
							ScoreParAppraiseeMapper.dtoToEntity(pk, iteratorDTO.next()), reportParAppraise);
					i++;
				}
			} else {
				msg = "report id is already exist";
			}

		} else {
			msg = "par id is not found";
		}
		return msg;
	}

	@Override
	public boolean updateParScore() {

		return false;
	}

}
