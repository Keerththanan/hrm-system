package com.sgic.hrm.employee.controller;

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

import com.sgic.hrm.commons.entity.SelfService;
import com.sgic.hrm.employee.service.SelfServiceService;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3200)
@RestController
public class SelfServiceController {
	@Autowired
	private SelfServiceService selfServiceService;

	@GetMapping("/selfservice")
	public ResponseEntity<List<SelfService>> viewSelfService() {
		List<SelfService> selfService = selfServiceService.viewSelfService();
		ResponseEntity<List<SelfService>> response = new ResponseEntity<>(selfService, HttpStatus.OK);
		return response;
	}

	@PostMapping("/selfservice")
	public HttpStatus AddSelfService(@RequestBody SelfService selfService) {
		boolean test = selfServiceService.addSelfService(selfService);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}

	@PutMapping("/selfservice/{id}")
	public HttpStatus ModifySelfService(@PathVariable Integer id, @RequestBody SelfService selfService) {
		boolean test = selfServiceService.editSelfService(selfService, id);
		if (test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}

	@DeleteMapping("/selfservice/{id}")
	public HttpStatus DeleteSelfService(@PathVariable Integer id) {
		boolean selfService = selfServiceService.deleteSelfService(id);
		if (selfService) {
			return HttpStatus.OK;
		}
		return HttpStatus.BAD_REQUEST;
	}


}
