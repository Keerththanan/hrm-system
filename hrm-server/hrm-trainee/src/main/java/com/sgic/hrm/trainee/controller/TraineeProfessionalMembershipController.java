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

import com.sgic.hrm.commons.dto.mapper.trainee.TraineeProfessionalMembershipDtoMapper;
import com.sgic.hrm.commons.dto.trainee.TraineeProfessionalMembershipDto;
import com.sgic.hrm.commons.dto.trainee.TraineeProfessionalMembershipSaveDto;
import com.sgic.hrm.commons.entity.mapper.trainee.TraineeProfessionalMembershipMapper;
import com.sgic.hrm.commons.entity.trainee.TraineeProfessionalMembership;
import com.sgic.hrm.commons.entity.trainee.Trainee;
import com.sgic.hrm.trainee.service.TraineeProfessionalMembershipService;
import com.sgic.hrm.trainee.service.TraineeService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class TraineeProfessionalMembershipController {

	@Autowired
	private TraineeProfessionalMembershipService traineeProfessionalMembershipService;
	@Autowired
	private TraineeService traineeService;

	@GetMapping("/professionalMembership")
	public ResponseEntity<List<TraineeProfessionalMembershipDto>> getProfessionalMembership() {
		List<TraineeProfessionalMembershipDto> professionalMembershipDtoList = TraineeProfessionalMembershipMapper
				.mapProfessionalMembershipListToProfessionalMembershipDtoList(
						traineeProfessionalMembershipService.getAllProfessionalMembership());
		return new ResponseEntity<>(professionalMembershipDtoList, HttpStatus.OK);

	}

	@GetMapping("/professionalMembership/{tid}")
	public ResponseEntity<List<TraineeProfessionalMembershipDto>> getProfesionalMembershipByTraineeId(
			@PathVariable("tid") Integer id) {
		List<TraineeProfessionalMembershipDto> professionalMembershipDtoList = TraineeProfessionalMembershipMapper
				.mapProfessionalMembershipListToProfessionalMembershipDtoList(
						traineeProfessionalMembershipService.getProfessionalMembershipByTraineeId(id));
		return new ResponseEntity<>(professionalMembershipDtoList, HttpStatus.OK);

	}

	@PostMapping("/professionalMembership")
	public HttpStatus addProfessionalMembership(
			@RequestBody TraineeProfessionalMembershipSaveDto traineeProfessionalMembershipSaveDto) {
		Trainee trainee = traineeService.findTraineeById(traineeProfessionalMembershipSaveDto.getTrainee());
		TraineeProfessionalMembership traineeProfessionalMembership = TraineeProfessionalMembershipDtoMapper
				.mapProfessionalMembershipSaveDtoToProfeesionalMembership(traineeProfessionalMembershipSaveDto);
		boolean test = traineeProfessionalMembershipService.addProfessionalMembership(traineeProfessionalMembership, trainee);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}

	@PutMapping("/professionalMembership/{id}")
	public HttpStatus ModifyProfessionalMembership(@PathVariable Integer id,
			@RequestBody TraineeProfessionalMembershipSaveDto traineeProfessionalMembershipSaveDto) {
		Trainee trainee = traineeService.findTraineeById(traineeProfessionalMembershipSaveDto.getTrainee());
		TraineeProfessionalMembership traineeProfessionalMembership = TraineeProfessionalMembershipDtoMapper
				.mapProfessionalMembershipSaveDtoToProfeesionalMembership(traineeProfessionalMembershipSaveDto);
		boolean editTest = traineeProfessionalMembershipService.editProfessionalMembership(traineeProfessionalMembership, trainee,
				id);
		if (editTest) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	@DeleteMapping("/professionalMembership/{id}")
	public HttpStatus deleteProfessionalMembership(@PathVariable Integer id) {
		boolean test=traineeProfessionalMembershipService.deleteProfessionalMembership(id);
		if(test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}
}
