package com.sgic.hrm.commons.dto.mapper.profile;

import com.sgic.hrm.commons.dto.profile.AppointmentDto;
import com.sgic.hrm.commons.entity.Appointment;

public class AppointmentDtoToAppointment {
	public static Appointment map(AppointmentDto appointmentDto) {
		Appointment appointment=new Appointment();
		appointment.setAppoinmentDate(appointmentDto.getAppoinmentDate());
		appointment.setJobDesc(appointmentDto.getJobDesc());
		appointment.setId(appointmentDto.getId());
		
		
		return appointment;
	}

}
