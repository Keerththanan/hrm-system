package com.sgic.hrm.commons.dto;

public class DiscussionPartcipantsDto {
  Integer id;
  String employee;
  DiscussionScheduleDto discussionSchedule;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getEmployee() {
    return employee;
  }

  public void setEmployee(String employee) {
    this.employee = employee;
  }

  public DiscussionScheduleDto getDiscussionSchedule() {
    return discussionSchedule;
  }

  public void setDiscussionSchedule(DiscussionScheduleDto discussionSchedule) {
    this.discussionSchedule = discussionSchedule;
  }

}
