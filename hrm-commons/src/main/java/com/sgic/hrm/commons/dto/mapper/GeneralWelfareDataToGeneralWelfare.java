package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.GeneralWelfareData;
import com.sgic.hrm.commons.entity.GeneralWelfare;

public class GeneralWelfareDataToGeneralWelfare {
	public static GeneralWelfare generalWelfareDataToGeneralWelfare(GeneralWelfareData generalWelfaredata) {
		GeneralWelfare generalWelfare=new GeneralWelfare();
		
		generalWelfaredata.setId(generalWelfaredata.getId());
		generalWelfaredata.setGeneralWelfare_name(generalWelfaredata.getGeneralWelfare_name());
		generalWelfaredata.setDetails(generalWelfaredata.getDetails());
		
		
		return generalWelfare;
	}

}
