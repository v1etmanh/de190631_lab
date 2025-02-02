package com.jmc.week3.excercise1.model;

import java.util.ArrayList;

public class Student {
    private int id,semester;
    private String name;
    private ArrayList<TypeOfCourse>ownCourse=new ArrayList<>();

    public Student(int id, String name, int semester,TypeOfCourse[]courseInput) {
        this.id = id;
        this.name = name;
        this.semester = semester;
        for(TypeOfCourse a:courseInput){
            ownCourse.add(a);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public ArrayList<TypeOfCourse> getOwnCourse() {
        return ownCourse;
    }

    public void setOwnCourse(TypeOfCourse[]ownCourse) {
        this.ownCourse.clear();
        for(TypeOfCourse a:ownCourse){this.ownCourse.add(a);}
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", semester='" + semester + '\'' +
                ", ownCourse=" + ownCourse +
                '}';
    }
}
