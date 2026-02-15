package com.nurlansuleymanli.practicespring.mapper;

import com.nurlansuleymanli.practicespring.dto.UserDto;
import com.nurlansuleymanli.practicespring.model.User;



public class UserMapperImpl implements UserMapper{
    @Override
    public User toUser(UserDto user) {

        return new User(null, user.getName(), user.getSurname(), user.getAge(), user.getMail());

    }

    @Override
    public UserDto toUserDto(User user) {
        return new UserDto(user.getName(), user.getSurname(), user.getAge(), user.getMail());
    }
}
