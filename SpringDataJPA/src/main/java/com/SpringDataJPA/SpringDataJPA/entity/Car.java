package com.SpringDataJPA.SpringDataJPA.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
//@DiscriminatorValue("Car")
public class Car extends Vehicle {

    private boolean seatBelt;

    public boolean isSeatBelt() {
        return seatBelt;
    }

    public void setSeatBelt(boolean seatBelt) {
        this.seatBelt = seatBelt;
    }
}
