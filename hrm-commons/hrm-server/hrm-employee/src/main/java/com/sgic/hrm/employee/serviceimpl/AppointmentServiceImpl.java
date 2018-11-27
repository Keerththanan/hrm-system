package com.sgic.hrm.employee.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.Appointment;
import com.sgic.hrm.commons.entity.AppointmentType;
import com.sgic.hrm.commons.entity.Department;
import com.sgic.hrm.commons.entity.Designation;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.repository.AppointmentRepository;
import com.sgic.hrm.employee.service.AppointmentService;
	@Service
	public class AppointmentServiceImpl implements AppointmentService {
	@Autowired
	private AppointmentRepository appointmentRepository;
	
	
	

	@Override
	public List<Appointment> getAppointment() {
		return appointmentRepository.findAll();
	}

	@Override
	public boolean addAppointment(Appointment appointment, AppointmentType appointmentType, User user,
			Department department, Designation designation) {
		appointment.setUserId(user);
		appointment.setAppointmentTypeId(appointmentType);
		appointment.setDesignationId(designation);
		appointment.setDepartmentId(department);
		appointmentRepository.save(appointment);
		return true;
	}

}
