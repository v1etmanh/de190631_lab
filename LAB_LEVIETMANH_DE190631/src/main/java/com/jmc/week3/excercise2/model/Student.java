package com.jmc.week3.excercise2.model;

import java.time.Year;

/*
* Year of admission, entrance English score*/
public class Student extends Person {
    protected Year yearAdmission;
    protected int englishScore;

    public Student() {
        this.yearAdmission =null;
        this.englishScore = 0;
    }

    public Student(String id, String fullName, String phoneNumber, String major, Year yearOfBirth, Year yearAdmission, int englishScore) {
        super(id, fullName, phoneNumber, major, yearOfBirth);
        this.yearAdmission = yearAdmission;
        this.englishScore = englishScore;
    }

    public Student(Person a, int englishScore, Year yearAdmission) {
        super(a);
        this.englishScore = englishScore;
        this.yearAdmission = yearAdmission;
    }

    public Year getYearAdmission() {
        return yearAdmission;
    }

    public void setYearAdmission(Year yearAdmission) {
        this.yearAdmission = yearAdmission;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "yearOfBirth=" + yearOfBirth +
                ", major='" + major + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", fullName='" + fullName + '\'' +
                ", id='" + id + '\'' +
                ", englishScore=" + englishScore +
                ", yearAdmission=" + yearAdmission +
                '}';
    }
}
