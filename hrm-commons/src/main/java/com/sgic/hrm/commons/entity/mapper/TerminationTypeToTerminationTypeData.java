package com.sgic.hrm.commons.entity.mapper;

import java.util.ArrayList;
import java.util.List;
import com.sgic.hrm.commons.dto.TerminationTypeData;
import com.sgic.hrm.commons.entity.TerminationType;

public class TerminationTypeToTerminationTypeData {

  public static TerminationTypeData mapToTerminationTypeData(TerminationType terminationType) {
    TerminationTypeData terminationTypeDto = new TerminationTypeData();
    if (terminationType != null) {
      terminationTypeDto.setId(terminationType.getId());
      terminationTypeDto.setTerminationType(terminationType.getTerminationTypeValue());

    }
    return terminationTypeDto;
  }

  public static List<TerminationTypeData> terminationTypeToTerminationTypeDtoList(
      List<TerminationType> terminationTypeList) {
    List<TerminationTypeData> terminationTypeDto = new ArrayList<TerminationTypeData>();

    if (terminationTypeList != null) {
      for (TerminationType terminationType : terminationTypeList) {
        terminationTypeDto.add(mapToTerminationTypeData(terminationType));
      }
    }
    return terminationTypeDto;
  }
}
