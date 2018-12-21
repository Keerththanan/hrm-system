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
import com.sgic.hrm.commons.dto.profile.WorkExperienceDTO;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.entity.WorkExperience;
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
	public HttpStatus addWorkExperience(@Valid @RequestBody WorkExperienceDTO workExperienceDTO) {
		User userobj=userService.findByUserId(workExperienceDTO.getUser());
		WorkExperience workExperience=WorkExperienceDTOToWorkExperience.map(workExperienceDTO);
		
		boolean test = workExperienceService.addWorkExperience(workExperience, userobj);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	@PutMapping("/workexperience/edit/{id}")
	public HttpStatus Modifyworkexperience(@PathVariable Integer id,@RequestBody WorkExperienceDTO workExperienceDTO) {
		User userObj=userService.findByUserId(workExperienceDTO.getUser());
		WorkExperience workExperience=WorkExperienceDTOToWorkExperience.map(workExperienceDTO);
		boolean test = workExperienceService.editWorkExperience(workExperience, userObj, id);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	@GetMapping("/workexperience")
	public ResponseEntity<List<WorkExperience>> GetWorkExperience(){
		List<WorkExperience> workExperiences=workExperienceService.getAllWorkExperience();
		ResponseEntity<List<WorkExperience>>
		response=new ResponseEntity<>(workExperiences,HttpStatus.OK);
		return response;
	}
	@GetMapping("/workexperience/{uid}")
	public  ResponseEntity<List<WorkExperience>>GetworkExperiencesByUserId(@PathVariable("uid") Integer id)
	{
		List<WorkExperience> 
		workExperiences = workExperienceService.getWorkExperienceByUserId(id);
		return new ResponseEntity<>(workExperiences,HttpStatus.OK);
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
