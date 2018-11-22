package com.sgic.hrm.lms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.CarryforwardRequest;
import com.sgic.hrm.commons.enums.Status;
import com.sgic.hrm.commons.repository.CarryforwardRequestRepository;
import com.sgic.hrm.lms.service.CarryforwardRequestService;

@Service
public class CarryforwardRequestServiceImpl implements CarryforwardRequestService{

	@Autowired
	CarryforwardRequestRepository carryforwardRequestRepository;
	
	@Override
	public List<CarryforwardRequest> viewAllCarryforwardRequest() {
		return carryforwardRequestRepository.findAll(); 
	}

	@Override
	public boolean createCarryforwardRequest(CarryforwardRequest carryforwardRequest) {
		if(carryforwardRequest != null) {
			carryforwardRequest.setStatus(Status.PENDING);
			carryforwardRequestRepository.save(carryforwardRequest);
			return true;
		}
		return false;
	}

}
