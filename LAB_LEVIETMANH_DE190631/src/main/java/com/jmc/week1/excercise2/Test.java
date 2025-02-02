package com.jmc.week1.excercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập giới hạn danh sách (limit): ");
        int limit = scanner.nextInt();


        LinearHandle linearHandle = new LinearHandle();


        System.out.print("Nhập giá trị cần tìm (value): ");
        int value = scanner.nextInt();

        //
        ArrayList<Integer> result = linearHandle.searching(limit, value);

        System.out.println("Danh sách ngẫu nhiên: ");
        linearHandle.display();

        System.out.println("================");
        if (result != null) {
            System.out.println("Các giá trị tìm thấy:");
            for (int x : result) {
                System.out.println(x);
            }
        } else {
            System.out.println("Không tìm thấy giá trị.");
        }
    }
}
