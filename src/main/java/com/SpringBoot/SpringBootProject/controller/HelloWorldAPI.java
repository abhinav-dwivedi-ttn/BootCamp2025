package com.SpringBoot.SpringBootProject.controller;

import com.SpringBoot.SpringBootProject.service.UserPropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//  Question - 2
@RestController
public class HelloWorldAPI {

    @Autowired
    private UserPropertyService userPropertyService;

    @GetMapping(value="/getmessage")
    public String getMessage() {
        return userPropertyService.getProperty();
    }
}
