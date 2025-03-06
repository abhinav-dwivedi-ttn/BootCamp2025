package com.SpringBoot.SpringBootProject.repository;

import com.SpringBoot.SpringBootProject.entity.EmployeeBean;
import org.springframework.data.jpa.repository.JpaRepository;

//  Question - 2
public interface EmployeeBeanRepository extends JpaRepository<EmployeeBean, Integer> {

}
