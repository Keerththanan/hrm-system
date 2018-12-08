package com.sgic.hrm.commons.repository.par;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.par.ReportParAppraisor;
import com.sgic.hrm.commons.entity.par.ScoreParAppraisor;

public interface ScoreParAppraisorRepository extends JpaRepository<ScoreParAppraisor, String> {

	List<ScoreParAppraisor> findScoreParAppraisorByReportParAppraisor(ReportParAppraisor reportParAppraisor);

}

