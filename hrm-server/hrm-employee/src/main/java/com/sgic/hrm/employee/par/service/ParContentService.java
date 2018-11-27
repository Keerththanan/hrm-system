package com.sgic.hrm.employee.par.service;

import java.util.List;

import com.sgic.hrm.commons.entity.par.ParContent;

public interface ParContentService {

	public List<ParContent> getParContent();

	public void createParContent(ParContent parContent);

	public void updateParContent(ParContent parContent, Integer id);

	public void deleteParContent(Integer id);

}
