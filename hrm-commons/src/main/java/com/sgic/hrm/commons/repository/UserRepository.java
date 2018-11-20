package com.sgic.hrm.commons.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
