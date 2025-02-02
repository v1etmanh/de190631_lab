package com.jmc.week2.excercise2;

import java.util.Random;

public class Main {
    public static void main(String[]args){
        int a[]=new int[10];
        Random x=new Random();
        for(int i=0;i<a.length ;i++){
            a[i]=x.nextInt(100);

        }
        QuickSort q=new QuickSort();
        q.handle(a,0,a.length);
        for(int y: a)
            System.out.println(y);
    }
}
