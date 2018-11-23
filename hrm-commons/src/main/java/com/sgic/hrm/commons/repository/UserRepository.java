package com.sgic.hrm.commons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.hrm.commons.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	public User findUserById(Integer id);
}
