package com.sgic.hrm.commons.dto.mapper.profile;

import com.sgic.hrm.commons.dto.profile.AppointmentSaveDto;
import com.sgic.hrm.commons.entity.Appointment;

public class AppointmentDtoToAppointment {
	public static Appointment map(AppointmentSaveDto appointmentSaveDto) {
		Appointment appointment=new Appointment();
		appointment.setAppoinmentDate(appointmentSaveDto.getAppoinmentDate());
		appointment.setJobDesc(appointmentSaveDto.getJobDesc());
		appointment.setId(appointmentSaveDto.getId());
		
		
		return appointment;
	}

}
