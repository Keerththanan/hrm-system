package com.sgic.hrm.commons.repository;
import java.sql.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import com.sgic.hrm.commons.entity.Appointment;


@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer>{
	@Query("select aptmnt from Appointment as aptmnt where aptmnt.userId.fullName LIKE '%'|| ?1 ||'%' ")
	  public List<Appointment> findAllUsersByName(String name);

	@Query("select aptmnt from Appointment as aptmnt where aptmnt.appoinmentDate = ?1 ")
	  public List<Appointment> findUsersByAppointmentDate(Date date);

	@Query("select aptmnt from Appointment as aptmnt where aptmnt.designationId.designationName LIKE '%'|| ?1 ||'%' ")
	  public List<Appointment> findAllUsersByDesignation(String designation);

	@Query("select aptmnt from Appointment as aptmnt where aptmnt.designationId.designationName LIKE '%'|| ?1 ||'%' AND aptmnt.userId.fullName LIKE '%'|| ?2 ||'%' ")
	  public List<Appointment> findAllUsersByDesignationAndName(String designation, String name);

	@Query("select aptmnt from Appointment as aptmnt where aptmnt.designationId.designationName LIKE '%'|| ?1 ||'%' AND aptmnt.appoinmentDate = ?2  ")
	  public List<Appointment> findAllUsersByDesignationAndAppointmentDate(String designation, Date date);

	@Query("select aptmnt from Appointment as aptmnt where aptmnt.appoinmentDate = ?1  AND aptmnt.userId.fullName LIKE '%'|| ?2 ||'%' ")
	  public List<Appointment> findAllUsersByAppointmentDatenAndName(Date date, String name);

	@Query("select aptmnt from Appointment as aptmnt where aptmnt.appoinmentDate = ?1  AND aptmnt.userId.fullName LIKE '%'|| ?2 ||'%'  AND aptmnt.designationId.designationName LIKE '%'|| ?3 ||'%' ")
	  public List<Appointment> findAllUsersByAppointmentDatenAndNameAndDesignation(Date date, String name,
	      String designation);
}
