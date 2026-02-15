package com.nurlansuleymanli.practicespring.mapper;

import com.nurlansuleymanli.practicespring.dto.UserDto;
import com.nurlansuleymanli.practicespring.model.User;


public interface UserMapper {

     User toUser (UserDto user);

     UserDto toUserDto (User user);

}
