package com.sgic.hrm.commons.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.sgic.hrm.commons.entity.UserCareerDevelopmentPlanCompany;

public interface UserCareerDevelopmentPlanCompanyRepository extends JpaRepository<UserCareerDevelopmentPlanCompany, Integer>{
  @Query("select cdpc from UserCareerDevelopmentPlanCompany as cdpc where cdpc.userId.id = ?1")
  List<UserCareerDevelopmentPlanCompany> findById(int id); 
}
