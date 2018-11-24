package com.sgic.hrm.commons.entity.mapper;

import com.sgic.hrm.commons.dto.ResponseDto;
import com.sgic.hrm.commons.entity.Response;

public class ResponseMapper {

  public static ResponseDto mapResponseToResponseDto(Response response) {
    ResponseDto responseDto = new ResponseDto();
    
    responseDto.setId(response.getId());
    responseDto.setAttachment(response.getAttachment());
    responseDto.setRelevantDepartment(response.getRelevantDepartment());
    responseDto.setRelevantIndividual(response.getRelevantIndividual());
    responseDto.setSelfService(response.getSelfService());
    responseDto.setCreatedAt(response.getCreatedAt());
    
    return responseDto;
  }
  
//  public static List<ResponseDto> mapResponseToResponseDto(List<Response> responseList){
//    List<ResponseDto> responseDtoList = new ArrayList<ResponseDto>();
//    
//    if(responseList != null) {
//      for(Response response : responseList) {
//        responseDtoList.add(mapResponseToResponseDto(response));
//      }
//    }
//    return responseDtoList;
//  }
}
