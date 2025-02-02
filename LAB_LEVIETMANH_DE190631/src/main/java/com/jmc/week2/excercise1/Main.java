package com.jmc.week2.excercise1;

import java.util.Random;

public class Main { public static void main(String[]args){
    int a[]=new int[10];
    Random x=new Random();
    for(int i=0;i<a.length ;i++){
        a[i]=x.nextInt(100);

    }
    BubbleSort q=new BubbleSort();
    q.handle(a);
    for(int y: a)
        System.out.println(y);
}
}
