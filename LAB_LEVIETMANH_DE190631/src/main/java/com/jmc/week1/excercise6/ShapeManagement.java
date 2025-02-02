package com.jmc.week1.excercise6;

import java.util.ArrayList;

public class ShapeManagement {
    private ArrayList<Shape>container=new ArrayList<>();
    public void display(){
        for(var x:container){System.out.println(x.toString());}
    }
    public  void add(Shape...in){
       for(var x: in)
        container.add(x);
    }
}
