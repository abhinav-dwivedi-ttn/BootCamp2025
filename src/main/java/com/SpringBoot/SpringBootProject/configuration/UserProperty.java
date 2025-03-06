package com.SpringBoot.SpringBootProject.configuration;

import org.hibernate.annotations.NotFound;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;


//  Question - 2
@Component
@ConfigurationProperties(prefix = "user")
public class UserProperty {

    @NonNull
    private String myProperty;

    public String getMyProperty() {
        return myProperty;
    }

    public void setMyProperty(String myProperty) {
        this.myProperty = myProperty;
    }
}
