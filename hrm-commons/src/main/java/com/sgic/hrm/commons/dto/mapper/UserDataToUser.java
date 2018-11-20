package com.sgic.hrm.commons.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.UserData;
import com.sgic.hrm.commons.entity.User;

public class UserDataToUser {
	
	public static User mapToUser(UserData userData ) {
		User user = new User();
		if (userData != null) {
			user.setUserId(userData.getUserId());
			user.setUserName(userData.getUserName());
			return user;
		}
		return null;
	}
	
	
	public static List<User> mapToUserDataList(List<UserData> userDataList) {
		List<User> User = new ArrayList<User>();

		if (userDataList != null) {
			for (UserData userData : userDataList) {
				User.add(mapToUser(userData));
			}
			return User;
			
		}
		return null;
		
}
	
	
	
	
	

}
