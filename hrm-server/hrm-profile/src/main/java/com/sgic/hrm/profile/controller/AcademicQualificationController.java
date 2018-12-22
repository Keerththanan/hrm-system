

package com.sgic.hrm.profile.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.dto.mapper.profile.AcademicQualificationDTOToAcademicQualification;
import com.sgic.hrm.commons.dto.profile.AcademicQualificationDto;
import com.sgic.hrm.commons.dto.profile.AcademicQualificationSaveDto;
import com.sgic.hrm.commons.entity.AcademicQualification;
import com.sgic.hrm.commons.entity.ExamType;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.entity.mapper.profile.AcademicQualificationMapper;
import com.sgic.hrm.profile.service.AcademicQualificationService;
import com.sgic.hrm.profile.service.ExamTypeService;
import com.sgic.hrm.profile.service.UserService;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class AcademicQualificationController{
	@Autowired
	private AcademicQualificationService academicQualificationService;
	@Autowired
	private UserService userService;
	@Autowired
	private ExamTypeService examTypeService;
	
	@PostMapping("/academicQualification")
	public HttpStatus addAcademicQualification(@Valid @RequestBody AcademicQualificationSaveDto academicQualificationSaveDto) {
		User userobj=userService.findByUserId(academicQualificationSaveDto.getUser());
		ExamType examTypeObj=examTypeService.findByExamTypeId(academicQualificationSaveDto.getExamType());
		AcademicQualification academicQualification=AcademicQualificationDTOToAcademicQualification.map(academicQualificationSaveDto);
		
		boolean test = academicQualificationService.addAcademicQualification(academicQualification, examTypeObj,userobj);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	
		@GetMapping("/academicQualification")
		public ResponseEntity <List<AcademicQualificationDto>> getAcademicQualification(){
			List<AcademicQualificationDto> academicQualificationDtoList = AcademicQualificationMapper.mapAcademicQualificationListToAcademicQualificationDtoList(academicQualificationService.getAllAcademicQualification());
			return new ResponseEntity<>(academicQualificationDtoList, HttpStatus.OK);
			
		}
		
		@GetMapping("/academicQualification/{uid}")
		public  ResponseEntity<List<AcademicQualificationDto>>findAcademicQualificationByUserId(@PathVariable("uid") Integer id)
		{
			List<AcademicQualificationDto> 
			academicQualificationDtoList = AcademicQualificationMapper.mapAcademicQualificationListToAcademicQualificationDtoList(academicQualificationService.getAcademicQualificationByUserId(id));
			return new ResponseEntity<>(academicQualificationDtoList,HttpStatus.OK);
		}

		
		@PutMapping("/academicQualification/edit/{id}")
		public HttpStatus editAcademicQualification(@PathVariable Integer id,@Valid @RequestBody AcademicQualificationSaveDto academicQualificationSaveDto) {
			ExamType examTypeObj=examTypeService.findByExamTypeId(academicQualificationSaveDto.getExamType());
			User userObj=userService.findByUserId(academicQualificationSaveDto.getUser());
			AcademicQualification academicQualification=AcademicQualificationDTOToAcademicQualification.map(academicQualificationSaveDto);
			boolean editTest=academicQualificationService.editAcademicQualification(academicQualification,examTypeObj,userObj, id);
			if(editTest) {
				return HttpStatus.ACCEPTED;
			}
			return HttpStatus.BAD_REQUEST;
		}
		
		@DeleteMapping("/academicQualification/{id}")
		public HttpStatus deleteAcademicQualification(@PathVariable Integer id) {
			boolean deleteTest=academicQualificationService.deleteAcademicQualification(id);
			if(deleteTest) {
				return HttpStatus.ACCEPTED;
			}
			return HttpStatus.BAD_REQUEST;
		}
	}
	

