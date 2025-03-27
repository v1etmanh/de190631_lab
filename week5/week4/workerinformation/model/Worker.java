package com.jmc.week4.workerinformation.model;

public class Worker {
    private String code;
    private String name;
    private String salary;
    private String workLocation;
    private int age;

    public Worker(String code, String name, int age, String salary, String workLocation) {
        this.code = code;
        this.name = name;
        this.salary = salary;
        this.workLocation = workLocation;
        this.age = age;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", workLocation='" + workLocation + '\'' +
                ", age=" + age +
                '}';
    }
}
