package com.jmc.week1.excercise2;

import java.util.ArrayList;
import java.util.Random;

public class LinearHandle {

 private  ArrayList<Integer>data;

   private ArrayList<Integer> initialize(int limit) {
       data= new ArrayList<>();
        Random ran = new Random();

        for (int i = 0; i < limit; i++) {
            data.add(ran.nextInt(limit));
        }
        return data;
    }

    public ArrayList<Integer> searching( int limit,int value) {
        initialize(limit);
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) == value) { result.add(i);
            }
        }
        return result.isEmpty() ? null : result;
    }


    public void display() {
        if (data == null || data.isEmpty()) {
            System.out.println("Danh sách trống.");
        } else {
            for (int a : data) {
                System.out.print(a + "  ");
            }
            System.out.println();
        }
    }
}
