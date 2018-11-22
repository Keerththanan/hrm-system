package com.sgic.hrm.employee.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.GeneralWelfare;
import com.sgic.hrm.commons.repository.GeneralWelfareRepository;
import com.sgic.hrm.employee.service.GeneralWelfareService;


@Service
public class GeneralWelfareServiceImpl implements GeneralWelfareService{
	@Autowired
	private GeneralWelfareRepository generalWelfareRepository;

	@Override
	public List<GeneralWelfare> getGeneralWelfare() {
		return generalWelfareRepository.findAll();
	}

	@Override
	public void createGeneralWelfare(GeneralWelfare generalWelfare) {
		generalWelfareRepository.save(generalWelfare);	
	}

	@Override
	public void updateGeneralWelfare(GeneralWelfare generalWelfare, Integer id) {
		GeneralWelfare existGeneralWelfare =generalWelfareRepository.getOne(id);
		
		if(existGeneralWelfare.getId() !=null) {
			generalWelfare.setId(id);
			generalWelfareRepository.save(generalWelfare);
		}
	}

	@Override
	public void deleteGeneralWelfare(Integer id) {
		generalWelfareRepository.deleteById(id);
		
	}

}