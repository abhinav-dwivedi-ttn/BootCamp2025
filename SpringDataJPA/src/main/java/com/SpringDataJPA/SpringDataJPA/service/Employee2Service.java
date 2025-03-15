package com.SpringDataJPA.SpringDataJPA.service;

import com.SpringDataJPA.SpringDataJPA.embedded.Employee2Salary;
import com.SpringDataJPA.SpringDataJPA.entity.Employee2;
import com.SpringDataJPA.SpringDataJPA.repository.Employee2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Employee2Service {

    @Autowired
    private Employee2Repository employee2Repository;

    public String createEmployee2(Employee2 employee2) {

        Employee2Salary employee2Salary = new Employee2Salary();
        employee2Salary.setBasicSalary(50000.00);
        employee2Salary.setBonusSalary(12000.00);
        employee2Salary.setTaxAmount(34000.00);
        employee2Salary.setSpecialAllowanceSalary(1290.00);

        employee2.setEmployee2Salary(employee2Salary);
        employee2Repository.save(employee2);
        return "Employee Created Successfully!";
    }

//    public List<Employee2> findEmployee2BySalaryGreaterThanAverageSalary() {
//        return employee2Repository.findEmployee2BySalaryGreaterThanAverageSalary();
//    }
//
//    public String updateEmployee2BySalary(Double updatedSalary) {
//        Double getEmployee2AverageSalary = employee2Repository.getEmployee2AverageSalary();
//        employee2Repository.updateEmployee2BySalary(updatedSalary, getEmployee2AverageSalary);
//        return "Employee2 Salary Updated!";
//    }
//
//    public String deleteEmployee2BySalary() {
//        Double getEmployee2MinSalary = employee2Repository.getEmployee2MinSalary();
//        employee2Repository.deleteEmployee2BySalary(getEmployee2MinSalary);
//        return "Employee2 With Minimum Salary Have Been Deleted!";
//    }
//
//    public List<Employee2> getEmployee2BylastName(String lastName) {
//        return employee2Repository.getEmployee2BylastName(lastName);
//    }
//
//    public String deleteEmployee2ByAge(int age) {
//        employee2Repository.deleteEmployee2ByAge(age);
//        return "Employee2 Have Been Deleted Successfully!";
//    }

}
