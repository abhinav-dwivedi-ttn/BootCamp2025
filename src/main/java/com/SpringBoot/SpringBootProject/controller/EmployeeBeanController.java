package com.SpringBoot.SpringBootProject.controller;

import com.SpringBoot.SpringBootProject.entity.EmployeeBean;
import com.SpringBoot.SpringBootProject.service.EmployeeBeanService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//  Question - 2
@RestController
@RequestMapping("/employees")
public class EmployeeBeanController {

    @Autowired
    private EmployeeBeanService employeeBeanService;

    //  Question - 3
    @GetMapping("/allemployees")
    public List<EmployeeBean> getAllEmployeeBean() {
        return employeeBeanService.getAllEmployeeBean();
    }

    //  Question - 4
    @GetMapping("/employee/{id}")
    public EmployeeBean getEmployeeBean(@PathVariable int id) {
        return employeeBeanService.getEmployeeBean(id);
    }

    //  Question - 5
    @PostMapping()
    public void addEmployeeBean(@Valid @RequestBody EmployeeBean employeeBean) {
        employeeBeanService.addEmployeeBean(employeeBean);
    }

    //  Question - 7
    @DeleteMapping("/delemployee/{id}")
    public String deleteEmployeeBean(@PathVariable int id) {
        employeeBeanService.deleteEmployeeBean(id);
        return "Employee with Id " + id + " has been deleted!";
    }

    //  Question - 8
    @PutMapping("/updateemployee/{id}/{name}/{age}")
    public void updateEmployeeBean(@PathVariable int id, @PathVariable String name, @PathVariable int age) {
        employeeBeanService.updateEmployeeBean(id, name, age);
    }
}
