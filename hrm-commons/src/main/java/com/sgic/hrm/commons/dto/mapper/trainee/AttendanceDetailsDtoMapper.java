package com.sgic.hrm.commons.dto.mapper.trainee;

import com.sgic.hrm.commons.dto.trainee.AttendanceDetailsDto;
import com.sgic.hrm.commons.entity.trainee.AttendStatus;
import com.sgic.hrm.commons.entity.trainee.AttendType;
import com.sgic.hrm.commons.entity.trainee.AttendanceDetails;
import com.sgic.hrm.commons.entity.trainee.Trainee;

public class AttendanceDetailsDtoMapper {
	public static AttendanceDetails map(AttendanceDetailsDto attendanceDetailsDto) {
		AttendanceDetails attendanceDetails = new AttendanceDetails();
		Trainee trainee = new Trainee();
		AttendType attendType = new AttendType();
		AttendStatus attendStatus = new AttendStatus();

		attendanceDetails.setId(attendanceDetailsDto.getId());
		attendanceDetails.setStartTime(attendanceDetailsDto.getStartTime());
		attendanceDetails.setEndTime(attendanceDetailsDto.getEndTime());
		attendanceDetails.setDuration(attendanceDetailsDto.getDuration());
		attendanceDetails.setUpdateAt(attendanceDetailsDto.getUpdateAt());
		attendanceDetails.setAttendDate(attendanceDetailsDto.getAttendDate());
		attendType.setId(attendanceDetailsDto.getAttendType());
		trainee.setId(attendanceDetailsDto.getTrainee());
		attendStatus.setId(attendanceDetailsDto.getAttendantStatus());
		return attendanceDetails;
	}

}
