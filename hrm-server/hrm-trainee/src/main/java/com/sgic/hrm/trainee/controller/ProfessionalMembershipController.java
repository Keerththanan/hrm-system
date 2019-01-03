package com.sgic.hrm.trainee.controller;

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

import com.sgic.hrm.commons.dto.mapper.trainee.ProfessionalMembershipDtoMapper;
import com.sgic.hrm.commons.dto.trainee.ProfessionalMembershipDto;
import com.sgic.hrm.commons.dto.trainee.ProfessionalMembershipSaveDto;
import com.sgic.hrm.commons.entity.mapper.trainee.ProfessionalMembershipMapper;
import com.sgic.hrm.commons.entity.trainee.ProfessionalMembership;
import com.sgic.hrm.commons.entity.trainee.Trainee;
import com.sgic.hrm.trainee.service.ProfessionalMembershipService;
import com.sgic.hrm.trainee.service.TraineeService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class ProfessionalMembershipController {

	@Autowired
	private ProfessionalMembershipService professionalMembershipService;
	@Autowired
	private TraineeService traineeService;

	@GetMapping("/professionalMembership")
	public ResponseEntity<List<ProfessionalMembershipDto>> getProfessionalMembership() {
		List<ProfessionalMembershipDto> professionalMembershipDtoList = ProfessionalMembershipMapper
				.mapProfessionalMembershipListToProfessionalMembershipDtoList(
						professionalMembershipService.getAllProfessionalMembership());
		return new ResponseEntity<>(professionalMembershipDtoList, HttpStatus.OK);

	}

	@GetMapping("/professionalMembership/{tid}")
	public ResponseEntity<List<ProfessionalMembershipDto>> getProfesionalMembershipByTraineeId(
			@PathVariable("tid") Integer id) {
		List<ProfessionalMembershipDto> professionalMembershipDtoList = ProfessionalMembershipMapper
				.mapProfessionalMembershipListToProfessionalMembershipDtoList(
						professionalMembershipService.getProfessionalMembershipByTraineeId(id));
		return new ResponseEntity<>(professionalMembershipDtoList, HttpStatus.OK);

	}

	@PostMapping("/professionalMembership")
	public HttpStatus addProfessionalMembership(
			@RequestBody ProfessionalMembershipSaveDto professionalMembershipSaveDto) {
		Trainee trainee = traineeService.findTraineeById(professionalMembershipSaveDto.getTrainee());
		ProfessionalMembership professionalMembership = ProfessionalMembershipDtoMapper
				.mapProfessionalMembershipSaveDtoToProfeesionalMembership(professionalMembershipSaveDto);
		boolean test = professionalMembershipService.addProfessionalMembership(professionalMembership, trainee);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}

	@PutMapping("/professionalMembership/{id}")
	public HttpStatus ModifyProfessionalMembership(@PathVariable Integer id,
			@RequestBody ProfessionalMembershipSaveDto professionalMembershipSaveDto) {
		Trainee trainee = traineeService.findTraineeById(professionalMembershipSaveDto.getTrainee());
		ProfessionalMembership professionalMembership = ProfessionalMembershipDtoMapper
				.mapProfessionalMembershipSaveDtoToProfeesionalMembership(professionalMembershipSaveDto);
		boolean editTest = professionalMembershipService.editProfessionalMembership(professionalMembership, trainee,
				id);
		if (editTest) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	@DeleteMapping("/professionalMembership/{id}")
	public HttpStatus deleteProfessionalMembership(@PathVariable Integer id) {
		boolean test=professionalMembershipService.deleteProfessionalMembership(id);
		if(test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}
}
