package com.sgic.hrm.commons.repository.trainee;

import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sgic.hrm.commons.entity.trainee.AttendanceDetails;
import com.sgic.hrm.commons.entity.trainee.Trainee;

public interface AttendanceDetailsRepository extends JpaRepository<AttendanceDetails, Integer>{
	List<AttendanceDetails> findAttendanceDetailsByTrainee(Trainee trainee);
//	@Query("Select att from AttendanceDetails att where att.trainee.fullName=%")
//	
//	@Query("Select attendanceDetails From AttendanceDetails attendanceDetails where attendanceDetails.trainee.id=%?1 AND attendanceDetails.attendDate=%?1")
//	List<AttendanceDetails>findAttendetailsByTraineeByAttendDate(Trainee trainee,Date attendDate);

}
