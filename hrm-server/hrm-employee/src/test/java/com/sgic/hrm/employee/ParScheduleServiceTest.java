package com.sgic.hrm.employee;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sgic.hrm.commons.dto.par.ScheduleParAppraisorsDtoPost;
import com.sgic.hrm.commons.dto.par.ScheduleParContentDtoPost;
import com.sgic.hrm.commons.entity.par.Par;
import com.sgic.hrm.employee.par.serviceCombined.ParScheduleService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ParScheduleServiceTest {

	@Autowired
	ParScheduleService parScheduleService;

	@Test
	public void createParScheduleService() {
		Par parObj = new Par(1, "EM002", null);
		List<ScheduleParAppraisorsDtoPost> scheduleParAppraisorList = new ArrayList<ScheduleParAppraisorsDtoPost>();
		scheduleParAppraisorList.add(new ScheduleParAppraisorsDtoPost("A001"));
		scheduleParAppraisorList.add(new ScheduleParAppraisorsDtoPost("A002"));

		List<ScheduleParContentDtoPost> scheduleParContentList = new ArrayList<ScheduleParContentDtoPost>();
		scheduleParContentList.add(new ScheduleParContentDtoPost("C001"));
		scheduleParContentList.add(new ScheduleParContentDtoPost("C002"));
		scheduleParContentList.add(new ScheduleParContentDtoPost("C003"));

		parScheduleService.createSchedulePar(parObj, scheduleParAppraisorList, scheduleParContentList);
	}
}