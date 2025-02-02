package com.jmc.week3.excercise1.controller;

import com.jmc.week3.excercise1.model.ListStudent;
import com.jmc.week3.excercise1.model.Student;
import com.jmc.week3.excercise1.model.TypeOfCourse;
import com.jmc.week3.excercise1.model.Utils;

import java.util.ArrayList;
import java.util.List;

/*
1Create
2. Find and Sort
3. Update/Delete
4. Report
5. Exit*/
public class StudentManager {
    private ListStudent manager
            =new ListStudent();
    public Student createStudent(){
        String name= Utils.getValue("enter name");

        int semeter=Utils.getIntValue("enter semester");
        while(semeter<0){
            System.out.println("invalid ,semester>=0");
            semeter=Utils.getIntValue("");
        }
        System.out.println("choice subjects ");
        int curr=0;
       TypeOfCourse[]contain=new TypeOfCourse[3];
      TypeOfCourse[]model=TypeOfCourse.values();
        System.out.println("enter 0 to choice java \n1 to choice .net\n2  to choice c++/c# \n3 to exit");
    boolean run=true;
        while (curr < 3 && run) {
            int choice = Utils.getIntValue("");
            while (choice < 0 || choice > 3) {
                System.out.println("Invalid input, try again.");
                choice = Utils.getIntValue("");
            }
            if (choice == 3) {
                run = false;
                break;
            }

            // Kiểm tra trùng lặp môn học
            boolean alreadyChosen = false;
            for (int i = 0; i < curr; i++) {
                if (contain[i] == model[choice]) {
                    alreadyChosen = true;
                    break;
                }
            }

            if (alreadyChosen) {
                System.out.println("This subject has already been chosen. Please choose another.");
            } else {
                contain[curr++] = model[choice];
            }
        }
      return new Student(0,name,semeter,contain);

    }
    public void add(){
        Student a=createStudent();
        manager.add(a);
    }
    public void find(){
        String name= Utils.getValue("enter name to searching");
        ArrayList<Integer> temp= manager.findByName(name);
       if( temp.size()==0){
           System.out.println("this name is not exist");
           return;
       }
     for(int i: temp){
      manager.getStudentByIndex(i);
     }
    }
    public void sort(){
        try{manager.sort();
        System.out.println("sort success");
        manager.display();
        }catch (Exception e ){
            System.out.println("sort not successfull");
        }

    }
    public void report(){
        manager.display();
    }
    public void update(){
        int id = Utils.getIntValue("enter id of student");
        int  student_index= manager.findById(id);
        if(student_index==-1){System.out.println("student's id  is not exist");return;}
       Student temp= createStudent();
        manager.update(student_index,temp.getName(),temp.getSemester(),temp.getOwnCourse().toArray(new TypeOfCourse[0]));
        manager.display();
    }
    public void remove(){
        int id=Utils.getIntValue("enter id");
        int  student_index= manager.findById(id);
        if(student_index==-1){System.out.println("student's id  is not exist");return;}
        manager.remove(student_index);
    }

}
