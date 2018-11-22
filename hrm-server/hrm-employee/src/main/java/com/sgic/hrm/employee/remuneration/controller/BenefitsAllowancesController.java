package com.sgic.hrm.employee.remuneration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.entity.BenefitsAllowancesEntity;
import com.sgic.hrm.employee.remuneration.service.BenefitsAllowancesService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BenefitsAllowancesController {

	@Autowired
	BenefitsAllowancesService benefitsAllowancesService;

	@GetMapping("/benefits")
	public List<BenefitsAllowancesEntity> viewBenefitsAllowances() {
		return benefitsAllowancesService.getBenefitsAllowances();
	}
}
