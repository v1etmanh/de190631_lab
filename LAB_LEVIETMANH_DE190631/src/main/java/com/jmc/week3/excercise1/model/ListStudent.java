package com.jmc.week3.excercise1.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ListStudent {
    private ArrayList<Student>listStudent= new ArrayList<>();
 public  static   int id=0;
    public void add(Student input){
        input.setId(id++);
        listStudent.add(input);
    }
    public void remove(int id){
        listStudent.remove(id);
    }
    public void update(int index,String name, int sesmeter,TypeOfCourse[]courseInput){
   Student a= listStudent.get(index);
   if(name!=null)
     a.setName(name);
   if(sesmeter!=0)
     a.setSemester(sesmeter);
   if(courseInput!=null)
     a.setOwnCourse(courseInput);
    }
    public void sort(){
        listStudent.sort(Comparator.comparing(Student::getName));

    }
    public void display(){
        for(Student a:listStudent){
            System.out.println(a);
        }
    }
    public int  findById(int ID){
        for(int i =0;i<listStudent.size();i++){
            if(listStudent.get(i).getId()==ID)return i;
        }
        return -1;
    }
    public ArrayList<Integer> findByName(String name){
        ArrayList<Integer>result=new ArrayList<>();
        for(int i =0;i<listStudent.size();i++){
            if(listStudent.get(i).getName().equals(name))result.add(i);
        }
        return result;
    }
    public void getStudentByIndex(int index){
        System.out.println(this.listStudent.get(index));
    }
}
