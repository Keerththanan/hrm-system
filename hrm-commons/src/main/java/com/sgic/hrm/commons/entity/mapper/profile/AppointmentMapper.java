package com.sgic.hrm.commons.entity.mapper.profile;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.profile.AppointmentDto;
import com.sgic.hrm.commons.entity.Appointment;

public class AppointmentMapper {
	public static AppointmentDto mapAppointmentToAppointmentDto(Appointment appointment) {
		AppointmentDto appointmentDto=new AppointmentDto();
		appointmentDto.setAppoinmentDate(appointment.getAppoinmentDate());
		appointmentDto.setAppointmentType(appointment.getAppointmentTypeId());
		appointmentDto.setDepartment(appointment.getDepartmentId());
		appointmentDto.setDesignation(appointment.getDesignationId());
		appointmentDto.setId(appointment.getId());
		appointmentDto.setJobDesc(appointment.getJobDesc());
		appointmentDto.setUser(appointment.getUser());
		
		return appointmentDto;
	}
	
	public static List<AppointmentDto> mapAppointmentListToAppointmentDtoList(List<Appointment>appointmentList){
		List<AppointmentDto>appointmentDtoList=new ArrayList<AppointmentDto>();
		if(appointmentDtoList != null) {
			for(Appointment appointment:appointmentList)
				appointmentDtoList.add(mapAppointmentToAppointmentDto(appointment));
		}
		return appointmentDtoList;
	}
}
