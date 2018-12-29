package com.sgic.hrm.trainee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.dto.mapper.profile.AcademicQualificationDTOToAcademicQualification;
import com.sgic.hrm.commons.dto.profile.AcademicQualificationDto;
import com.sgic.hrm.commons.dto.profile.AcademicQualificationSaveDto;
import com.sgic.hrm.commons.entity.mapper.profile.AcademicQualificationMapper;
import com.sgic.hrm.commons.trainee.entity.AttendStatus;
import com.sgic.hrm.trainee.service.AttendStatusService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class AttendStatusController {
	@Autowired
	private AttendStatusService attendStatusService;

	@PostMapping("/attendence/status")
	public HttpStatus addAttendStatus(@Valid @RequestBody AttendStatus attendStatus) {
		if (attendStatusService.addAttendanceStatus(attendStatus)) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}

	@GetMapping("/attendence/status")
	public ResponseEntity<List<AttendStatus>> getAttendStatus() {
		return new ResponseEntity<>(attendStatusService.getAttendanceStatus(), HttpStatus.OK);
	}

}
