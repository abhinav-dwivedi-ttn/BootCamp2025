package com.SpringDataJPA.SpringDataJPA.repository;

import com.SpringDataJPA.SpringDataJPA.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
