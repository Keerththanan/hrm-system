package com.sgic.hrm.commons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sgic.hrm.commons.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
