package com.sgic.hrm.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.entity.RequestPromotion;
import com.sgic.hrm.employee.service.RequestPromotionService;

@RestController
public class RequestPromotionController {
	@Autowired
	private RequestPromotionService requestPromotionService;

	@PostMapping("/promotion")
	public HttpStatus requestPromotion(@RequestBody RequestPromotion requestPromotion) {
		boolean reqPro = requestPromotionService.addRequestPromotion(requestPromotion);
		if (reqPro) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;

	}

	@GetMapping("/promotion")
	public ResponseEntity<List<RequestPromotion>> getAllRequestPromotions() {
		List<RequestPromotion> reqPromotionData = requestPromotionService.getAllRequestPromotion();
		ResponseEntity<List<RequestPromotion>> response = new ResponseEntity<>(reqPromotionData, HttpStatus.OK);
		return response;
	}

	@PutMapping("/promotion/{id}")
	public HttpStatus updateRequestPromotion(@PathVariable Integer id, @RequestBody RequestPromotion requestPromotion) {
		boolean reqPro = requestPromotionService.updateRequestPromotion(requestPromotion, id);
		if (reqPro) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;

	}

	@DeleteMapping("/promotion/{id}")
	public HttpStatus deleteRequestPromotion(@PathVariable Integer id) {
		boolean reqPro = requestPromotionService.deleteRequstPromotion(id);
		if (reqPro) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}

}
