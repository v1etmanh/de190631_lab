package com.jmc.week3.excercise2.model;

import java.time.Year;

public class Teacher extends  Person{
    protected int frofessionYear;
    protected long salary;
    protected TypeContract ownContract;

    public Teacher(String id, String fullName, String phoneNumber, String major, Year yearOfBirth, int frofessionYear, long salary, TypeContract ownContract) {
        super(id, fullName, phoneNumber, major, yearOfBirth);
        this.frofessionYear = frofessionYear;
        this.salary = salary;
        this.ownContract = ownContract;
    }

    public Teacher() {
        this.frofessionYear = 0;
        this.salary = 0;
        this.ownContract =null;
    }

    public Teacher(Person a, int frofessionYear, long salary, TypeContract ownContract) {
        super(a);
        this.frofessionYear = frofessionYear;
        this.salary = salary;
        this.ownContract = ownContract;
    }

    public int getFrofessionYear() {
        return frofessionYear;
    }

    public void setFrofessionYear(int frofessionYear) {
        this.frofessionYear = frofessionYear;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public TypeContract getOwnContract() {
        return ownContract;
    }

    public void setOwnContract(TypeContract ownContract) {
        this.ownContract = ownContract;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "frofessionYear=" + frofessionYear +
                ", salary=" + salary +
                ", ownContract=" + ownContract +
                ", id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", major='" + major + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}