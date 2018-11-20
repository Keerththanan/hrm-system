package com.sgic.hrm.commons.dto;

import java.time.ZonedDateTime;

public class DiscussionScheduleData {
  Integer id;
  TerminationRequestData terminationRequest;
  ZonedDateTime time;
  String venue;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TerminationRequestData getTerminationRequest() {
    return terminationRequest;
  }

  public void setTerminationRequest(TerminationRequestData terminationRequest) {
    this.terminationRequest = terminationRequest;
  }

  public ZonedDateTime getTime() {
    return time;
  }

  public void setTime(ZonedDateTime time) {
    this.time = time;
  }

  public String getVenue() {
    return venue;
  }

  public void setVenue(String venue) {
    this.venue = venue;
  }

}
