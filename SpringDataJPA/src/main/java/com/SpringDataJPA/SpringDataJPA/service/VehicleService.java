package com.SpringDataJPA.SpringDataJPA.service;

import com.SpringDataJPA.SpringDataJPA.entity.Bike;
import com.SpringDataJPA.SpringDataJPA.entity.Car;
import com.SpringDataJPA.SpringDataJPA.entity.Employee2;
import com.SpringDataJPA.SpringDataJPA.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public void createVehicle() {
        Car car1 = new Car();
        car1.setVehicleName("HondaCity");
        car1.setSeatBelt(true);

        Bike bike1 = new Bike();
        bike1.setVehicleName("Pulsar");
        bike1.setHelmet(true);

        vehicleRepository.save(car1);
        vehicleRepository.save(bike1);
    }
}
