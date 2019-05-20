package com.sgic.hrm.commons.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sgic.hrm.commons.entity.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer>{
	
	@Query("select apt from Appointment as apt where apt.user.fullName LIKE '%'|| ?1 ||'%' ")
  public List<Appointment> findAllUsersByName(String name);

  @Query("select apt from Appointment as apt where apt.appoinmentDate = ?1 ")
  public List<Appointment> findUsersByAppointmentDate(Date date);

  @Query("select apt from Appointment as apt where apt.designationId.designationName LIKE '%'|| ?1 ||'%' ")
  public List<Appointment> findAllUsersByDesignation(String designation);

  @Query("select apt from Appointment as apt where apt.designationId.designationName LIKE '%'|| ?1 ||'%' AND apt.user.fullName LIKE '%'|| ?2 ||'%' ")
  public List<Appointment> findAllUsersByDesignationAndName(String designation, String name);

  @Query("select apt from Appointment as apt where apt.designationId.designationName LIKE '%'|| ?1 ||'%' AND apt.appoinmentDate = ?2  ")
  public List<Appointment> findAllUsersByDesignationAndAppointmentDate(String designation, Date date);

  @Query("select apt from Appointment as apt where apt.appoinmentDate = ?1  AND apt.user.fullName LIKE '%'|| ?2 ||'%' ")
  public List<Appointment> findAllUsersByAppointmentDatenAndName(Date date, String name);

  @Query("select apt from Appointment as apt where apt.appoinmentDate = ?1  AND apt.user.fullName LIKE '%'|| ?2 ||'%'  AND apt.designationId.designationName LIKE '%'|| ?3 ||'%' ")
  public List<Appointment> findAllUsersByAppointmentDatenAndNameAndDesignation(Date date, String name,String designation);

}
