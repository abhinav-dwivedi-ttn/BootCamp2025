package com.SpringDataJPA.SpringDataJPA.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
//@DiscriminatorValue("Bike")
public class Bike extends Vehicle {

    private boolean helmet;

    public boolean isHelmet() {
        return helmet;
    }

    public void setHelmet(boolean helmet) {
        this.helmet = helmet;
    }
}
