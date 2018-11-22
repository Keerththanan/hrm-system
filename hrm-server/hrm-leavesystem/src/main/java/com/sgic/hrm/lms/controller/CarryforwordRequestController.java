package com.sgic.hrm.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.dto.CarryforwardRequestData;
import com.sgic.hrm.commons.dto.mapper.CarryforwardRequestDataToCarryforwardRequest;
import com.sgic.hrm.commons.entity.CarryforwardRequest;
import com.sgic.hrm.commons.entity.mapper.CarryforwardRequestToCarryforwardRequestData;
import com.sgic.hrm.lms.service.CarryforwardRequestService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/carryforwardrequest")
public class CarryforwordRequestController {

	@Autowired
	CarryforwardRequestService carryforwardRequestService;

	@GetMapping
	public ResponseEntity<List<CarryforwardRequestData>> viewAllCarryforwardRequest() {
		List<CarryforwardRequest> carryforwardRequestList = carryforwardRequestService.viewAllCarryforwardRequest();
		return new ResponseEntity<>(
				CarryforwardRequestToCarryforwardRequestData.mapToCarryforwardRequestDataList(carryforwardRequestList),
				HttpStatus.OK);
	}

	@PostMapping
	public HttpStatus createCarryforwardRequest(
			@RequestBody CarryforwardRequestData carryforwardRequestData) {
		if (carryforwardRequestService.createCarryforwardRequest(
				CarryforwardRequestDataToCarryforwardRequest.mapToCarryforwardRequest(carryforwardRequestData))) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
}
