package com.sgic.hrm.commons.dto.mapper;

import java.util.ArrayList;
import java.util.List;
import com.sgic.hrm.commons.dto.UserDto;
import com.sgic.hrm.commons.entity.User;

public class UserDtoMapper {

  public static User mapUser(UserDto userDto) {
    User user = new User();
    if(userDto != null) {
      user.setId(userDto.getId());
      user.setFullName((userDto.getUserName()));
    }
    return user;
  }
  
  public static List<User> mapUserList(List<UserDto> userDtos){
    List<User> userList = new ArrayList<User>();
    if(userDtos != null) {
      for(UserDto userDto : userDtos) {
        userList.add(mapUser(userDto));
      }
    }
    return userList;
  }
}
