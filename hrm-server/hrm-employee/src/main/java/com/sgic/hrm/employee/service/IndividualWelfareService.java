package com.sgic.hrm.employee.service;

import java.util.List;
import com.sgic.hrm.commons.entity.IndividualWelfare;

public interface IndividualWelfareService {
	
	public List<IndividualWelfare> getIndividualWelfare();
	
	public void createIndividualWelfare (IndividualWelfare individualWelfare, Integer id);

	public void deleteIndividualWelfare(Integer id);

	public void updateIndividualWelfare(IndividualWelfare generalWelfare, Integer id);

}
