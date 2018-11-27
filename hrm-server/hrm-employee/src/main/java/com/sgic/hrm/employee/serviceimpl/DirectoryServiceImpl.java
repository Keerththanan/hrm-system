package com.sgic.hrm.employee.serviceimpl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.Appointment;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.repository.AppointmentRepository;
import com.sgic.hrm.commons.repository.UserRepository;
import com.sgic.hrm.employee.service.DirectoryService;

@Service
public class DirectoryServiceImpl implements DirectoryService {

	@Autowired
	private AppointmentRepository appointmentRepository;


	@Override
	public List<Appointment> getUserByDesignationName(String designation) {
		return appointmentRepository.findAllUsersByDesignation(designation);
	}

	@Override
	public List<Appointment> getUserByFullName(String name) {
		return appointmentRepository.findAllUsersByName(name);
	}

	@Override
	public List<Appointment> getUserByAppoinmentDateAndName(Date date, String name) {
		return appointmentRepository.findAllUsersByAppointmentDatenAndName(date, name);
	}

	@Override
	public List<Appointment> getUserByDesignationNameAndName(String designation, String name) {
		return appointmentRepository.findAllUsersByDesignationAndName(designation, name);
	}

	@Override
	public List<Appointment> getUserByDesignationNameAndAppointmentDate(String designation, Date date) {
		return appointmentRepository.findAllUsersByDesignationAndAppointmentDate(designation , date);
	}

	@Override
	public List<Appointment> getUserByAllThreeFeilds(String name, Date date, String designation) {
		return appointmentRepository.findAllUsersByAppointmentDatenAndNameAndDesignation(date, name, designation);
	}

	@Override
	public List<Appointment> getUserByAppoinmentDate(Date date) {
		return appointmentRepository.findUsersByAppointmentDate(date);
	}

}
