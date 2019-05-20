package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.UserCareerDevelopmentPlanSelfData;
import com.sgic.hrm.commons.dto.UserCareerDevelopmentPlanSelfSaveData;
import com.sgic.hrm.commons.entity.CareerDevelopmentPlan;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.entity.UserCareerDevelopmentPlanSelf;

public class UserCareerDevelopmentPlanSelfDataMapper {
	
  private UserCareerDevelopmentPlanSelfDataMapper() {}
  
  public static UserCareerDevelopmentPlanSelf userCareerDevelopmentSelfDataMapper(UserCareerDevelopmentPlanSelfData userCareerDevelopmentSelfData) {
    UserCareerDevelopmentPlanSelf userCareerDevelopmentSelf = new UserCareerDevelopmentPlanSelf();

      userCareerDevelopmentSelf.setId(userCareerDevelopmentSelfData.getId());
      userCareerDevelopmentSelf.setUserId(UserDataMapper.userDataMapper(userCareerDevelopmentSelfData.getUserId()));
      userCareerDevelopmentSelf.setCdpId(CareerDevelopmentPlanDataMapper.careerDevelopmentPlanDataMapper(userCareerDevelopmentSelfData.getCdpId()));
      userCareerDevelopmentSelf.setStatus(userCareerDevelopmentSelfData.getStatus());
      return userCareerDevelopmentSelf;
  }
	
  public static UserCareerDevelopmentPlanSelf userCareerDevelopmentPlanSelfSaveDataMapper(UserCareerDevelopmentPlanSelfSaveData userCareerDevelopmentPlanSelfSaveData) {
    UserCareerDevelopmentPlanSelf userCareerDevelopmentPlanSelf = new UserCareerDevelopmentPlanSelf();
    User user=new User();
    CareerDevelopmentPlan careerDevelopmentPlan=new CareerDevelopmentPlan();
    
    userCareerDevelopmentPlanSelf.setId(userCareerDevelopmentPlanSelfSaveData.getId());
   
    user.setId(userCareerDevelopmentPlanSelfSaveData.getUserId());
    userCareerDevelopmentPlanSelf.setUserId(user);
    
    careerDevelopmentPlan.setId(userCareerDevelopmentPlanSelfSaveData.getCdpId());
    userCareerDevelopmentPlanSelf.setCdpId(careerDevelopmentPlan);
    
    userCareerDevelopmentPlanSelf.setStatus(userCareerDevelopmentPlanSelfSaveData.getStatus());
    return userCareerDevelopmentPlanSelf;
  }

}
