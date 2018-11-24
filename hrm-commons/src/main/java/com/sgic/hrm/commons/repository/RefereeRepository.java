package com.sgic.hrm.commons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.hrm.commons.entity.Referee;

@Repository
public interface RefereeRepository extends JpaRepository<Referee, Integer> {
	

}
