package com.sgic.hrm.lms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.LeaveAllocation;
import com.sgic.hrm.commons.repository.LeaveAllocationRepository;
import com.sgic.hrm.lms.service.LeaveAllocationService;

@Service
public class LeaveAllocationServiceImpl implements LeaveAllocationService{
	
	@Autowired
	LeaveAllocationRepository leaveAllocationRepository;

	@Override
	public boolean createLeaveAllocation(LeaveAllocation leaveAllocation) {
		if(leaveAllocation != null) {
			leaveAllocationRepository.save(leaveAllocation);
			return true;
		}
		return false;
	}

	@Override
	public List<LeaveAllocation> viewAllLeaveAllocation() {
		return leaveAllocationRepository.findAll();
	}

	@Override
	public boolean updateLeaveAllocation(Integer id, LeaveAllocation leaveAllocation) {
		if(leaveAllocationRepository.getOne(id)!= null) {
			leaveAllocation.setId(id);
			leaveAllocationRepository.save(leaveAllocation);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteLeaveAllocation(Integer id) {
		if(leaveAllocationRepository.getOne(id) != null) {
			leaveAllocationRepository.deleteById(id);
			return true;
		}
		return false;
	}

}
