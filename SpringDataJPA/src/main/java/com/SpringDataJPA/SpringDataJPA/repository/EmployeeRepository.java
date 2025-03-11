package com.SpringDataJPA.SpringDataJPA.repository;

import com.SpringDataJPA.SpringDataJPA.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Pageable;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public List<Employee> findByName(String name);

    public List<Employee> findByNameStartingWith(String prefix);

    Page<Employee> findAll(Pageable pageable);

    public List<Employee> findByAgeBetween(int start, int end);
}
