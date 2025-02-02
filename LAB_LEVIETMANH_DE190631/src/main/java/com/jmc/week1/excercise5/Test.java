package com.jmc.week1.excercise5;


import java.rmi.server.UID;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        Calculater calculator = new Calculater();
Scanner scanner=new Scanner(System.in);

        while (true) {
            calculator.setNumber_a(0);
            // Hiển thị menu
            System.out.println("\n=== MENU ===");
            System.out.println("1. Normal Calculator");
            System.out.println("2. BMI Calculator");
            System.out.println("3. Exit");

            int option = Utils.getIntValue("Select option");

            switch (option) {
                case 1 -> {
                    // Normal Calculator
                  char operator='+';
                  char operator2;
                  double number=0;
                  while(operator!='='){
                      number=Utils.getDoubleValue("");

                      operator2=scanner.nextLine().charAt(0);
                      while(!"+-*/^=".contains(String.valueOf(operator2))){
                          System.out.println("please enter true input");
                          operator2=scanner.nextLine().charAt(0);
                      }

                                calculator.Operation(operator, number);

                                operator = operator2;

                  }
                  System.out.println(calculator.getNumber_a());

                }
                case 2 -> {
                    // BMI Calculator

                    double weight = Utils.getDoubleValue("Enter your weight (kg)");
                    while (weight<=0){
                        System.out.println("please enter positive  number");
                        weight = Utils.getDoubleValue("Enter your weight (kg)");
                    }

                    double height = Utils.getDoubleValue("Enter your height (m): ");
                    while (height<=0){
                        System.out.println("please enter positive  number");
                       height = Utils.getDoubleValue("Enter your weight (kg)");
                    }
                    String bmiStatus = calculator.IdentityStandard(weight, height);
                    System.out.println("Your BMI Status: " + bmiStatus);
                }
                case 3 -> {
                    System.out.println("Exiting the program...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }


}
