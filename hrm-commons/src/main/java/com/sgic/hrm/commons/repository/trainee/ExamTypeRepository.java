package com.sgic.hrm.commons.repository.trainee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sgic.hrm.commons.entity.trainee.ExamType;



@Repository
public interface ExamTypeRepository  extends JpaRepository<ExamType, Integer> {
	ExamType findExamTypeById(Integer id);

}
