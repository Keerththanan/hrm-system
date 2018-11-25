package com.sgic.hrm.commons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.hrm.commons.entity.ProfessionalQualification;

@Repository
public interface ProfessionalQualificationRepository extends JpaRepository<ProfessionalQualification, Integer>{

}
