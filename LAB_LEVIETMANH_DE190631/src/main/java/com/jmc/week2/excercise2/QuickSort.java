package com.jmc.week2.excercise2;

import java.util.Random;

public class QuickSort {
   public  void handle(int[]contain, int begin, int end){
        if(begin==end)return;
        int j=begin-1;
        int i=begin;
        int pilot=contain[end-1];
        int temp=0;
        for(;i<end;i++)
        {
            if(contain[i]<pilot)
            {j++;
                temp=contain[i];
                contain[i]=contain[j];
                contain[j]=temp;
            }
        }
        j++;
        temp=contain[end-1];
        contain[end-1]=contain[j];
        contain[j]=temp;
        handle(contain,begin,j);
        handle(contain,j+1,end);

    }

}
