package com.nurlansuleymanli.practicespring.Controller;

import com.nurlansuleymanli.practicespring.Service.UserService;
import com.nurlansuleymanli.practicespring.model.User;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void createUser(@RequestBody User user){
        userService.createService(user);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsersService();
    }

    @GetMapping("/{id}")
    public User getUserByID(@PathVariable Long id){
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
