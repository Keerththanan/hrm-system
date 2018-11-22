package com.sgic.hrm.employee.remuneration.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.entity.UserLoanDetails;
import com.sgic.hrm.employee.remuneration.service.UserLoanDetailsService;

@RestController
public class UserLoanDetailsController {
@Autowired
private UserLoanDetailsService userLoanDetailsService;
@GetMapping("/userloandetails")
public List<UserLoanDetails> viewAll(){
	return userLoanDetailsService.getAllUserLoanDetails();
}

@GetMapping("/userloandetails/{id}")
public Optional<UserLoanDetails> viewOneById(@PathVariable Integer id){
	return userLoanDetailsService.getUserLoanDetailsById(id);
}
}
