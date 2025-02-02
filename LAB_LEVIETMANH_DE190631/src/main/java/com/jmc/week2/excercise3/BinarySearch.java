package com.jmc.week2.excercise3;

import com.jmc.week2.excercise2.QuickSort;

import java.util.Queue;

public class BinarySearch {
    public void sort(int []a){
      QuickSort x=new QuickSort();
      x.handle(a,0,a.length);
    }
public  int binarySearch(int []a,int value,int begin, int last) {
    int result = -1;
    if (begin >= last) {

            return -1;

    }

    int select = begin+(last - begin) / 2;
    int s_value = a[select];
    if (s_value == value) return select;
    else {
        if (s_value < value) {
            result = binarySearch(a, value, select + 1, last);


        }
        else{result = binarySearch(a, value, 0, select - 1);}
    }
    return result;
}

}
