package com.jmc.week1.excercise4;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Handle handle = new Handle(); // Khởi tạo đối tượng Handle

            while (true) {
                // Hiển thị menu cho người dùng
                System.out.println("Select an option:");
                System.out.println("1. Calculate Superlative Equation");
                System.out.println("2. Calculate Quadratic Equation");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1: // Option 1: Calculate Superlative Equation
                        System.out.print("Enter coefficient A: ");
                        double a = scanner.nextDouble();
                        System.out.print("Enter coefficient B: ");
                        double b = scanner.nextDouble();

                        try {
                            double result = handle.SolveSuperlativeEquation(a, b);
                            System.out.println("Solution: " + result);

                            ArrayList<Integer> oddNumbers = handle.CheckOdd(a, b);
                            ArrayList<Integer> evenNumbers = handle.CheckEven(a, b);
                            ArrayList<Integer> squareNumbers = handle.CheckSquare(a, b);

                            System.out.println("Odd numbers: " + oddNumbers);
                            System.out.println("Even numbers: " + evenNumbers);
                            System.out.println("Square numbers: " + squareNumbers);
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case 2: // Option 2: Calculate Quadratic Equation
                        System.out.print("Enter coefficient A: ");
                        a = scanner.nextDouble();
                        System.out.print("Enter coefficient B: ");
                        b = scanner.nextDouble();
                        System.out.print("Enter coefficient C: ");
                        double c = scanner.nextDouble();

                        ArrayList<Double> result = handle.SolveQuadraticEquation(a, b, c);
                        if (result == null) {
                            System.out.println("No real solution.");
                        } else {
                            System.out.println("Solutions: " + result);
                        }

                       var oddNumbers = handle.CheckOdd(a, b, c);
                       var evenNumbers = handle.CheckEven(a, b, c);
                       var squareNumbers = handle.CheckSquare(a, b, c);

                        System.out.println("Odd numbers: " + oddNumbers);
                        System.out.println("Even numbers: " + evenNumbers);
                        System.out.println("Square numbers: " + squareNumbers);
                        break;

                    case 3: // Option 3: Exit
                        System.out.println("Exiting program...");
                        scanner.close();
                        return; // Thoát chương trình

                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        }


}
