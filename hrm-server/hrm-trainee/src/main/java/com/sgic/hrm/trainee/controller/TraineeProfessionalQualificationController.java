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

import com.sgic.hrm.commons.dto.mapper.trainee.TraineeProfessionalQualificationalDtoMapper;
import com.sgic.hrm.commons.dto.trainee.TraineeProfessionalQualificationalDto;
import com.sgic.hrm.commons.dto.trainee.TraineeProfessionalQualificationalSaveDto;
import com.sgic.hrm.commons.entity.mapper.trainee.TraineeProfessionalQualificationalMapper;
import com.sgic.hrm.commons.entity.trainee.TraineeProfessionalQualification;
import com.sgic.hrm.commons.entity.trainee.Trainee;
import com.sgic.hrm.trainee.service.TraineeProfessionalQualificationService;
import com.sgic.hrm.trainee.service.TraineeService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class TraineeProfessionalQualificationController {
	@Autowired
	private TraineeProfessionalQualificationService traineeProfessionalQualificationService;

	@Autowired
	private TraineeService traineeService;

	@GetMapping("/professionalQualification")
	public ResponseEntity<List<TraineeProfessionalQualificationalDto>> getProfessionalQualification() {
		List<TraineeProfessionalQualificationalDto> professionalQualificationalDtoList = TraineeProfessionalQualificationalMapper
				.mapProfessionalQualificationListToProfessionalQulaificationalDtoList(
						traineeProfessionalQualificationService.getAllProofessionalQualificstion());
		return new ResponseEntity<>(professionalQualificationalDtoList, HttpStatus.OK);
	}

	@GetMapping("/professionalQualification/{tid}")
	public ResponseEntity<List<TraineeProfessionalQualificationalDto>> getProfessionalQualificationBytraineeId(
			@PathVariable("tid") Integer id) {
		List<TraineeProfessionalQualificationalDto> professionalQualificationalDtoList = TraineeProfessionalQualificationalMapper
				.mapProfessionalQualificationListToProfessionalQulaificationalDtoList(
						traineeProfessionalQualificationService.getProfessionalQualificationByTraineeId(id));
		return new ResponseEntity<>(professionalQualificationalDtoList, HttpStatus.OK);

	}

	@PostMapping("/professionalQualification")
	public HttpStatus addProfessionalQualification(
			@RequestBody TraineeProfessionalQualificationalSaveDto traineeProfessionalQualificationalSaveDto) {
		Trainee trainee = traineeService.findTraineeById(traineeProfessionalQualificationalSaveDto.getTrainee());
		TraineeProfessionalQualification traineeProfessionalQualification = TraineeProfessionalQualificationalDtoMapper
				.mapProfessionalQualificationalSaveDtoToProfessionalQualification(traineeProfessionalQualificationalSaveDto);
		boolean test = traineeProfessionalQualificationService.addProfessionalQualification(traineeProfessionalQualification,
				trainee);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}

	@PutMapping("/professionalQualification/{id}")
	public HttpStatus ModifyProfessionalQualiication(@PathVariable Integer id,
			@RequestBody TraineeProfessionalQualificationalSaveDto traineeProfessionalQualificationalSaveDto) {
		Trainee trainee = traineeService.findTraineeById(traineeProfessionalQualificationalSaveDto.getTrainee());
		TraineeProfessionalQualification traineeProfessionalQualification = TraineeProfessionalQualificationalDtoMapper
				.mapProfessionalQualificationalSaveDtoToProfessionalQualification(traineeProfessionalQualificationalSaveDto);
		boolean editTest=traineeProfessionalQualificationService.editProfessionalQualification(id, traineeProfessionalQualification, trainee);
		if(editTest) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	@DeleteMapping("/professionalQualification/{id}")
	public HttpStatus DeleteProfessionalQualification(@PathVariable Integer id) {
		boolean test=traineeProfessionalQualificationService.deleteProfessionalQualification(id);
		if(test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}
}
