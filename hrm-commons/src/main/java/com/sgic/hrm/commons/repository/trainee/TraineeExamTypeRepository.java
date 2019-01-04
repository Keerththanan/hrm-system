package com.sgic.hrm.commons.repository.trainee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sgic.hrm.commons.entity.trainee.TraineeExamType;



@Repository
public interface TraineeExamTypeRepository  extends JpaRepository<TraineeExamType, Integer> {
	TraineeExamType findExamTypeById(Integer id);

}
