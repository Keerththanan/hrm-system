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

import com.sgic.hrm.commons.dto.mapper.profile.ProfessionalMembershipDtoToProfessionalMembership;
import com.sgic.hrm.commons.dto.profile.ProfessionalMembershipDto;
import com.sgic.hrm.commons.dto.profile.ProfessionalMembershipSaveDto;
import com.sgic.hrm.commons.entity.ProfessionalMembership;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.entity.mapper.profile.ProfessionalMembershipMapper;
import com.sgic.hrm.profile.service.ProfessionalMembershipService;
import com.sgic.hrm.profile.service.UserService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class ProfessionalMembershipController {
	@Autowired
	private ProfessionalMembershipService professionalMembershipService;

	@Autowired
	private UserService userService;

	@PostMapping("/professionalMembership")
	public HttpStatus addProfessionalMembership(
			@Valid @RequestBody ProfessionalMembershipSaveDto professionalMembershipSaveDto) {
		User userObj = userService.findByUserId(professionalMembershipSaveDto.getUser());
		ProfessionalMembership professionalMembership = ProfessionalMembershipDtoToProfessionalMembership
				.map(professionalMembershipSaveDto);
		boolean test = professionalMembershipService.addProfessionalMembership(professionalMembership, userObj);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	

	@GetMapping("/professionalMembership")
	public ResponseEntity<List<ProfessionalMembershipDto>> GetProfessionalMembership() {
		List<ProfessionalMembershipDto> professionalMembershipDtoList =ProfessionalMembershipMapper.mapProfessionalMembershipListToProfessionalMembershipDtoList(professionalMembershipService.getAllProfessionalMembership());
		return new ResponseEntity<>(professionalMembershipDtoList,HttpStatus.OK);

	}

	@PutMapping("/professionalMembership/edit/{id}")
	public HttpStatus ModifyProfessionalMembership(@PathVariable Integer id,
			@RequestBody ProfessionalMembershipSaveDto professionalMembershipSaveDto) {
		User userObj = userService.findByUserId(professionalMembershipSaveDto.getUser());
		ProfessionalMembership professionalMembership = ProfessionalMembershipDtoToProfessionalMembership
				.map(professionalMembershipSaveDto);
		boolean editTest = professionalMembershipService.editProfessionalMembership(professionalMembership,userObj, id);
		if (editTest) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}

	@DeleteMapping("/professionalMembership/{id}")
	public HttpStatus DeleteProfessionalMembership(@PathVariable Integer id) {
		boolean test = professionalMembershipService.deleteProfessionalMembership(id);
		if (test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}

	@GetMapping("/professionalMembership/{uid}")
	public ResponseEntity<List<ProfessionalMembershipDto>> findProfessionalMembershipByUserId(
			@PathVariable("uid") Integer id) {
		List<ProfessionalMembershipDto> professionalMembershipDtoList = ProfessionalMembershipMapper.mapProfessionalMembershipListToProfessionalMembershipDtoList(professionalMembershipService.getProfessionalMembershipByUserId(id));
		return new ResponseEntity<>(professionalMembershipDtoList, HttpStatus.OK);
	}
}
