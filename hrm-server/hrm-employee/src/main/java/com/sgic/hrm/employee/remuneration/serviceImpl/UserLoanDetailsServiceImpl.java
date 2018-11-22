package com.sgic.hrm.employee.remuneration.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.UserLoanDetails;
import com.sgic.hrm.commons.repository.UserLoanDetailsRepository;
import com.sgic.hrm.employee.remuneration.service.UserLoanDetailsService;
@Service
public class UserLoanDetailsServiceImpl implements UserLoanDetailsService{
@Autowired
private UserLoanDetailsRepository userLoanDetailsRepository;
	@Override
	public List<UserLoanDetails> getAllUserLoanDetails() {
		// TODO Auto-generated method stub
		return userLoanDetailsRepository.findAll();
	}
	@Override
	public Optional<UserLoanDetails> getUserLoanDetailsById(Integer id) {
		// TODO Auto-generated method stub	
		return userLoanDetailsRepository.findById(id);
	}

}
