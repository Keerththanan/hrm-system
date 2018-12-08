package com.sgic.hrm.commons.entity.mapper.privilege;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.privilege.AuthorizeTypeDto;
import com.sgic.hrm.commons.entity.privilege.AuthorizeType;

public class AuthorizeTypeMapper {
	
	public static AuthorizeTypeDto mapAuthorizeTypeToAuthorizeTypeDto(AuthorizeType authorizeType) {
		AuthorizeTypeDto authorizeTypeDto = new AuthorizeTypeDto();
		
		authorizeTypeDto.setId(authorizeType.getId());
		authorizeTypeDto.setAuthorizeTypeName(authorizeType.getAuthorizeTypeName());
		
		return authorizeTypeDto;
	}
	
	public static List<AuthorizeTypeDto> mapAuthorizeTypeListToAuthorizeTypeDtoList(List<AuthorizeType> authorizeTypeList) {
		List<AuthorizeTypeDto> authorizeTypeDtoList = new ArrayList<AuthorizeTypeDto>();
		
		if(authorizeTypeList != null) {
			for(AuthorizeType authorizeType : authorizeTypeList) {
				authorizeTypeDtoList.add(mapAuthorizeTypeToAuthorizeTypeDto(authorizeType));
			}
		}		
		return authorizeTypeDtoList;
	}

}
