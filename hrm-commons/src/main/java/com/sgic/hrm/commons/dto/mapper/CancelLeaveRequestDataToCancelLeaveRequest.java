package com.sgic.hrm.commons.dto.mapper;

import java.util.ArrayList;
import java.util.List;
import com.sgic.hrm.commons.dto.CancelLeaveRequestData;
import com.sgic.hrm.commons.entity.CancelLeaveRequest;


public class CancelLeaveRequestDataToCancelLeaveRequest {

  public static CancelLeaveRequest mapToCancelLeaveRequest(
      CancelLeaveRequestData cancelLeaveRequestdata) {
    CancelLeaveRequest cancelLeaveRequest = new CancelLeaveRequest();

    if (cancelLeaveRequestdata != null) {
      cancelLeaveRequest.setId(cancelLeaveRequestdata.getId());
      cancelLeaveRequest.setReason(cancelLeaveRequestdata.getReason());
      cancelLeaveRequest.setLeaveRequest(LeaveRequestDataToLeaveRequest
          .mapToLeaveRequest(cancelLeaveRequestdata.getLeaveRequest()));
      cancelLeaveRequest
          .setStatus(StatusDataToStatus.mapToStatus(cancelLeaveRequestdata.getStatus()));
    }
    return cancelLeaveRequest;
  }

  public static List<CancelLeaveRequest> mapToCancelLeaveRequestData(
      List<CancelLeaveRequestData> cancelLeaveRequestDataList) {
    List<CancelLeaveRequest> cancelLeaveRequestList = new ArrayList<CancelLeaveRequest>();

    if (cancelLeaveRequestDataList != null) {
      for (CancelLeaveRequestData cancelLeaveRequestData : cancelLeaveRequestDataList) {
        cancelLeaveRequestList.add(mapToCancelLeaveRequest(cancelLeaveRequestData));
      }
    }
    return cancelLeaveRequestList;
  }
}
