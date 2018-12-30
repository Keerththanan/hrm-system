package com.sgic.hrm.commons.trainer.repository;
//done by daminiya
import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.trainer.TrainingHistory;

public interface TrainingHistoryRepository  extends JpaRepository<TrainingHistory, Integer>{

}
