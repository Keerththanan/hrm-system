package com.sgic.hrm.lms.service;

import java.util.List;

import com.sgic.hrm.commons.entity.Status;
import com.sgic.hrm.lms.serviceimpl.StatusServiceImpl;

public interface StatusService {
	
	boolean addStatus(Status status);
	  boolean editStatus(Integer id, Status status);
	  List<Status> getAllstatus();
	  Status getStatus(Integer id);
	  boolean deleteStatus(Integer id);
	List<StatusServiceImpl> getAllStatus();
	

}
