package com.sgic.hrm.employee.service;

import java.util.List;
import java.util.Optional;

import com.sgic.hrm.commons.entity.User;



public interface UserService {
	boolean addUser(User user);
	List<User> getUser();
	boolean editUser(User user,Integer id);
	Optional<User> getUserId(Integer id);
	boolean deleteUser(Integer id);

}
