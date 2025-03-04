package com.SpringBoot.SpringBootProject.repository;

import com.SpringBoot.SpringBootProject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//  Question - 1
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
