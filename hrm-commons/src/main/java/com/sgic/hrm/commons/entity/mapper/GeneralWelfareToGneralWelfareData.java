package com.sgic.hrm.commons.entity.mapper;

import com.sgic.hrm.commons.dto.GeneralWelfareData;
import com.sgic.hrm.commons.entity.GeneralWelfare;

public class GeneralWelfareToGneralWelfareData {
	
	public static GeneralWelfareData generalWelfareToGeneralWelfareData(GeneralWelfare generalWelfare) {
		if(generalWelfare !=null) {
			generalWelfareData.setId(generalWelfare.getId());
			generalWelfareData.setGeneralWelfareName(generalWelfare.getGeneralWelfare_name());
			generalWelfareData.setGeneralWelfareDetails(generalWelfare.getGeneralWelfare_name());
			
			return GeneralWelfareData
			
		}
		
		return null;
	}

}
