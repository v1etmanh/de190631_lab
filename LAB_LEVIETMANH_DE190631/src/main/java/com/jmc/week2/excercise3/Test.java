package com.jmc.week2.excercise3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearch bs = new BinarySearch();

        // Nhập khoảng giá trị và kích thước mảng
        System.out.print("Nhập kích thước mảng: ");
        int n = scanner.nextInt();




        // Tạo mảng ngẫu nhiên
        Random random = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(n) ;
        }

        System.out.println("Mảng ban đầu: " + Arrays.toString(array));

        // Sắp xếp mảng
        bs.sort(array);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));

        // Nhập giá trị cần tìm
        System.out.print("Nhập giá trị cần tìm: ");
        int value = scanner.nextInt();

        // Tìm kiếm nhị phân
        int index = bs.binarySearch(array, value, 0, array.length - 1);

        // Kết quả
        if (index != -1) {
            System.out.println("Giá trị " + value + " nằm ở vị trí: " + index);
        } else {
            System.out.println("Không tìm thấy giá trị " + value + " trong mảng.");
        }

        scanner.close();
    }
}
