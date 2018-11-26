package com.sgic.hrm.commons.entity;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appointment", schema = "employee")
public class Appointment implements Serializable {
  /**
   * 
   */
  private static final long serialVersionUID = -9107588803273527722L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private User userId;
  private Designation designationId;
  private AppointmentType appointmentTypeId;
  private String jobDesc;
  private Date appoinmentDate;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public User getUserId() {
    return userId;
  }

  public void setUserId(User userId) {
    this.userId = userId;
  }

  public Designation getDesignationId() {
    return designationId;
  }

  public void setDesignationId(Designation designationId) {
    this.designationId = designationId;
  }

  public AppointmentType getAppointmentTypeId() {
    return appointmentTypeId;
  }

  public void setAppointmentTypeId(AppointmentType appointmentTypeId) {
    this.appointmentTypeId = appointmentTypeId;
  }

  public String getJobDesc() {
    return jobDesc;
  }

  public void setJobDesc(String jobDesc) {
    this.jobDesc = jobDesc;
  }

  public Date getAppoinmentDate() {
    return appoinmentDate;
  }

  public void setAppoinmentDate(Date appoinmentDate) {
    this.appoinmentDate = appoinmentDate;
  }
}

