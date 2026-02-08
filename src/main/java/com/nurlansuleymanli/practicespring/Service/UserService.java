package com.nurlansuleymanli.practicespring.Service;

import com.nurlansuleymanli.practicespring.Repository.UserRepository;
import com.nurlansuleymanli.practicespring.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    private  final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createService(User user){
        userRepository.createRepository(user);
    }

    public List<User> getAllUsersService(){
       return userRepository.getAllUsersRepository();
    }

    public User getUserByIDService(Long id){
        return userRepository.getUserByIDRepository(id);
    }

    public void deleteUserByIDService(Long id){
         userRepository.deleteUserByIDRepository(id);
    }

    public void updateUserByIDService(Long id , String mail){
        userRepository.updateUserByIDRepository(id,mail);
    }

}
