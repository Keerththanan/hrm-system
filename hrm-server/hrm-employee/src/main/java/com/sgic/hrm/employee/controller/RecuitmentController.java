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

import com.sgic.hrm.commons.dto.RecruitmentData;
import com.sgic.hrm.commons.dto.mapper.RecruitmentDataMapper;
import com.sgic.hrm.commons.entity.Recruitment;
import com.sgic.hrm.employee.service.RecruitmentService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

@RestController
public class RecuitmentController {
	@Autowired
	private RecruitmentService recruitmentService;

	@PostMapping("/recruitment")
	public HttpStatus createRecuitment(@RequestBody RecruitmentData recruitmentData) {
		boolean test = recruitmentService.addRecruitment(RecruitmentDataMapper.recruitmentDataMapper(recruitmentData));
		if (test) {
			return HttpStatus.CREATED;

		}

		return HttpStatus.BAD_REQUEST;
	}

	@GetMapping("/recruitment")
	public ResponseEntity<List<Recruitment>> getRecuitment() {
		List<Recruitment> recuitment = recruitmentService.getAllRecruitment();
		ResponseEntity<List<Recruitment>> response = new ResponseEntity<>(recuitment, HttpStatus.OK);
		return response;
	}
	
//	@PutMapping("/recruitment/{id}")
//	public HttpStatus editRecuitment(@RequestBody Recruitment recuitment, @PathVariable("id") Integer id) {
//		boolean test = recruitmentService.editRecruitment(recuitment, id);
//		if (test) {
//			return HttpStatus.ACCEPTED;
//		}
//		return HttpStatus.BAD_REQUEST;
//
//	}
	@PutMapping("/recruitment/{id}")
	public ResponseEntity<String> updateRecuitment(@PathVariable(name="id") Integer id,@RequestBody RecruitmentData recruitmentData){
		Recruitment recruitment=RecruitmentDataMapper.recruitmentDataMapper(recruitmentData);
		if(recruitmentService.editRecruitment(recruitment, id))
		{
			return new ResponseEntity<>("updated",HttpStatus.OK);
		}
		return new ResponseEntity<>("upadte failed", HttpStatus.BAD_REQUEST);
	}

	@DeleteMapping("/recruitment/{id}")
	public HttpStatus deleteRecuitment(@PathVariable("id") Integer id) {
		boolean test = recruitmentService.deleteRecruitment(id);
		HttpStatus status;
		if (test) {
			return HttpStatus.OK;
		} else {
			status = HttpStatus.BAD_REQUEST;
		}
		return status;
	}
}
