package com.SpringDataJPA.SpringDataJPA.repository;

import com.SpringDataJPA.SpringDataJPA.entity.Employee2;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Employee2Repository extends JpaRepository<Employee2, Long> {

//    @Query("select e1 from Employee2 e1 where e1.salary > (select avg(e2.salary) from Employee2 e2) order by e1.age, e1.salary desc")
//    List<Employee2> findEmployee2BySalaryGreaterThanAverageSalary();
//
//    @Query("Select avg(salary) from Employee2")
//    Double getEmployee2AverageSalary();
//
//    @Modifying
//    @Transactional
//    @Query("update Employee2 e1 set e1.salary = :updatedSalary where e1.salary < :averageSalary")
//    void updateEmployee2BySalary(@Param("updatedSalary") Double updatedSalary, @Param("averageSalary") Double averageSalary);
//
//    @Query("Select min(salary) from Employee2")
//    Double getEmployee2MinSalary();
//
//    @Modifying
//    @Transactional
//    @Query("delete from Employee2 e1 where e1.salary = :minSalary")
//    void deleteEmployee2BySalary(@Param("minSalary") Double minSalary);
//
//    @Query(value = "select * from employee_table e1 where e1.emp_last_name = :lastName ", nativeQuery=true)
//    List<Employee2> getEmployee2BylastName(@Param("lastName") String lastName);
//
//    @Modifying
//    @Transactional
//    @Query(value = "delete from employee_table e1 where e1.emp_age > :age ", nativeQuery=true)
//    void deleteEmployee2ByAge(@Param("age") int age);
}
