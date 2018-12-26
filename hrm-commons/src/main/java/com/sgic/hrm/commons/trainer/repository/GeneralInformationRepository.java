package com.sgic.hrm.commons.trainer.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.trainer.GeneralInformation;

public interface GeneralInformationRepository extends JpaRepository<GeneralInformation, Integer> {

}
