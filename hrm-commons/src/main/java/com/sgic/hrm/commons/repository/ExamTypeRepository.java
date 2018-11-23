package com.sgic.hrm.commons.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.ExamType;
import com.sgic.hrm.commons.entity.User;



public interface ExamTypeRepository  extends JpaRepository<ExamType, Integer> {
	public ExamType findExamTypeById(Integer id);
}
