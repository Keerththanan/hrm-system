package com.sgic.hrm.trainer.service;

import java.util.List;

import com.sgic.hrm.commons.entity.Department;
import com.sgic.hrm.commons.entity.trainer.Suggestion;

public interface SuggestionService {
	public List<Suggestion> getSuggestion();
	public boolean createSuggestion(Suggestion suggestion);
	public boolean updateSuggestion(Suggestion suggestion,Integer id);
	public void deleteSuggestion(Integer id);
	List<Suggestion> getRelevantIndividualById(Integer id);
	public List<Department> getDepartment();

}
