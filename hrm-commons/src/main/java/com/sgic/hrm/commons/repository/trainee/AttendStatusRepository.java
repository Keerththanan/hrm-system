package com.sgic.hrm.commons.repository.trainee;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.trainee.AttendStatus;

public interface AttendStatusRepository extends JpaRepository<AttendStatus, Integer> {
	AttendStatus findAttendStatusById(Integer id);
}
