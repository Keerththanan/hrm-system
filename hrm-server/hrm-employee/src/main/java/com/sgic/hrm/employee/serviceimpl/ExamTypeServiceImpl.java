package com.sgic.hrm.employee.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.ExamType;

import com.sgic.hrm.commons.repository.ExamTypeRepository;
import com.sgic.hrm.employee.service.ExamTypeService;


@Service
public class ExamTypeServiceImpl implements ExamTypeService{
	@Autowired
	private ExamTypeRepository examTypeRepository;
	
	

	@Override
	public List<ExamType> getAllExamType() {
		
		return examTypeRepository.findAll();
	}

	@Override
	public ExamType findExamTypeById(Integer id) {
		
		return examTypeRepository.findExamTypeById(id);
	}

	@Override
	public boolean addExamType(ExamType examtype) {
		// TODO Auto-generated method stub
		return false;
	}
	
}