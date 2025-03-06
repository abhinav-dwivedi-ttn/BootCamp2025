package com.SpringBoot.SpringBootProject.service;

import com.SpringBoot.SpringBootProject.entity.User;
import com.SpringBoot.SpringBootProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//  Question - 1
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
