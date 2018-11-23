package com.sgic.hrm.employee.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.dto.AcademicQualificationDTO;
import com.sgic.hrm.commons.dto.mapper.AcademicQualificationDTOToAcademicQualification;
import com.sgic.hrm.commons.entity.AcademicQualification;
import com.sgic.hrm.commons.entity.ExamType;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.employee.service.AcademicQualificationService;
import com.sgic.hrm.employee.service.ExamTypeService;
import com.sgic.hrm.employee.service.UserService;
@CrossOrigin(origins= "http://localhost:4200",maxAge=3600)
@RestController
public class AcademicQualificationController{
	@Autowired
	private AcademicQualificationService academicQualificationService;
	@Autowired
	private UserService userService;
	@Autowired
	private ExamTypeService examTypeService;
	
	@PostMapping("/academicQualification")
	public HttpStatus CreateAcademicQualification(@RequestBody AcademicQualificationDTO academicQualificationDTO)
	{
		User user=userService.findByUserId(academicQualificationDTO.getUserId());
		ExamType examType = examTypeService.findExamTypeById(academicQualificationDTO.getExamTypeId());
		AcademicQualification academicQualification = AcademicQualificationDTOToAcademicQualification.map(academicQualificationDTO);
		boolean addtest= academicQualificationService.addAcademicQualification(academicQualification, user, examType);
		if(addtest) {
				return HttpStatus.CREATED;
			}
			return HttpStatus.BAD_REQUEST;
	}

	
		@GetMapping("/academicQualification")
		public ResponseEntity <List<AcademicQualification>> getAcademicQualification()
		{
			List<AcademicQualification> academicquali = academicQualificationService.getAllAcademicQualification();
			return new ResponseEntity<>(academicquali, HttpStatus.OK);
			
		}
		
	
		
		
	
	}
	

