package com.sgic.hrm.commons.dto.mapper;


import com.sgic.hrm.commons.dto.profile.UserDto;
import com.sgic.hrm.commons.entity.Role;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.trainee.entity.Department;

public class UserDtoToUser {
	public static User map(UserDto userDto)
	{
		User user =new User();
		user.setId(userDto.getId());
		user.setFullName(userDto.getFullName());
		user.setDateOfBirth(userDto.getDateOfBirth());
		user.setEmail(userDto.getEmail());
		user.setGender(userDto.getGender());
		user.setJoinDate(userDto.getJoinDate());
		user.setMaritalStatus(userDto.getMaritalStatus());
		user.setMobileNumber(userDto.getMaritalStatus());
		user.setNationality(userDto.getNationality());
		user.setNic(userDto.getNic());
		user.setPermenentAddress(userDto.getPermenentAddress());
		user.setResidentialAddress(userDto.getResidentialAddress());
		user.setReligion(userDto.getReligion());
		user.setTelephoneNumber(userDto.getTelephoneNumber());
		user.setServicePeriod(userDto.getServicePeriod());
		user.setProfilePhoto(userDto.getProfilePhoto());
		
		Department department=new Department();
		department.setId(userDto.getDepartment());
		
		Role role =new Role();
		role.setId(userDto.getRole());
		
		return user;
		
		
		
	}
}
