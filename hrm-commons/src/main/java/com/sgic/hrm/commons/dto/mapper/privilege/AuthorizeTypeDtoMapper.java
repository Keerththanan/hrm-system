package com.sgic.hrm.commons.dto.mapper.privilege;

import com.sgic.hrm.commons.dto.privilege.AuthorizeTypeDto;
import com.sgic.hrm.commons.entity.privilege.AuthorizeType;

public class AuthorizeTypeDtoMapper {
	
	public static AuthorizeType mapAuthorizeTypeDtoToAuthorizeType(AuthorizeTypeDto authorizeTypeDto) {
		AuthorizeType authorizeType = new AuthorizeType();
		
		authorizeType.setId(authorizeTypeDto.getId());
		authorizeType.setAuthorizeTypeName(authorizeTypeDto.getAuthorizeTypeName());
		
		return authorizeType;
	}

}
