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

import com.sgic.hrm.commons.dto.mapper.profile.WorkExperienceDTOToWorkExperience;
import com.sgic.hrm.commons.dto.profile.WorkExperienceDto;
import com.sgic.hrm.commons.dto.profile.WorkExperienceSaveDto;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.entity.WorkExperience;
import com.sgic.hrm.commons.entity.mapper.profile.WorkExperienceMapper;
import com.sgic.hrm.profile.service.UserService;
import com.sgic.hrm.profile.service.WorkExperienceService;
@CrossOrigin(origins= "http://localhost:4200",maxAge=3600)
@RestController
public class WorkExperienceController {
	@Autowired
	private WorkExperienceService workExperienceService;

	@Autowired
	private UserService userService;

	@PostMapping("/workexperience")
	public HttpStatus addWorkExperience(@Valid @RequestBody WorkExperienceSaveDto workExperienceSaveDto) {
		User userobj=userService.findByUserId(workExperienceSaveDto.getUser());
		WorkExperience workExperience=WorkExperienceDTOToWorkExperience.map(workExperienceSaveDto);
		
		boolean test = workExperienceService.addWorkExperience(workExperience, userobj);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	
	@PutMapping("/workexperience/edit/{id}")
	public HttpStatus Modifyworkexperience(@PathVariable Integer id,@RequestBody WorkExperienceSaveDto workExperienceSaveDto) {
		User userObj=userService.findByUserId(workExperienceSaveDto.getUser());
		WorkExperience workExperience=WorkExperienceDTOToWorkExperience.map(workExperienceSaveDto);
		boolean test = workExperienceService.editWorkExperience(workExperience, userObj, id);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	
	@GetMapping("/workexperience")
	public ResponseEntity<List<WorkExperienceDto>> GetWorkExperience(){
		List<WorkExperienceDto> workExperienceDtoList=WorkExperienceMapper.mapWorkExperienceListToWorkExperienceDtoList(workExperienceService.getAllWorkExperience());
		return new ResponseEntity<>(workExperienceDtoList,HttpStatus.OK);
	}
	
	@GetMapping("/workexperience/{uid}")
	public  ResponseEntity<List<WorkExperienceDto>>GetworkExperiencesByUserId(@PathVariable("uid") Integer id)
	{
		List<WorkExperienceDto> 
		workExperienceDtoList =WorkExperienceMapper.mapWorkExperienceListToWorkExperienceDtoList( workExperienceService.getWorkExperienceByUserId(id));
		return new ResponseEntity<>(workExperienceDtoList,HttpStatus.OK);
	}
	
	@DeleteMapping("/workexperience/{id}")
	public HttpStatus DeleteWorkexperience(@PathVariable Integer id) {
		boolean test=workExperienceService.deleteWorkExperience(id);
		if(test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	
}
