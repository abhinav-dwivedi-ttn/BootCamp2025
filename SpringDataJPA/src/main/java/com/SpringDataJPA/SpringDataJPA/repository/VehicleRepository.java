package com.SpringDataJPA.SpringDataJPA.repository;

import com.SpringDataJPA.SpringDataJPA.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
