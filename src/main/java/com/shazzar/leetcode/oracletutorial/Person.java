package com.shazzar.leetcode.oracletutorial;

import java.time.LocalDate;

public class Person {
    public enum Sex {
        MALE, FEMALE
    }

    private String name;
    private int age;
    private Sex gender;
    private String email;

    public Person(String name, int age, Sex gender, String email) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setDob(int age) {
        this.age = age;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dob=" + age +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                '}';
    }
}
