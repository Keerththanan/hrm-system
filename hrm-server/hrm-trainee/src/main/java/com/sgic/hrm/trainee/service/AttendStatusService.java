package com.sgic.hrm.trainee.service;

import java.util.List;

import com.sgic.hrm.commons.trainee.entity.AttendStatus;

public interface AttendStatusService {

	boolean addAttendanceStatus(AttendStatus attendStatus);

	List<AttendStatus> getAttendanceStatus();

	boolean editAttendStatus(AttendStatus attendStatus, Integer id);

	boolean deleteAttendStatus(Integer id);
}
