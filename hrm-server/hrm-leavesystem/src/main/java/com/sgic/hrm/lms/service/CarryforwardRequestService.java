package com.sgic.hrm.lms.service;

import java.util.List;

import com.sgic.hrm.commons.entity.CarryforwardRequest;

public interface CarryforwardRequestService {
	
	List<CarryforwardRequest> viewAllCarryforwardRequest();
	boolean createCarryforwardRequest(CarryforwardRequest carryforwardRequest);

}
