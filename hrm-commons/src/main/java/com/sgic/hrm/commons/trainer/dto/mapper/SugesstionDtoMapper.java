package com.sgic.hrm.commons.trainer.dto.mapper;

import com.sgic.hrm.commons.entity.Department;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.entity.trainer.Suggestion;
import com.sgic.hrm.commons.trainer.dto.SuggestionDto;
import com.sgic.hrm.commons.trainer.dto.SuggestionSaveDto;

public class SugesstionDtoMapper {
	public static Suggestion mapSuggestionSaveDtoToSuggestion(SuggestionSaveDto suggestionSaveDto) {
		Suggestion suggestion = new Suggestion();
		 Department relevantDepartment = new Department();
		    User user = new User();
		    User relevantUser = new User();
		    
		    relevantDepartment.setId(suggestionSaveDto.getDepartment());
		    user.setId(suggestionSaveDto.getUser());
		    relevantUser.setId(suggestionSaveDto.getUser());
		    
		    suggestion.setId(suggestionSaveDto.getId());
		    suggestion.setCreatedAt(suggestionSaveDto.getCreatedAt());
		    suggestion.setType(suggestionSaveDto.getType());
		    suggestion.setDescription(suggestionSaveDto.getDescription());
		    suggestion.setDepartment(relevantDepartment);
		    suggestion.setUser(relevantUser);
		    
		    return suggestion;
	}

	public static Suggestion mapSuggestionDtoToSuggestion(SuggestionDto suggestionDto) {
		Suggestion suggestion = new Suggestion();
		
		suggestion.setId(suggestionDto.getId());
		suggestion.setCreatedAt(suggestionDto.getCreatedAt());
		suggestion.setType(suggestionDto.getType());
		suggestion.setDescription(suggestionDto.getDescription());
		suggestion.setDepartment(suggestionDto.getDepartment());
		suggestion.setUser(suggestionDto.getUser());
		
		return suggestion;
	}
}
