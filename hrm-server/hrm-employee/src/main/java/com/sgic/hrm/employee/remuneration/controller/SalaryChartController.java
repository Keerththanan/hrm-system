package com.sgic.hrm.employee.remuneration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.entity.SalaryChart;
import com.sgic.hrm.employee.remuneration.service.SalaryChartService;

@RestController
public class SalaryChartController {
	
	@Autowired
	SalaryChartService salaryChartService;
	
	@GetMapping("/salarychart")
	public List<SalaryChart> getSalaryChart(){
		return salaryChartService.viewSalaryChart();
	}
	
	@GetMapping("/testx")
	public String test() {
		return "hi how are you";
	}

}
