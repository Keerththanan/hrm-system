package com.sgic.hrm.employee.service;

import java.util.List;

import com.sgic.hrm.commons.entity.ExamType;

public interface ExamTypeService {
	boolean addExamType(ExamType examtype);
	List<ExamType>getAllExamType();
	public ExamType findExamTypeById(Integer id);
}
