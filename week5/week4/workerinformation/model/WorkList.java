package com.jmc.week4.workerinformation.model;

import com.jmc.week3.excercise4.BigNumberOperations;

import java.util.ArrayList;

public class WorkList {
    private ArrayList<Worker> container= new ArrayList<>();
    private ArrayList<Status>listStatus=new ArrayList<>();
    private static int id=0;
    private String makeId(int a){
        return "W"+a;
    }
    public void add(String name, int Age,String salary, String workLocation ){
       String a=makeId(id++);
        this.container.add(new Worker(a,name,Age,salary,workLocation));
        listStatus.add(new Status(a,null));
    }
    public int findID(String id){
        for(int i=0;i<container.size();i++){
            if(container.get(i).getCode().equals(id))return i;
        }
        return -1;
    }
    public int find_status(String id){
        for(int i=0;i<listStatus.size();i++){
            if(listStatus.get(i).getId().equals(id))return i;
        }
        return -1;
    }
    public void upSalary(String id, String amount){
      int index =findID(id);
      if(index==-1)return ;
      int index2=find_status(id);
      Status x0=listStatus.get(index2);
      Worker x=  this.container.get(index);
        BigNumberOperations temp=new BigNumberOperations();
        x.setSalary(temp.add(x.getSalary(),amount));
        x0.setOwn_sta(StatusSalary.UP);
    }
    public void downSalary(String id, String amount){
        int index =findID(id);
        if(index==-1)return ;
        int index2=find_status(id);
        Status x0=listStatus.get(index2);
        Worker x=  this.container.get(index);
        BigNumberOperations temp=new BigNumberOperations();
        x.setSalary(temp.subtract(x.getSalary(),amount));
        x0.setOwn_sta(StatusSalary.DOWN);
    }
    public void display(){
        for(int i=0;i<container.size();i++)
        {
            System.out.println(container.get(i)+" "+listStatus.get(i).getOwn_sta());
        }
    }

}
