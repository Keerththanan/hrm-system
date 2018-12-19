package com.sgic.hrm.lms.service;

import java.util.List;

import com.sgic.hrm.commons.dto.CarryforwardObjectData;
import com.sgic.hrm.commons.entity.CarryforwardRequest;

public interface CarryforwardRequestService {
	
	List<CarryforwardRequest> viewAllCarryforwardRequest();
	boolean createCarryforwardRequest(CarryforwardObjectData carryforwardObjectData);
	boolean acceptCarryforwardRequest(String username, CarryforwardRequest carryforwardRequest);
	boolean rejectCarryforwardRequest(String username, CarryforwardRequest carryforwardRequest, String reason);
	CarryforwardRequest getByUsername(String username);

}
