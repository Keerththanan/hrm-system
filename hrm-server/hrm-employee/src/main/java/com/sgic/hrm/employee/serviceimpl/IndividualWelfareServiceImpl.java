package com.sgic.hrm.employee.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.IndividualWelfare;
import com.sgic.hrm.commons.repository.IndividualWelfareRepository;

import com.sgic.hrm.employee.service.IndividualWelfareService;

@Service
public class IndividualWelfareServiceImpl implements IndividualWelfareService {
	
	@Autowired
	private IndividualWelfareRepository individualWelfareRepository;

	@Override
	public List<IndividualWelfare> getIndividualWelfare() {
		return individualWelfareRepository.findAll();
	}

//	@Override
//	public void createIndividualWelfare(IndividualWelfare individualWelfare) {
//		individualWelfareRepository.save(individualWelfare);	
//	}

	@Override
	public void updateIndividualWelfare(IndividualWelfare individualWelfare, Integer id) {
		IndividualWelfare existIndividualWelfare =individualWelfareRepository.getOne(id);
		
		if(existIndividualWelfare.getId() !=null) {
			individualWelfare.setId(id);
			individualWelfareRepository.save(individualWelfare);
		}
	}

	@Override
	public void deleteIndividualWelfare(Integer id) {
		individualWelfareRepository.deleteById(id);
		
		
	}

	@Override
	public void createIndividualWelfare(IndividualWelfare individualWelfare, Integer id) {
		// TODO Auto-generated method stub
		
	}

	
}

