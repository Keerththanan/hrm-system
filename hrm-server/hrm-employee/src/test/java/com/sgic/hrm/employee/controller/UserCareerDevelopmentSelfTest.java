package com.sgic.hrm.employee.controller;


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

public class UserCareerDevelopmentSelfTest extends HrmEmployeeApplicationTests{


  @Autowired
  private JdbcTemplate jdbcTemplate;
  
//  @Autowired
//  private RequestExperienceLetterService requestExperienceLetter;

  @Before
  public void initializeData() {
    //String newUserPlan = "INSERT INTO employee.user_career_development_plan (id, cdp_name,status,user_name) VALUES (1, 'WSO2','Plan','Jai')";
    String userCareerDevelopmentSelfData = "INSERT INTO employee.user_career_development_plan "
        + "(id, cdp_name, status, user_name) "
        + "VALUES (1, 'WSO2','Plan','Jai')";
    //jdbcTemplate.execute(newUser);
    jdbcTemplate.execute(userCareerDevelopmentSelfData);
  }

  @Test
  public void getuserCareerDevelopmentSelfData() throws IOException, RestClientException {
    ResponseEntity<String> response = testRestTemplate.exchange(HRM_SYSTEM_BASE_URL + "/usercareerdevelopmentplanself", HttpMethod.GET,
            new HttpEntity<>(httpHeaders), String.class);
    assertEquals(HttpStatus.OK, response.getStatusCode());
    assertEquals(userCareerDevelopmentSelfConstans.USER_CAREER_DEVELOPMENT_SELF_STRING,response.getBody());
  }

  @After
  public void dropAll() {
//    String leaveType1 = "delete from experience_letter.request_experience_letter where id=1";
//    jdbcTemplate.execute(leaveType1);
  }


  private final class userCareerDevelopmentSelfConstans {
    private userCareerDevelopmentSelfConstans() {}

    private static final String USER_CAREER_DEVELOPMENT_SELF_STRING =
        " {\r\n" + 
        "        \"id\": 1,\r\n" + 
        "        \"cdpName\": \"Leadership\",\r\n" + 
        "        \"userName\": \"Esther\",\r\n" + 
        "        \"status\": \"Process\"\r\n" + 
        "    }";
//        "[{\"id\":1,\"user\":{\"id\":1,\"userName\":\"natsu\"},\"noOfCopy\":2,\"reason\":\"just for fun\",\"competency\":\"magic\",\"createdAt\":\"2018-11-22T00:00:00+05:30\",\"status\":\"rejected\"}]";
            

  }

}
