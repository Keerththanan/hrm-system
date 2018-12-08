package com.sgic.hrm.commons.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sgic.hrm.commons.entity.User; 
import com.sgic.hrm.commons.entity.UserLoanDetails;

public interface UserLoanDetailsRepository extends JpaRepository<UserLoanDetails, Integer> {


	List<UserLoanDetails> findByUser(User user);
	
	@Query("SELECT u from UserLoanDetails u WHERE u.user.fullName LIKE ?1%")
	List<UserLoanDetails> findByUserName(String name);
	
	
}
