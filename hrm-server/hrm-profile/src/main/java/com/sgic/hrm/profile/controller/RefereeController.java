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

import com.sgic.hrm.commons.dto.mapper.profile.RefeereeDtoToReferee;
import com.sgic.hrm.commons.dto.profile.RefereesDto;
import com.sgic.hrm.commons.dto.profile.RefereesSaveDto;
import com.sgic.hrm.commons.entity.Referee;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.entity.mapper.profile.RefereeMapper;
import com.sgic.hrm.profile.service.RefereeService;
import com.sgic.hrm.profile.service.UserService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class RefereeController {
	@Autowired
	private RefereeService refereeService;
	@Autowired
	private UserService userService;

	@PostMapping("/referee")
	public HttpStatus addReferee(@Valid @RequestBody RefereesSaveDto refereesSaveDto) {
		User userObj = userService.findByUserId(refereesSaveDto.getUser());
		Referee referee = RefeereeDtoToReferee.map(refereesSaveDto);
		boolean test = refereeService.addReferee(referee, userObj);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}

	@GetMapping("/referee")
	public ResponseEntity<List<RefereesDto>> GetReferee() {
		List<RefereesDto> refereeDtoList = RefereeMapper.mapRefereeListToRefereeDtoList(refereeService.getAllReferee());
		return new ResponseEntity<>(refereeDtoList, HttpStatus.OK);
	}

	@PutMapping("/refereeedit/{id}")
	public HttpStatus editReferee(@RequestBody RefereesSaveDto refereesSaveDto, @PathVariable("id") Integer id) {
		User userObj = userService.findByUserId(refereesSaveDto.getUser());
		Referee referee = RefeereeDtoToReferee.map(refereesSaveDto);
		boolean test = refereeService.editReferee(referee, id ,userObj);
		if (test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;

	}

	@DeleteMapping("/referee/{id}")
	public HttpStatus deleteReferee(@PathVariable("id") Integer Id) {
		boolean test = refereeService.deleteReferee(Id);
		if (test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}

	@GetMapping("/referee/{uid}")
	public ResponseEntity<List<RefereesDto>> findAcademicQualificationByUserId(@PathVariable("uid") Integer id) {
		List<RefereesDto> refereeDtoList = RefereeMapper.mapRefereeListToRefereeDtoList(refereeService.getRefereeByUserId(id));
		return new ResponseEntity<>(refereeDtoList, HttpStatus.OK);
	}
}
