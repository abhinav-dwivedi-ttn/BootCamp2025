package com.SpringBoot.SpringBootProject.repository;

import com.SpringBoot.SpringBootProject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//  Question - 3
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
