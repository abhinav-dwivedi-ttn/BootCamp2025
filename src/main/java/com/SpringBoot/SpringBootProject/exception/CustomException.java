package com.SpringBoot.SpringBootProject.exception;

//  Question - 6
public class CustomException extends RuntimeException{
    public CustomException(String message) {
        super(message);
    }
}
