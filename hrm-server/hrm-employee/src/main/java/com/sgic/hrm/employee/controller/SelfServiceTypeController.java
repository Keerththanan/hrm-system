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

import com.sgic.hrm.commons.entity.SelfServiceType;
import com.sgic.hrm.employee.service.SelfServiceTypeService;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3200)
@RestController
public class SelfServiceTypeController {
	@Autowired
	private SelfServiceTypeService selfServiceTypeService;

	@GetMapping("/selfservicetype")
	public ResponseEntity<List<SelfServiceType>> viewSelfServiceType() {
		List<SelfServiceType> selfServiceType = selfServiceTypeService.viewSelfServiceType();
		ResponseEntity<List<SelfServiceType>> response = new ResponseEntity<>(selfServiceType, HttpStatus.OK);
		return response;
	}

	@PostMapping("/selfservicetype")
	public HttpStatus AddSelfServiceType(@RequestBody SelfServiceType selfServiceType) {
		boolean test = selfServiceTypeService.addSelfServiceType(selfServiceType);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}

	@PutMapping("/selfservicetype/{id}")
	public HttpStatus ModifySelfServiceType(@PathVariable Integer id, @RequestBody SelfServiceType selfServiceType) {
		boolean test = selfServiceTypeService.editSelfServiceType(selfServiceType, id);
		if (test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	@DeleteMapping("/selfservicetype/{id}")
	public HttpStatus DeleteSelfServiceType(@PathVariable Integer id) {
	  boolean selfServiceType = selfServiceTypeService.deleteSelfServiceType(id);
	  if(selfServiceType) {
	    return HttpStatus.OK;
	  }
    return HttpStatus.BAD_REQUEST;
	  
	}
}
