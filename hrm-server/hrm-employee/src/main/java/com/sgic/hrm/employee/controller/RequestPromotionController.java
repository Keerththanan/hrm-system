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

import com.sgic.hrm.commons.dto.RequestPromotionData;
import com.sgic.hrm.commons.entity.Designation;
import com.sgic.hrm.commons.entity.RequestPromotion;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.employee.service.DesignationService;
import com.sgic.hrm.employee.service.RequestPromotionService;
import com.sgic.hrm.employee.service.UserService;

//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class RequestPromotionController {
	@Autowired
	private RequestPromotionService requestPromotionService;
	@Autowired
	private DesignationService designationService;
	@Autowired
	private UserService userService;

	@PostMapping("/requestpromotion")
	public HttpStatus requestPromotion(@RequestBody RequestPromotionData requestPromotiondata) {
		
		RequestPromotion requestPromotion=new RequestPromotion();		
		requestPromotion.setId(requestPromotiondata.getId());
		requestPromotion.setPromotionRemark(requestPromotiondata.getPromotionRemark());
		requestPromotion.setRecommendedBy(requestPromotiondata.getRecommendedBy());
		
		Designation designation=designationService.getDesignationById(requestPromotiondata.getDesignationId());
		requestPromotion.setDesignationId(designation);
		
		User user= userService.getUserById(requestPromotiondata.getUserId());
		requestPromotion.setUserId(user);
		
		boolean rest=requestPromotionService.addRequestPromotion(requestPromotion);
		
		if (rest) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;

	}

	@GetMapping("/requestpromotion")
	public ResponseEntity<List<RequestPromotion>> getAllRequestPromotions() {
		List<RequestPromotion> reqPromotionData = requestPromotionService.getAllRequestPromotion();
		ResponseEntity<List<RequestPromotion>> response = new ResponseEntity<>(reqPromotionData, HttpStatus.OK);
		return response;
	}

	@PutMapping("/requestpromotion/{id}")
	public HttpStatus updateRequestPromotion(@PathVariable Integer id, @RequestBody RequestPromotion requestPromotion) {
		boolean reqPro = requestPromotionService.updateRequestPromotion(requestPromotion, id);
		if (reqPro) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;

	}

	@DeleteMapping("/requestpromotion/{id}")
	public HttpStatus deleteRequestPromotion(@PathVariable Integer id) {
		boolean reqPro = requestPromotionService.deleteRequstPromotion(id);
		if (reqPro) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}

}
