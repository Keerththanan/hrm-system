package com.sgic.hrm.commons.entity.mapper;

import java.util.ArrayList;
import java.util.List;
import com.sgic.hrm.commons.dto.UserData;
import com.sgic.hrm.commons.entity.User;

public class UserToUserData {
	
	public static UserData mapToUserData(User user) {
		UserData userData = new UserData();		
		if(user != null) {
			userData.setUserId(user.getUserId());
			userData.setUserName(user.getUserName());
		}
		return userData;
	}
	
	public static List<UserData> mapToUserDataList(List<User> userList){
		List<UserData> userDataList = new ArrayList<UserData>();		
		if(userList != null) {
			for(User user:userList) {				
				userDataList.add(mapToUserData(user));
			}			
		}
		return userDataList;
	}

}
