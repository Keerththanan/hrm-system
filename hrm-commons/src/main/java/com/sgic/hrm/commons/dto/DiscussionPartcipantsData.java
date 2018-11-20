package com.sgic.hrm.commons.dto;

public class DiscussionPartcipantsData {
  Integer id;
  String employee;
  DiscussionScheduleData discussionSchedule;

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

  public DiscussionScheduleData getDiscussionSchedule() {
    return discussionSchedule;
  }

  public void setDiscussionSchedule(DiscussionScheduleData discussionSchedule) {
    this.discussionSchedule = discussionSchedule;
  }

}
