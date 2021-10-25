package com.clean.code.springboot.service;

import com.clean.code.springboot.domain.User;
import com.clean.code.springboot.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User create(User user){
        return userRepository.save(user);
    }

    public Boolean checkUserName(String userName){
        return userRepository.exsistByUserName(userName);
    }
}
