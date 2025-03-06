package com.SpringBoot.SpringBootProject.service;

import com.SpringBoot.SpringBootProject.entity.EmployeeBean;
import com.SpringBoot.SpringBootProject.exception.CustomException;
import com.SpringBoot.SpringBootProject.repository.EmployeeBeanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//  Question - 2
@Service
public class EmployeeBeanService {

    @Autowired
    private EmployeeBeanRepository employeeBeanRepository;

    private List<EmployeeBean> list = new ArrayList<>();

    public List<EmployeeBean> getAllEmployeeBean() {
        return list;
    }

    //  Question - 4
    public EmployeeBean getEmployeeBean(int id) {
        for(EmployeeBean employeeBean: list) {
            if(employeeBean.getId()==id)
                return employeeBean;
        }
        throw new CustomException("Employee Id Not Found!");
    }

    //  Question - 5
    public void addEmployeeBean(EmployeeBean employeeBean) {
        list.add(employeeBean);
    }

    //  Question - 7
    public void deleteEmployeeBean(int id) {
        //list.removeIf(employeeBean -> employeeBean.getId()==id);
        for(EmployeeBean employeeBean: list) {
            if(employeeBean.getId()==id)
                list.remove(id);
            return;
        }
        throw new CustomException("Employee Id Not Found!");
    }

    //  Question - 8
    public void updateEmployeeBean(int id, String name, int age) {
        for(EmployeeBean employeeBean: list) {
            if(employeeBean.getId()==id) {
                employeeBean.setAge(age);
                employeeBean.setName(name);
            }
            return;
        }
        throw new CustomException("Employee Id Not Found!");
    }
}
