package com.sgic.hrm.trainer.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.trainer.GeneralInformation;
import com.sgic.hrm.commons.trainer.repository.GeneralInformationRepository;
import com.sgic.hrm.trainer.service.GeneralInformationService;

@Service
public class GeneralInformationServiceImpl implements GeneralInformationService{
	@Autowired
	GeneralInformationRepository generalInformationRepository;

	@Override
	public List<GeneralInformation> getAllGeneralInformation() {
		return generalInformationRepository.findAll();
	}

	@Override
	public boolean createGeneralInformation(GeneralInformation generalInformation) {
		generalInformationRepository.save(generalInformation);
		return true;
	}

	@Override
	public boolean deleteGeneralInformation(Integer id) {
		generalInformationRepository.deleteById(id);
		return true;
	}

	@Override
	public boolean updateGeneralInformation(GeneralInformation generalInformation, Integer id) {
		if(generalInformationRepository.getOne(id)!=null) {
			generalInformation.setId(id);
			generalInformationRepository.save(generalInformation);
			return true;
		}
		return false;
	}

	@Override
	public GeneralInformation getById(Integer id) {
		return generalInformationRepository.findById(id).orElse(null);
	}
}
