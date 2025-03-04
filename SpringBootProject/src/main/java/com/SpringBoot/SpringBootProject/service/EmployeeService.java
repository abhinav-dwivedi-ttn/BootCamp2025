package com.SpringBoot.SpringBootProject.service;

import com.SpringBoot.SpringBootProject.entity.Employee;
import com.SpringBoot.SpringBootProject.entity.User;
import com.SpringBoot.SpringBootProject.repository.EmployeeRepository;
import com.SpringBoot.SpringBootProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//  Question - 3
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
