package com.sgic.hrm.employee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.entity.AcademicQualification;
import com.sgic.hrm.employee.service.AcademicQualificationService;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class AcademicQualificationController{
	@Autowired
	private AcademicQualificationService academicQualificationService;
	
	@PostMapping("/academicQualification")
	public HttpStatus createAcademicQualification(@Valid @RequestBody AcademicQualification academicqualification)
	{
		boolean test=academicQualificationService.addAcademicQualification(academicqualification);
				if (test) {
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
		@GetMapping("/academicQualification/{uid}")
		public  ResponseEntity<List<AcademicQualification>>findAcademicQualificationByUserId(@PathVariable("uid") Integer id)
		{
			List<AcademicQualification> 
			academicQualifications = academicQualificationService.getAcademicQualificationByUserId(id);
			return new ResponseEntity<>(academicQualifications,HttpStatus.OK);
		}

		
	
	
	}
	

