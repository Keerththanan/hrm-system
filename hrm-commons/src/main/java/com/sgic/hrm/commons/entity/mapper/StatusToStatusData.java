package com.sgic.hrm.commons.entity.mapper;

import java.util.ArrayList;
import java.util.List;
import com.sgic.hrm.commons.dto.StatusData;
import com.sgic.hrm.commons.entity.Status;

public class StatusToStatusData {

  public static StatusData mapToStatusData(Status status) {
    StatusData statusData = new StatusData();
    if (status != null) {
      statusData.setId(status.getId());
      statusData.setStatusValue(status.getStatusValue());
    }
    return statusData;
  }

  public static List<StatusData> mapToStatusDataList(List<Status> statusList) {
    List<StatusData> statusDataList = new ArrayList<StatusData>();
    if (statusList != null) {
      for (Status status : statusList) {
        statusDataList.add(mapToStatusData(status));
      }
    }
    return statusDataList;
  }
}
