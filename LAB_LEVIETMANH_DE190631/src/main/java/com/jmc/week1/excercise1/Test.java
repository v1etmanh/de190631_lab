package com.jmc.week1.excercise1;

import com.jmc.week1.excercise2.LinearHandle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String limit;
        limit=scanner.nextLine();
       StringHandle a= new StringHandle(limit);

        HashMap<String,Integer> x= a.HandleWord();
        HashMap<Character,Integer> x1= a.HandleChar();
            System.out.println(x.toString());
        System.out.println(x1.toString());




    }
}
