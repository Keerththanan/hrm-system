package com.sgic.hrm.profile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.dto.mapper.profile.UserDtoToUser;
import com.sgic.hrm.commons.dto.profile.UserDto;
import com.sgic.hrm.commons.entity.Department;
import com.sgic.hrm.commons.entity.Role;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.profile.service.DepartmentService;
import com.sgic.hrm.profile.service.RoleService;
import com.sgic.hrm.profile.service.UserService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private RoleService roleService;
	
	@PostMapping("/user")
	public HttpStatus AddUser(@RequestBody UserDto userDto) {
		Department department=departmentService.findByDepartmentId(userDto.getDepartment());
		Role role=roleService.findByRoleId(userDto.getRole());
		User user =UserDtoToUser.map(userDto);
		boolean test = userService.addUser(user, role, department);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	} 
	
	@GetMapping("/user")
	public ResponseEntity<List<User>> GetUser() {
		List<User> user = userService.getUser();
		ResponseEntity<List<User>> response = new ResponseEntity<>(user, HttpStatus.OK);
		return response;
	}
	
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable Integer id) {
		
			return userService.findByUserId(id);
		
	}
	@GetMapping("/userget/{fullName}")
	public User getUserByName(@PathVariable String fullName) {
		
			return userService.findByUserName(fullName);
	}

	@PutMapping("/user/{id}")
//	public ResponseEntity<String> updateUser(@PathVariable(name="id") Integer id,@RequestBody UserData userData){
//		User user=UserDataMapper.userDataMapper(userData);
//		if(userService.editUser(user, id))
//		{
//			return new ResponseEntity<>("updated",HttpStatus.OK);
//		}
//		return new ResponseEntity<>("upadte failed", HttpStatus.BAD_REQUEST);
//	}
	
	@DeleteMapping("user/{id}")
	public HttpStatus DeleteUser(@PathVariable Integer id) {
		boolean user=userService.deleteUser(id);
		if(user) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	} 
}