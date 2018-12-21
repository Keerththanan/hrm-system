package com.sgic.hrm.profile.controller;

import java.util.List;

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

import com.sgic.hrm.commons.dto.RolesAndResponsibilityDto;
import com.sgic.hrm.commons.dto.mapper.RolesAndResponsibilitesDtoToRolesAndResponsibilites;
import com.sgic.hrm.commons.entity.Job;
import com.sgic.hrm.commons.entity.KeyActivity;
import com.sgic.hrm.commons.entity.Location;
import com.sgic.hrm.commons.entity.RolesAndResponsibilites;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.profile.service.JobService;
import com.sgic.hrm.profile.service.KeyActivityService;
import com.sgic.hrm.profile.service.LocationService;
import com.sgic.hrm.profile.service.RolesAndResponsibilitiesService;
import com.sgic.hrm.profile.service.UserService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

@RestController
public class RolesAndResponsibilitesController {

	@Autowired
	private RolesAndResponsibilitiesService responsibilitiesService;
	@Autowired
	private JobService jobService;
	@Autowired
	private LocationService locationService;
	@Autowired
	private KeyActivityService keyActivityService;
	@Autowired
	private UserService userService;

	@PostMapping("/rolesandresponsibilities")
	public HttpStatus AddRolesAndResponsibilities(@RequestBody RolesAndResponsibilityDto rolesAndResponsibilityDto) {
		User userObj = userService.findByUserId(rolesAndResponsibilityDto.getUser());
		Job jobObj = jobService.findByJobId(rolesAndResponsibilityDto.getJob());
		Location locationObj = locationService.findByLocationId(rolesAndResponsibilityDto.getLocation());
		KeyActivity keyActivityObj = keyActivityService.findByActivityId(rolesAndResponsibilityDto.getKeyActivity());

		RolesAndResponsibilites rolesAndResponsibilites = RolesAndResponsibilitesDtoToRolesAndResponsibilites
				.map(rolesAndResponsibilityDto);

		boolean test = responsibilitiesService.addRolesAndResponsibilites(rolesAndResponsibilites, jobObj, userObj,
				keyActivityObj, locationObj);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}

	@PutMapping("/rolesandresponsibilities/edit/{id}")
	public HttpStatus ModifyRolesAndResponsibilities(@RequestBody RolesAndResponsibilityDto rolesAndResponsibilityDto,@PathVariable Integer id) {
		User userObj = userService.findByUserId(rolesAndResponsibilityDto.getUser());
		Job jobObj = jobService.findByJobId(rolesAndResponsibilityDto.getJob());
		Location locationObj = locationService.findByLocationId(rolesAndResponsibilityDto.getLocation());
		KeyActivity keyActivityObj = keyActivityService.findByActivityId(rolesAndResponsibilityDto.getKeyActivity());
		RolesAndResponsibilites rolesAndResponsibilitesObj = RolesAndResponsibilitesDtoToRolesAndResponsibilites.map(rolesAndResponsibilityDto);
		boolean test = responsibilitiesService.editRolesAndResponsibilites(rolesAndResponsibilitesObj,userObj,jobObj,locationObj,keyActivityObj, id);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	
	@GetMapping("/rolesandresponsibilities")
	public ResponseEntity<List<RolesAndResponsibilites>> GetRolesAndResponsibilities() {
		List<RolesAndResponsibilites> rolesAndResponsibilites = responsibilitiesService.getRolesAndResponsibilites();
		ResponseEntity<List<RolesAndResponsibilites>> responseEntity = new ResponseEntity<>(rolesAndResponsibilites,
				HttpStatus.OK);
		return responseEntity;
	}
	
	@GetMapping("/rolesandresponsibilities/{uid}")
	public  ResponseEntity<List<RolesAndResponsibilites>>findRolesAndResponsibilitesByUserId(@PathVariable("uid") Integer id)
	{
		List<RolesAndResponsibilites> 
		responseEntity = responsibilitiesService.getRolesAndResponsibilitesByUserId(id);
		return new ResponseEntity<>(responseEntity,HttpStatus.OK);
	}


	

	@DeleteMapping("/rolesandresponsibilities/{id}")
	public HttpStatus DeleteRolesAndResponsibilities(@PathVariable Integer id) {
		boolean test = responsibilitiesService.deleteRolesAndResponsibilites(id);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
}
