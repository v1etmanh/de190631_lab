package com.jmc.week2.excercise1;

import com.jmc.week2.excercise2.QuickSort;

import java.util.Random;

public class BubbleSort {
    public void handle(int[]a)
    { int t=0;int temp=0;
        for(int i=0;i<a.length-1;i++)
        { t=i;
           while(t<a.length-1)
        {
            if(a[t+1]<a[t]){
                temp=a[t+1];
                a[t+1]=a[t];
                a[t]=temp;
                t++;
            }
           else t++;
        }

        }

    }

}
