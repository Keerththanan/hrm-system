package com.sgic.hrm.commons.entity.mapper;

import com.sgic.hrm.commons.dto.UserDto;
import com.sgic.hrm.commons.entity.User;

public class UserMapper {

  public static UserDto mapUserDto(User user) {
    UserDto userDto = new UserDto();
    if(user != null) {
      user.setId(userDto.getId());
      user.setFullName(userDto.getUserName());
    }
    return userDto;
  }
}
