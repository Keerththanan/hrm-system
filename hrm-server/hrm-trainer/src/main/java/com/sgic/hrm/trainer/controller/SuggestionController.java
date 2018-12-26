package com.sgic.hrm.trainer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.entity.Department;
import com.sgic.hrm.commons.trainer.dto.SuggestionDto;
import com.sgic.hrm.commons.trainer.dto.SuggestionSaveDto;
import com.sgic.hrm.commons.trainer.dto.mapper.SugesstionDtoMapper;
import com.sgic.hrm.commons.trainer.entity.mapper.SuggestionMapper;
import com.sgic.hrm.trainer.service.SuggestionService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3200)
@RestController
public class SuggestionController {
	@Autowired
	private SuggestionService suggestionService;

//	getting All suggestion and feedback
	@GetMapping("/suggestion")
	public ResponseEntity<List<SuggestionDto>> getAllSuggestion() {
		return new ResponseEntity<>(SuggestionMapper
				.mapSuggestionListToSuggestionDtoList(suggestionService.getSuggestion()), HttpStatus.OK);
	}
	
	@GetMapping("/departments")
	public List<Department> getDepartments(){
		return suggestionService.getDepartment();
	}

//	get relevant trainer By id
	@GetMapping("/suggestion/{id}")
	public ResponseEntity<List<SuggestionDto>> getSuggestionByUserId(@PathVariable Integer id) {
		return new ResponseEntity<>(
				SuggestionMapper.mapSuggestionListToSuggestionDtoList(suggestionService.getRelevantIndividualById(id)),
				HttpStatus.OK);
	}

//	posting suggestion and feedbacks
	@PostMapping("/suggestion")
	public HttpStatus addSuggestion(@RequestBody SuggestionSaveDto suggestionSaveDto) {
		boolean test = suggestionService
				.createSuggestion(SugesstionDtoMapper.mapSuggestionSaveDtoToSuggestion(suggestionSaveDto));
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}

//	deleting suggestion and feedbacks
	@DeleteMapping("/suggestion/{id}")
	public void deleteSuggestion(@PathVariable Integer id) {
		suggestionService.deleteSuggestion(id);
	}

}
