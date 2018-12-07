package com.sgic.hrm.commons.repository.privilege;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.privilege.AuthorizeType;

public interface AuthorizeTypeRepository extends JpaRepository<AuthorizeType, Integer>{

}
