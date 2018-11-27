package com.sgic.hrm.employee.service;

import java.util.List;

import com.sgic.hrm.commons.entity.GeneralWelfare;

public interface GeneralWelfareService {

	public List<GeneralWelfare> getGeneralWelfare();

	public void createGeneralWelfare(GeneralWelfare generalWelfare);

	public void updateGeneralWelfare(GeneralWelfare generalWelfare, Integer id);

	public void deleteGeneralWelfare(Integer id);

}
