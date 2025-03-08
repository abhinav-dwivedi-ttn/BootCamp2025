package com.SpringBoot.SpringBootProject.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "UserVersion2")
public class UserVersion2 {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private String gender;

    public UserVersion2(String name, int age, String gender) {
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

}
