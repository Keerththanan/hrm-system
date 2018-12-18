package com.sgic.hrm.lms.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.dto.CarryforwardObjectData;
import com.sgic.hrm.commons.entity.AcceptCarryforwardRequest;
import com.sgic.hrm.commons.entity.CarryforwardRequest;
import com.sgic.hrm.commons.entity.RejectCarryforwardRequest;
import com.sgic.hrm.commons.enums.Status;
import com.sgic.hrm.commons.repository.AcceptCarryForwardRequestRepository;
import com.sgic.hrm.commons.repository.CarryforwardRequestRepository;
import com.sgic.hrm.commons.repository.RejectCarryforwardRequestRepository;
import com.sgic.hrm.lms.service.CarryforwardRequestService;
import com.sgic.hrm.lms.service.LeaveAllocationService;
import com.sgic.hrm.lms.service.LoginService;

@Service
public class CarryforwardRequestServiceImpl implements CarryforwardRequestService {

	@Autowired
	CarryforwardRequestRepository carryforwardRequestRepository;
	@Autowired
	AcceptCarryForwardRequestRepository acceptCarryForwardRequestRepository;
	@Autowired
	RejectCarryforwardRequestRepository rejectCarryForwardRequestRepository;
	
	@Autowired
	LeaveAllocationService leaveAllocationService;
	@Autowired
	LoginService loginService;

	@Override
	public List<CarryforwardRequest> viewAllCarryforwardRequest() {
		return carryforwardRequestRepository.findAll();
	}

	@Override
	public CarryforwardRequest getByUsername(String username) {
		return carryforwardRequestRepository.findByUser(loginService.getUser(username)).orElse(null);
	}

	@Transactional
	@Override
	public boolean createCarryforwardRequest(CarryforwardObjectData carryforwardObjectData) {
		if (carryforwardObjectData != null) {
			CarryforwardRequest carryforwardRequest = new CarryforwardRequest();
			carryforwardRequest.setStatus(Status.PENDING);
			carryforwardRequest.setUser(loginService.getUser(carryforwardObjectData.getUserName()));
			carryforwardRequest.setCarryForwardDays(carryforwardObjectData.getCarryforwardDays());
			if (leaveAllocationService.deductCarryforwardedDays(carryforwardRequest)) {
				carryforwardRequestRepository.save(carryforwardRequest);
				return true;
			}
		}
		return false;
	}

	@Transactional
	@Override
	public boolean acceptCarryforwardRequest(String username, CarryforwardRequest carryforwardRequest) {

		carryforwardRequest.setStatus(Status.ACCEPTED);
		carryforwardRequestRepository.save(carryforwardRequest);
		AcceptCarryforwardRequest acceptCarryforwardRequest = new AcceptCarryforwardRequest();
		acceptCarryforwardRequest.setCarryforwardRequest(carryforwardRequest);
		acceptCarryforwardRequest.setAcceptedBy(loginService.getUser(username));
		acceptCarryForwardRequestRepository.save(acceptCarryforwardRequest);
		return true;
	}

	@Transactional
	@Override
	public boolean rejectCarryforwardRequest(String username, CarryforwardRequest carryforwardRequest, String reason) {

		carryforwardRequest.setStatus(Status.REJECTED);
		if (leaveAllocationService.deductCarryforwardedDays(carryforwardRequest)) {
			carryforwardRequestRepository.save(carryforwardRequest);
		}
		RejectCarryforwardRequest rejectCarryforwardRequest = new RejectCarryforwardRequest();
		rejectCarryforwardRequest.setCarryforwardRequest(carryforwardRequest);
		rejectCarryforwardRequest.setRejectedBy(loginService.getUser(username));
		rejectCarryforwardRequest.setReason(reason);
		rejectCarryForwardRequestRepository.save(rejectCarryforwardRequest);
		return true;
	}
}
