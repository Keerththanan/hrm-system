package com.sgic.hrm.commons.repository.trainee;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.trainee.AttendType;

public interface AttendTypeRepository extends JpaRepository<AttendType, Integer> {
	AttendType findAttendTypeById(Integer id);
}
