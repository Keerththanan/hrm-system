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

import com.sgic.hrm.commons.dto.mapper.trainee.ProfessionalQualificationalDtoMapper;
import com.sgic.hrm.commons.dto.trainee.ProfessionalQualificationalDto;
import com.sgic.hrm.commons.dto.trainee.ProfessionalQualificationalSaveDto;
import com.sgic.hrm.commons.entity.mapper.trainee.ProfessionalQualificationalMapper;
import com.sgic.hrm.commons.entity.trainee.ProfessionalQualification;
import com.sgic.hrm.commons.entity.trainee.Trainee;
import com.sgic.hrm.trainee.service.ProfessionalQualificationService;
import com.sgic.hrm.trainee.service.TraineeService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class ProfessionalQualificationController {
	@Autowired
	private ProfessionalQualificationService professionalQualificationService;

	@Autowired
	private TraineeService traineeService;

	@GetMapping("/professionalQualification")
	public ResponseEntity<List<ProfessionalQualificationalDto>> getProfessionalQualification() {
		List<ProfessionalQualificationalDto> professionalQualificationalDtoList = ProfessionalQualificationalMapper
				.mapProfessionalQualificationListToProfessionalQulaificationalDtoList(
						professionalQualificationService.getAllProofessionalQualificstion());
		return new ResponseEntity<>(professionalQualificationalDtoList, HttpStatus.OK);
	}

	@GetMapping("/professionalQualification/{tid}")
	public ResponseEntity<List<ProfessionalQualificationalDto>> getProfessionalQualificationBytraineeId(
			@PathVariable("tid") Integer id) {
		List<ProfessionalQualificationalDto> professionalQualificationalDtoList = ProfessionalQualificationalMapper
				.mapProfessionalQualificationListToProfessionalQulaificationalDtoList(
						professionalQualificationService.getProfessionalQualificationByTraineeId(id));
		return new ResponseEntity<>(professionalQualificationalDtoList, HttpStatus.OK);

	}

	@PostMapping("/professionalQualification")
	public HttpStatus addProfessionalQualification(
			@RequestBody ProfessionalQualificationalSaveDto professionalQualificationalSaveDto) {
		Trainee trainee = traineeService.findTraineeById(professionalQualificationalSaveDto.getTrainee());
		ProfessionalQualification professionalQualification = ProfessionalQualificationalDtoMapper
				.mapProfessionalQualificationalSaveDtoToProfessionalQualification(professionalQualificationalSaveDto);
		boolean test = professionalQualificationService.addProfessionalQualification(professionalQualification,
				trainee);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}

	@PutMapping("/professionalQualification/{id}")
	public HttpStatus ModifyProfessionalQualiication(@PathVariable Integer id,
			@RequestBody ProfessionalQualificationalSaveDto professionalQualificationalSaveDto) {
		Trainee trainee = traineeService.findTraineeById(professionalQualificationalSaveDto.getTrainee());
		ProfessionalQualification professionalQualification = ProfessionalQualificationalDtoMapper
				.mapProfessionalQualificationalSaveDtoToProfessionalQualification(professionalQualificationalSaveDto);
		boolean editTest=professionalQualificationService.editProfessionalQualification(id, professionalQualification, trainee);
		if(editTest) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	@DeleteMapping("/professionalQualification/{id}")
	public HttpStatus DeleteProfessionalQualification(@PathVariable Integer id) {
		boolean test=professionalQualificationService.deleteProfessionalQualification(id);
		if(test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}
}
