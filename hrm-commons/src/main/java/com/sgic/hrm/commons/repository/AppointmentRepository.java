package com.sgic.hrm.commons.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.Appointment;


public interface AppointmentRepository extends JpaRepository<Appointment, Integer>{

}
