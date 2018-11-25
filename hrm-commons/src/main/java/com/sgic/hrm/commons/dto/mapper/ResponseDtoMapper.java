package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.ResponseDto;
import com.sgic.hrm.commons.entity.Response;

public class ResponseDtoMapper {

  public static Response mapResponseDtoToResponse(ResponseDto responseDto) {
    Response response = new Response();
    
    response.setId(responseDto.getId());
    response.setCreatedAt(responseDto.getCreatedAt());
    response.setAttachment(responseDto.getAttachment());
    response.setRelevantDepartment(responseDto.getRelevantDepartment());
    response.setRelevantIndividual(responseDto.getRelevantIndividual());
    response.setSelfService(responseDto.getSelfService());
    
    return response;
  }
}
