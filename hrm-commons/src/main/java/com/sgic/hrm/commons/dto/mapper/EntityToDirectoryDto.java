package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.DirectoryDto;
import com.sgic.hrm.commons.entity.Appointment;
import com.sgic.hrm.commons.entity.User;

public class EntityToDirectoryDto {

  public static DirectoryDto entityToUserDtoMapping(Appointment apt) {

    DirectoryDto userDto = new DirectoryDto();
    userDto.setUserId(apt.getUser().getId());
    userDto.setFullName(apt.getUser().getFullName());
    userDto.setEmail(apt.getUser().getEmail());
    userDto.setContact(apt.getUser().getMobileNumber());
    userDto.setPermenentAddress(apt.getUser().getPermenentAddress());
    userDto.setDesignation(apt.getDesignationId().getDesignationName());
    userDto.setAppointmentDate(apt.getAppoinmentDate());
    userDto.setServicePeriod(apt.getUser().getServicePeriod());
    return userDto;
  }
}
