package com.sgic.hrm.trainer.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.Department;
import com.sgic.hrm.commons.entity.trainer.Suggestion;
import com.sgic.hrm.commons.repository.DepartmentRepository;
import com.sgic.hrm.commons.repository.UserRepository;
import com.sgic.hrm.commons.trainer.repository.SuggestionRepository;
import com.sgic.hrm.trainer.service.SuggestionService;

@Service
public class SuggestionServiceImpl implements SuggestionService{
	@Autowired
	private SuggestionRepository suggestionRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public List<Suggestion> getSuggestion() {
		return suggestionRepository.findAll();
	}

	@Override
	public boolean createSuggestion(Suggestion suggestion) {
		suggestionRepository.save(suggestion);
		return true;
	}

	@Override
	public boolean updateSuggestion(Suggestion suggestion, Integer id) {
		if(suggestionRepository.getOne(id)!=null) {
			suggestion.setId(id);
			suggestionRepository.save(suggestion);
			return true;
		}
		return false;
	}

	@Override
	public void deleteSuggestion(Integer id) {
		suggestionRepository.deleteById(id);
	}

	@Override
	public List<Suggestion> getRelevantIndividualById(Integer id) {
		return suggestionRepository.findReleventIndividualByUser(userRepository.findUserById(id));
	}

	@Override
	public List<Department> getDepartment() {
		return departmentRepository.findAll();
	}

	
}
