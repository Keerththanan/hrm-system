package com.sgic.hrm.commons.entity.mapper;

import java.util.ArrayList;
import java.util.List;
import com.sgic.hrm.commons.dto.LeaveAllocationData;
import com.sgic.hrm.commons.entity.LeaveAllocation;

public class LeaveRequestToLeaveRequestDto {

  public static LeaveAllocationData mapLeaveAllocationDto(LeaveAllocation leaveAllocation) {
    LeaveAllocationData leaveAllocationData = new LeaveAllocationData();

    if (leaveAllocation != null) {
      leaveAllocationData.setId(leaveAllocation.getId());
      leaveAllocationData.setAllocatedDays(leaveAllocation.getAllocatedDays());
      leaveAllocationData.setUtilizedDays(leaveAllocation.getUtilizedDays());
      leaveAllocationData.setUser(UserToUserData.mapToUserData(leaveAllocation.getUser()));
      leaveAllocationData.setLeaveType(
          LeaveTypeToLeaveTypeData.mapToLeaveTypeData(leaveAllocation.getLeaveType()));

    }
    return leaveAllocationData;
  }

  public static List<LeaveAllocationData> mapLeaveAllocationDtoList(
      List<LeaveAllocation> leaveAllocationList) {
    List<LeaveAllocationData> leaveAllocationDataList = new ArrayList<LeaveAllocationData>();

    if (leaveAllocationList != null) {
      for (LeaveAllocation leaveAllocation : leaveAllocationList) {
        leaveAllocationDataList.add(mapLeaveAllocationDto(leaveAllocation));
      }
    }
    return leaveAllocationDataList;
  }

}
