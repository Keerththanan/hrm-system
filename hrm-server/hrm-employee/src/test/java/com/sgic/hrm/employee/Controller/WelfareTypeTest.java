package com.sgic.hrm.employee.Controller;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.client.RestClientException;

import com.sgic.hrm.employee.HrmEmployeeApplicationTests;

public class WelfareTypeTest extends HrmEmployeeApplicationTests {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Before
	public void initializeData() {
		String newWelfareType = "INSERT INTO employee.welfare_type (id, welfare_type_name) VALUES (2, 'utre4e')";

		jdbcTemplate.execute(newWelfareType);

	}

	@Test
	public void getAllWelfareType() throws IOException, RestClientException {
		ResponseEntity<String> response = testRestTemplate.exchange(HRM_SYSTEM_BASE_URL + "/welfaretype", HttpMethod.GET,
				new HttpEntity<>(httpHeaders), String.class);
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals(welfareConstants.WELFARE_TYPE_STRING, response.getBody());
	}

	@After
	public void dropAll() {
//		String leaveType1 = "delete from experience_letter.request_experience_letter where id=1";
//		jdbcTemplate.execute(leaveType1);
	}

	final class welfareConstants {
		private welfareConstants() {
		}

		private static final String WELFARE_TYPE_STRING = "[{ \"id\": 2, \"welfareTypeName\": \"utre4e\"}]";

	}

}
