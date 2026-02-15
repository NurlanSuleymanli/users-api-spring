package com.nurlansuleymanli.practicespring.controller;

import com.nurlansuleymanli.practicespring.service.UserService;
import com.nurlansuleymanli.practicespring.dto.UserDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private final UserService userService;


    @PostMapping
    public void createUser(@RequestBody UserDto user){
        userService.createService(user);
    }

    @GetMapping
    public List<UserDto> getAllUsers(){
        return userService.getAllUsersService();
    }

    @GetMapping("/{id}")
    public UserDto getUserByID(@PathVariable Long id){
        return userService.getUserByIDService(id);
    }


    @DeleteMapping("/{id}")
    public void deleteUserByID(@PathVariable Long id){
        userService.deleteUserByIDService(id);
    }


    @PutMapping("/{id}")
    public void updateUserByID(@PathVariable Long id, @RequestBody String mail){
        userService.updateUserByIDService(id,mail);
    }




}
