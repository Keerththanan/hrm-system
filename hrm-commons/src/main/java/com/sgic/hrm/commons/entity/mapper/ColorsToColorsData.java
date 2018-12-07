package com.sgic.hrm.commons.entity.mapper;

import com.sgic.hrm.commons.dto.ColorsData;
import com.sgic.hrm.commons.entity.Colors;

public class ColorsToColorsData {

public static ColorsData mapToColorsData(Colors colors) {
    
    ColorsData colorsData = new ColorsData();
    
    if(colors != null) {
    colorsData.setId(colors.getId());
    colorsData.setName(colors.getName());
    colorsData.setPrimary(colors.getPrimary());
    colorsData.setSecondary(colors.getSecondary());
    
    return colorsData;
    }
    return null;
  }
}
