package com.sgic.hrm.lms.service;

import java.util.List;

import com.sgic.hrm.commons.entity.LeaveAllocation;

;public interface LeaveAllocationService {
	boolean createLeaveAllocation(LeaveAllocation leaveAllocation);
	List<LeaveAllocation> viewAllLeaveAllocation();
	boolean updateLeaveAllocation(Integer id,LeaveAllocation leaveAllocation);
	boolean deleteLeaveAllocation(Integer id);
}
