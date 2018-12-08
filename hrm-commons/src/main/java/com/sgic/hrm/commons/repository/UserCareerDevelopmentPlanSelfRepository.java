package com.sgic.hrm.commons.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.sgic.hrm.commons.entity.UserCareerDevelopmentPlanSelf;


public interface UserCareerDevelopmentPlanSelfRepository extends JpaRepository<UserCareerDevelopmentPlanSelf, Integer>{

  @Query("select cdps from UserCareerDevelopmentPlanSelf as cdps where cdps.userId.id = ?1")
  List<UserCareerDevelopmentPlanSelf> findById(int id); 
  
}
