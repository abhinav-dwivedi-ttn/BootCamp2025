package com.SpringBoot.SpringBootProject.controller;

import com.SpringBoot.SpringBootProject.entity.Employee;
import com.SpringBoot.SpringBootProject.entity.User;
import com.SpringBoot.SpringBootProject.service.EmployeeService;
import com.SpringBoot.SpringBootProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//  Question - 3
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping(value = "/save/employee")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }
}
