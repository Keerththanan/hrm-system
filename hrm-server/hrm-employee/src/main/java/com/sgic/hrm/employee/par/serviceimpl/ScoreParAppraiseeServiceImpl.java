package com.sgic.hrm.employee.par.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.par.ReportParAppraise;
import com.sgic.hrm.commons.entity.par.ScoreParAppraisee;
import com.sgic.hrm.commons.repository.par.ScoreParAppraiseeRepository;
import com.sgic.hrm.employee.par.service.ScoreParAppraiseeService;

@Service
public class ScoreParAppraiseeServiceImpl implements ScoreParAppraiseeService {
	@Autowired
	ScoreParAppraiseeRepository scoreParAppraiseeRepo;

	@Override
	public void createScoreParAppraisee(ScoreParAppraisee scoreParAppraisee, ReportParAppraise reportParAppraise) {
		scoreParAppraisee.setReportParAppraise(reportParAppraise);
		scoreParAppraiseeRepo.save(scoreParAppraisee);

	}

}
