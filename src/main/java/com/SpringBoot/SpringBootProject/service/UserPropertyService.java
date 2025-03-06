package com.SpringBoot.SpringBootProject.service;

import com.SpringBoot.SpringBootProject.configuration.UserProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//  Question - 2
@Service
public class UserPropertyService {

    @Autowired
    private UserProperty userProperty;

    public String getProperty() {
        return String.format("%s Hello, World! I am placed at TTN, Noida sector 144 Uttar Pradesh!", userProperty.getMyProperty());
    }
}
