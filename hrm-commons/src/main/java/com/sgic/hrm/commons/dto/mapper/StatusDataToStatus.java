package com.sgic.hrm.commons.dto.mapper;

import java.util.ArrayList;
import java.util.List;
import com.sgic.hrm.commons.dto.StatusData;
import com.sgic.hrm.commons.entity.Status;

public class StatusDataToStatus {

  public static Status mapToStatus(StatusData statusData) {
      Status status = new Status();
      
      if(statusData != null) {
        status.setId(statusData.getId());
        status.setStatusValue(statusData.getStatusValue());
      }
      return status;
  }
  
  public static List<Status> mapToStatusDataList(List<StatusData> statusDataList){
    List<Status> statusList = new ArrayList<Status>();
    if(statusDataList != null) {
        for(StatusData statusData:statusDataList) {
            statusList.add(mapToStatus(statusData));
        }
    }
    return statusList;
}
}
