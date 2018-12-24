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
import com.sgic.hrm.commons.dto.profile.UserSaveDto;
import com.sgic.hrm.commons.entity.Department;
import com.sgic.hrm.commons.entity.Role;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.entity.mapper.profile.UserMapper;
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
	public HttpStatus AddUser(@RequestBody UserSaveDto userSaveDto) {
		Department department=departmentService.findByDepartmentId(userSaveDto.getDepartment());
		Role role=roleService.findByRoleId(userSaveDto.getRole());
		User user =UserDtoToUser.map(userSaveDto);
		boolean test = userService.addUser(user, role, department);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	} 
	

	
	@GetMapping("/user")
	public ResponseEntity<List<UserDto>> GetUser() {
		List<UserDto> userDtoList = UserMapper.mapUserListToUserDtoList(userService.getUser());
		 return new ResponseEntity<>(userDtoList, HttpStatus.OK);
	}
	
	@GetMapping("/user/{id}")
	public UserDto getUserById(@PathVariable Integer id) {
		UserDto userDtoList = UserMapper.mapUserToUserDto(userService.findByUserId(id));
		return userDtoList;
	}
	@GetMapping("/userget/{fullName}")
	public UserDto getUserByName(@PathVariable String fullName) {
		UserDto userDto = UserMapper.mapUserToUserDto(userService.findByUserName(fullName));
		return userDto;
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