package com.sgic.hrm.commons.entity.mapper.profile;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.profile.UserDto;
import com.sgic.hrm.commons.entity.User;

public class UserMapper {
	public static UserDto mapUserToUserDto(User user) {
		UserDto userDto=new UserDto();
		
		userDto.setId(user.getId());
		userDto.setDateOfBirth(user.getDateOfBirth());
		userDto.setDepartment(user.getDepartment());
		userDto.setEmail(user.getEmail());
		userDto.setFullName(user.getFullName());
		userDto.setGender(user.getGender());
		userDto.setJoinDate(user.getJoinDate());
		userDto.setMaritalStatus(user.getMaritalStatus());
		userDto.setMobileNumber(user.getMobileNumber());
		userDto.setNationality(user.getNationality());
		userDto.setNic(user.getNic());
		userDto.setPermenentAddress(user.getPermenentAddress());
		userDto.setProfilePhoto(user.getProfilePhoto());
		userDto.setReligion(user.getReligion());
		userDto.setResidentialAddress(user.getResidentialAddress());
		userDto.setRole(user.getRole());
		userDto.setServicePeriod(user.getServicePeriod());
		userDto.setTelephoneNumber(user.getTelephoneNumber());
		userDto.setUpdateAt(user.getUpdateAt());
		
		
		return userDto;
	}
	public static List<UserDto> mapUserListToUserDtoList(List<User> userList){
		List<UserDto> userDtoList=new ArrayList<UserDto>();
		if(userList !=null) {
			for(User user:userList) {
				userDtoList.add(mapUserToUserDto(user));	
			}
		}
		return userDtoList;
	}
}
