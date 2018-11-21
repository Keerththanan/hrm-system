package com.sgic.hrm.lms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.Status;
import com.sgic.hrm.commons.repository.StatusRepository;
import com.sgic.hrm.lms.service.StatusService;

@Service
public class StatusServiceImpl implements StatusService {

	@Autowired
	StatusRepository statusRepository;

	@Override
	public boolean addStatus(Status status) {
		statusRepository.save(status);
		return true;
	}

	@Override
	public boolean editStatus(Integer id, Status status) {
		if (statusRepository.getOne(id) != null) {
			status.setId(id);
			statusRepository.save(status);
			return true;
		}
		return false;
	}

	@Override
	public List<Status> getAllstatus() {
		return statusRepository.findAll();

	}

	@Override
	public Status getStatus(Integer id) {
		return statusRepository.findById(id).orElse(null);
	}

	@Override
	public boolean deleteStatus(Integer id) {
		if (statusRepository.getOne(id) != null) {
			statusRepository.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public List<StatusServiceImpl> getAllStatus() {
		// TODO Auto-generated method stub
		return null;
	}

}
