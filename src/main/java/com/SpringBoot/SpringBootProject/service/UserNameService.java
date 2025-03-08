package com.SpringBoot.SpringBootProject.service;

import com.SpringBoot.SpringBootProject.entity.EmployeeBean;
import com.SpringBoot.SpringBootProject.entity.User;
import com.SpringBoot.SpringBootProject.exception.CustomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserNameService {

    List<User> list = new ArrayList<>();

    public void setUser(User user) {
        list.add(user);
    }
    public List<User> getUser() {
        return list;
    }

    public void deleteUser(Long id) {
        //list.removeIf(employeeBean -> employeeBean.getId()==id);
        for(User user: list) {
            if(user.getId()==id)
                list.remove(id);
            return;
        }
        throw new CustomException("Employee Id Not Found!");
    }

    public User getfilteredUser(User user) {
        list.add(user);
        return user;
    }
}
