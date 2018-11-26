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

public class RequestPromotionControllerTest extends HrmEmployeeApplicationTests{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	// @Autowired
	// private RequestExperienceLetterService requestExperienceLetter;

	@Before
	public void initializeData() {
//		String newUser = "INSERT INTO profile.user (id, user_name) VALUES (1, 'natsu')";
		String requestPromotion = "INSERT INTO employee.request_promotion "
				+ "(id, userId, designationId, promotionRemark, recommendedBy, createdAt) "
				+ "VALUES (1,1,1,'gghgh','hghgh', '2018-11-22T00:00:00+05:30')";
//		jdbcTemplate.execute(newUser);
		jdbcTemplate.execute(requestPromotion);
	}

	@Test
	public void getAllRequestPromotion() throws IOException, RestClientException {
		ResponseEntity<String> response = testRestTemplate.exchange(HRM_SYSTEM_BASE_URL + "/requestpromotion",
				HttpMethod.GET, new HttpEntity<>(httpHeaders), String.class);
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals(requestPromotionConstants.REQUEST_PROMOTION_STRING, response.getBody());
	}

	
	@After
	public void dropAll() {
		String reqpromotion = "delete from employee.request_promotion where id=1";
		jdbcTemplate.execute(reqpromotion);
	}

	private final class requestPromotionConstants {
		private requestPromotionConstants() {
		}

		private static final String REQUEST_PROMOTION_STRING = "[{\"id\":1,\"user\":{\"id\":1,\"userName\":\"natsu\"},\"noOfCopy\":2,\"reason\":\"just for fun\",\"competency\":\"magic\",\"createdAt\":\"2018-11-22T00:00:00+05:30\",\"status\":\"rejected\"}]";

	}

}