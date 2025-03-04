package com.SpringBoot.SpringBootProject.controller;

import com.SpringBoot.SpringBootProject.entity.User;
import com.SpringBoot.SpringBootProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

//  Question - 1
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/save/user")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
