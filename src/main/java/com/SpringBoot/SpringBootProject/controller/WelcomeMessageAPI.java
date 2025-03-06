package com.SpringBoot.SpringBootProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//  Question-1
@RestController
public class WelcomeMessageAPI {

    @GetMapping("/message")
    public String getMessage() {
        return "Welcome To Spring Boot";
    }
}
