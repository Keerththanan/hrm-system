package com.sgic.hrm.commons.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sgic.hrm.commons.entity.UserLoanDetails;

public interface UserLoanDetailsRepository extends JpaRepository<UserLoanDetails, Integer> {

	@Query("SELECT ul from UserLoanDetails ul WHERE ul.user.userId = ?1")
	List<UserLoanDetails> findByUserId(Integer userId);
	
}