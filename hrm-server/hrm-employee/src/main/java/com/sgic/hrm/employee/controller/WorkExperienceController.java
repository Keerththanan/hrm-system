package com.sgic.hrm.employee.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.dto.WorkExperienceDTO;
import com.sgic.hrm.commons.dto.mapper.WorkExperienceDTOToWorkExperience;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.entity.WorkExperience;
import com.sgic.hrm.employee.service.UserService;
import com.sgic.hrm.employee.service.WorkExperienceService;

@RestController
public class WorkExperienceController {
	@Autowired
	private WorkExperienceService workExperienceService;
	@Autowired
	private UserService userService;
	
	@GetMapping("/workexperience")
	public ResponseEntity<List<WorkExperience>> GetWorkExperience(){
		List<WorkExperience> workExperiences=workExperienceService.getAllWorkExperience();
		ResponseEntity<List<WorkExperience>>
		response=new ResponseEntity<>(workExperiences,HttpStatus.OK);
		return response;
	}
	@PostMapping("/workexperience")
	public HttpStatus createWorkExperience(@RequestBody WorkExperienceDTO workExperienceDTO)
	{
		User user=userService.findByUserId(workExperienceDTO.getUserId());
		WorkExperience workExperience = WorkExperienceDTOToWorkExperience.map(workExperienceDTO);
		boolean addtest= workExperienceService.addWorkExperience(workExperience, user);
		if(addtest) {
				return HttpStatus.CREATED;
			}
			return HttpStatus.BAD_REQUEST;
		
	}


	
}
