package com.SpringDataJPA.SpringDataJPA.service;

import com.SpringDataJPA.SpringDataJPA.entity.Employee;
import com.SpringDataJPA.SpringDataJPA.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Scanner;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public String createEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "Employee Created Successfully!";
    }

    public String updateEmployee(int id, int newAge) {
        Employee employee = employeeRepository.findById(id).orElse(null);
        if(employee != null) {
            employee.setAge(newAge);
            employeeRepository.save(employee);
            return "Employee Details Have Been Updated Successfully!";
        }
        return "Employee Id Not Found!";
    }

    public String deleteEmployee(int id) {
        Employee employee = employeeRepository.findById(id).orElse(null);
        if(employee != null) {
            employeeRepository.deleteById(id);
            return "Employee Have Been Deleted Successfully!";
        }
        return "Employee Id Not Found!";
    }

    public String getEmployee(int id) {
        Employee employee = employeeRepository.findById(id).orElse(null);
        if(employee != null) {
            return "[ " + employee.getId()+ " " + employee.getName() + " " + employee.getAge() + " " + employee.getLocation()+ " ]";
        }
        return "Employee Id Not Found!";
    }

    public long getEmployeeCount() {
        return employeeRepository.count();
    }

    public List<Employee> getEmployeeByName(String name) {
        return employeeRepository.findByName(name);
    }

    public List<Employee> getEmployeeByNameStartingWith(String prefix) {
        return employeeRepository.findByNameStartingWith(prefix);
    }

    public List<Employee> getEmployeeByAgeBetween(int start, int end) {
        return employeeRepository.findByAgeBetween(start, end);
    }

    public Page<Employee> getEmployeeByAge(int page, int size) {
        Pageable pageable = PageRequest.of(page, size, Sort.by("age").ascending());
        return employeeRepository.findAll(pageable);
    }
}
