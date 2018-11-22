package com.sgic.hrm.commons.dto;

import java.io.File;

public class TerminationRecordData {
  Integer id;
  UserData employee;
  TerminationTypeData terminationType;
  String causeOfTermination;
  String disciplinaryProcedures;
  String legalStatus;
  File exitInterview;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public UserData getEmployee() {
    return employee;
  }

  public void setEmployee(UserData employee) {
    this.employee = employee;
  }

  public TerminationTypeData getTerminationType() {
    return terminationType;
  }

  public void setTerminationType(TerminationTypeData terminationType) {
    this.terminationType = terminationType;
  }

  public String getCauseOfTermination() {
    return causeOfTermination;
  }

  public void setCauseOfTermination(String causeOfTermination) {
    this.causeOfTermination = causeOfTermination;
  }

  public String getDisciplinaryProcedures() {
    return disciplinaryProcedures;
  }

  public void setDisciplinaryProcedures(String disciplinaryProcedures) {
    this.disciplinaryProcedures = disciplinaryProcedures;
  }

  public String getLegalStatus() {
    return legalStatus;
  }

  public void setLegalStatus(String legalStatus) {
    this.legalStatus = legalStatus;
  }

  public File getExitInterview() {
    return exitInterview;
  }

  public void setExitInterview(File exitInterview) {
    this.exitInterview = exitInterview;
  }

}
