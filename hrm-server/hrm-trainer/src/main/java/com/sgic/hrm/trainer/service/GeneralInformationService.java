package com.sgic.hrm.trainer.service;

import java.util.List;


import com.sgic.hrm.commons.entity.trainer.GeneralInformation;


public interface GeneralInformationService {
	List<GeneralInformation> getAllGeneralInformation();
	
	boolean createGeneralInformation (GeneralInformation generalInformation);

	boolean deleteGeneralInformation(Integer id);

	boolean updateGeneralInformation(GeneralInformation generalInformation, Integer id);
	
	GeneralInformation getById(Integer id);
	


}
