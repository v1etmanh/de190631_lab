package com.jmc.week3.excercise2.model;

import java.time.LocalDateTime;
import java.time.Year;

public class Person {
    protected String id,fullName,phoneNumber,major;
    protected Year yearOfBirth;

    public Person(String id, String fullName, String phoneNumber, String major, Year yearOfBirth) {
        this.id = id;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.major = major;
        this.yearOfBirth = yearOfBirth;
    }
    public Person(Person a){
        this.id=a.id;
        this.fullName=a.fullName;
        this.major=a.major;
        this.yearOfBirth=a.yearOfBirth;
        this.phoneNumber=a.phoneNumber;
    }
    public Person(){
        id=fullName=phoneNumber=major="";
        yearOfBirth=null;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Year getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Year yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", major='" + major + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
