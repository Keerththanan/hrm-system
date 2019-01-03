package com.sgic.hrm.trainee.controller;

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

import com.sgic.hrm.commons.dto.mapper.trainee.RefereeDtoToReferee;
import com.sgic.hrm.commons.dto.trainee.RefereeDto;
import com.sgic.hrm.commons.dto.trainee.RefereeSaveDto;
import com.sgic.hrm.commons.entity.mapper.trainee.RefereeMapper;
import com.sgic.hrm.trainee.service.RefereeService;
import com.sgic.hrm.trainee.service.TraineeService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class RefereeController {
	@Autowired
	private RefereeService refereeService;
	@Autowired
	private TraineeService traineeService;

	@PostMapping("/referee")
	public HttpStatus addReferee(@Valid @RequestBody RefereeSaveDto refereesSaveDto) {
		if (refereeService.addReferee(RefereeDtoToReferee.map(refereesSaveDto),
				traineeService.findTraineeById(refereesSaveDto.getTrainee()))) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}

	@GetMapping("/referee")
	public ResponseEntity<List<RefereeDto>> getReferee() {
		return new ResponseEntity<>(RefereeMapper.mapRefereeListToRefereeDtoList(refereeService.getAllReferee()),
				HttpStatus.OK);
	}

	@PutMapping("/refereeedit/{id}")
	public HttpStatus editReferee(@RequestBody RefereeSaveDto refereesSaveDto, @PathVariable("id") Integer id) {
		boolean test = refereeService.editReferee(RefereeDtoToReferee.map(refereesSaveDto), id,
				traineeService.findTraineeById(refereesSaveDto.getTrainee()));
		if (test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;

	}

	@DeleteMapping("/referee/{id}")
	public HttpStatus deleteReferee(@PathVariable("id") Integer Id) {
		if (refereeService.deleteReferee(Id)) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}

	@GetMapping("/referee/{uid}")
	public ResponseEntity<List<RefereeDto>> findAcademicQualificationByUserId(@PathVariable("uid") Integer id) {
		return new ResponseEntity<>(
				RefereeMapper.mapRefereeListToRefereeDtoList(refereeService.getRefereeByTraineeId(id)), HttpStatus.OK);
	}
}
