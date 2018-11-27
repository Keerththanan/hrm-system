package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.IndividualWelfareData;
import com.sgic.hrm.commons.entity.IndividualWelfare;

public class IndividualWelfareDataToIndividualWelfare {
public static IndividualWelfare individualWelfareDataToIndividualWelfare(IndividualWelfareData individualWelfareData) {
	IndividualWelfare individualWelfare=new IndividualWelfare();
	
	
	individualWelfare.setId(individualWelfareData.getId());
	individualWelfare.setEmployee_name(individualWelfareData.getEmployee_name());
	individualWelfare.setIndividualWelfare_name(individualWelfareData.getIndividualWelfare_name());
	individualWelfare.setAmount(individualWelfareData.getAmount());
	
	return individualWelfare;


}
}
