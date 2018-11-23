package com.sgic.hrm.commons.dto;


import java.util.Date;

public class DiscussionScheduleData {
  Integer id;
  TerminationRequestData terminationRequest;
  Date time;
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

  

  public Date getTime() {
	return time;
}

public void setTime(Date time) {
	this.time = time;
}

public String getVenue() {
    return venue;
  }

  public void setVenue(String venue) {
    this.venue = venue;
  }

}
