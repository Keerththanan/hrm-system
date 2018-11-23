package com.sgic.hrm.employee.service;

import java.util.List;

import com.sgic.hrm.commons.entity.Recruitment;


public interface RecruitmentService {
	 boolean addRecruitment(Recruitment recruitment);
	  
	   List<Recruitment> getAllRecruitment();
	   
	   boolean editRecruitment(Recruitment recruitment, Integer id);
	   
	   boolean deleteRecruitment(Integer id);
}
