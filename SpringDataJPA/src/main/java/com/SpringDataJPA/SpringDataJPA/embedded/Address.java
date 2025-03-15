package com.SpringDataJPA.SpringDataJPA.embedded;

import jakarta.persistence.*;

@Embeddable
public class Address {

    private int streetNumber;
    private String location;
    private String state;

    public Address() {}

    public Address(int streetNumber, String state, String location) {
        this.streetNumber = streetNumber;
        this.state = state;
        this.location = location;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
