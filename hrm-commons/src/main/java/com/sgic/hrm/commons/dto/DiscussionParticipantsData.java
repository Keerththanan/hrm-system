package com.sgic.hrm.commons.dto;

public class DiscussionParticipantsData {
  Integer id;
  UserData employee;
  DiscussionScheduleData discussionSchedule;

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

public DiscussionScheduleData getDiscussionSchedule() {
    return discussionSchedule;
  }

  public void setDiscussionSchedule(DiscussionScheduleData discussionSchedule) {
    this.discussionSchedule = discussionSchedule;
  }

}
