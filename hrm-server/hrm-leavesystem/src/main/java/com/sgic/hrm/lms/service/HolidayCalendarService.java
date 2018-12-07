package com.sgic.hrm.lms.service;

import java.util.List;

import com.sgic.hrm.commons.entity.HolidayCalendar;

public interface HolidayCalendarService {
	
	boolean createHoliday(HolidayCalendar holidayCalendar);
	List<HolidayCalendar> viewAllHoliday();
	boolean updateHoliday(Integer id,HolidayCalendar holidayCalendar);
	boolean deleteholiday(Integer id);

}
