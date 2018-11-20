package com.sgic.hrm.employee.remuneration.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.SalaryChart;
import com.sgic.hrm.commons.repository.SalaryChartRepository;
import com.sgic.hrm.employee.remuneration.service.SalaryChartService;

@Service
public class SalaryChartServiceImpl implements SalaryChartService{

	@Autowired
	SalaryChartRepository salaryChartRepository;
	
	@Override
	public List<SalaryChart> viewSalaryChart() {
		// TODO Auto-generated method stub
		return salaryChartRepository.findAll();
	}

}
