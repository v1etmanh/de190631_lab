package com.jmc.week2.excercise1;

import com.jmc.week2.excercise2.QuickSort;

import java.util.Random;

public class BubbleSort {
    public void handle(int[]a)
    { int t= a.length;int temp=0;
        boolean stop=false;
        for(int j=0;j<a.length-1&&!stop;j++)
        { stop=true;
            int i=0;
           while(i<t-1)
        {
            if(a[i+1]<a[i]){
                temp=a[i+1];
                a[i+1]=a[i];
                a[i]=temp;
                stop=false;
            }
            i++;

        }
     t--;
        }

    }

}
