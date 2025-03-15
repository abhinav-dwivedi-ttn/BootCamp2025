package com.SpringDataJPA.SpringDataJPA.entity;

import com.SpringDataJPA.SpringDataJPA.embedded.Employee2Salary;
import jakarta.persistence.*;
import org.yaml.snakeyaml.tokens.ScalarToken;

@Entity
@Table(name = "employee_table")
public class Employee2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long id;

    @Column(name = "emp_first_name")
    private String firstName;

    @Column(name = "emp_last_name")
    private String lastName;

    //@Column(name = "emp_salary")
    //private Double salary;

    @Column(name = "emp_age")
    private int age;

    @Embedded
    private Employee2Salary employee2Salary;

    public Employee2Salary getEmployee2Salary() {
        return employee2Salary;
    }

    public void setEmployee2Salary(Employee2Salary employee2Salary) {
        this.employee2Salary = employee2Salary;
    }

    public Employee2() {}

//    public Employee2(String firstName, String lastName, Double salary, int age) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.salary = salary;
//        this.age = age;
//    }

    public Employee2(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    public Double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(Double salary) {
//        this.salary = salary;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
