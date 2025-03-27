package com.jmc.week4.workerinformation.controller;

import com.jmc.week4.workerinformation.model.Utils;
import com.jmc.week4.workerinformation.model.WorkList;

public class WorkerController {
    private WorkList container =new WorkList();
    public void add(){
        String name = Utils.getValue("enter name");
        while(!name.matches("^[A-Za-z\\s]+$")){
             name = Utils.getValue("enter name");
        }
        int age=Utils.getIntValue("enter age");
        String salary=Utils.getValue("enter salary");
        while(!salary.matches("^[0-9]+$")){
            salary=Utils.getValue("enter salary");
        }
        String Location=Utils.getValue("enter location");
        container.add(name,age,salary,Location);
    }
    public void upsa(){
        String id=Utils.getValue("enter id");
        if(this.container.findID(id)!=-1){
            String salary=Utils.getValue("enter amount salary");
            while(!salary.matches("^[0-9]+$")){
                salary=Utils.getValue("enter again");
            }
            container.upSalary(id,salary);
        }
    }
    public void downsa(){
        String id=Utils.getValue("enter id");
        if(this.container.findID(id)!=-1){
            String salary=Utils.getValue("enter amount down salary");
            while(!salary.matches("^[0-9]+$")){
                salary=Utils.getValue("enter again");
            }
            container.downSalary(id,salary);
        }
    }
    public void display_all(){container.display();}
}
