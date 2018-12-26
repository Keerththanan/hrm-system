package com.sgic.hrm.commons.trainer.entity.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.trainer.Suggestion;
import com.sgic.hrm.commons.trainer.dto.SuggestionDto;

public class SuggestionMapper {
	public static SuggestionDto mapSuggestionToSuggestionDto(Suggestion suggestion) {
		SuggestionDto suggestionDto = new SuggestionDto();
		suggestionDto.setId(suggestion.getId());
		suggestionDto.setCreatedAt(suggestion.getCreatedAt());
		suggestionDto.setDescription(suggestion.getDescription());
		suggestionDto.setType(suggestion.getType());
		suggestionDto.setDepartment(suggestion.getDepartment());
		suggestionDto.setUser(suggestion.getUser());
		return suggestionDto;
	}

	public static List<SuggestionDto> mapSuggestionListToSuggestionDtoList(List<Suggestion> suggestionList){
		List<SuggestionDto> suggestionDtoList = new ArrayList<SuggestionDto>(); 
		
		if(suggestionList !=null) {
			for(Suggestion suggestion : suggestionList) {
				suggestionDtoList.add(mapSuggestionToSuggestionDto(suggestion));
			}
		}
		return suggestionDtoList;
	}
}
