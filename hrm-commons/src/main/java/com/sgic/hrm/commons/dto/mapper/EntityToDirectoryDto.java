package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.DirectoryDto;
import com.sgic.hrm.commons.entity.Appointment;

public class EntityToDirectoryDto {

  public static DirectoryDto entityToUserDtoMapping(Appointment appointment) {

    DirectoryDto userDto = new DirectoryDto();
    userDto.setUserId(appointment.getUserId().getId());
    userDto.setFullName(appointment.getUserId().getFullName());
    userDto.setEmail(appointment.getUserId().getEmail());
    userDto.setContact(appointment.getUserId().getTelephoneNumber());
    userDto.setPermenentAddress(appointment.getUserId().getPermenentAddress());
    userDto.setDesignation(appointment.getDesignationId().getDesignationName());
    userDto.setAppointmentDate(appointment.getAppoinmentDate());
    userDto.setServicePeriod(appointment.getUserId().getServicePeriod());
    
    return userDto;
  }
}
