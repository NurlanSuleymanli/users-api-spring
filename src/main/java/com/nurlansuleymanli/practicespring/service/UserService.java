package com.nurlansuleymanli.practicespring.service;

import com.nurlansuleymanli.practicespring.repository.UserRepository;
import com.nurlansuleymanli.practicespring.dto.UserDto;
import com.nurlansuleymanli.practicespring.mapper.UserMapper;
import com.nurlansuleymanli.practicespring.mapper.UserMapperImpl;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserService {

    final UserRepository userRepository;
    final UserMapper userMapper = new UserMapperImpl();

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public void createService(UserDto user){
        userRepository.createRepository(userMapper.toUser(user));
    }

    public List<UserDto> getAllUsersService(){

        return userRepository.getAllUsersRepository().stream()
               .map(userMapper::toUserDto)
               .toList();

    }

    public UserDto getUserByIDService(Long id){

        return userMapper.toUserDto(userRepository.getUserByIDRepository(id));

    }

    public void deleteUserByIDService(Long id){
         userRepository.deleteUserByIDRepository(id);
    }

    public void updateUserByIDService(Long id , String mail){
        userRepository.updateUserByIDRepository(id,mail);
    }

}
