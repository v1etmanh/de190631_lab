package com.jmc.week5.fruitmanagement.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Utils {
    private static final Scanner scanner = new Scanner(System.in);
    private static final DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      public static String getValue(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }


    public static String getFormattedValue(String prompt, String errMsg, String regex) {
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine().trim();
            if (!input.matches(regex))
                return input;
            else
                System.out.println(errMsg);
        }
    }

    public static int getIntValue(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    public static double getDoubleValue(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid decimal number.");
            }
        }
    }

    public static LocalDate getDateValue(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return LocalDate.parse(scanner.nextLine().trim(),sdf);
            } catch (Exception e) {
                System.out.println("Invalid date format. Please use dd/MM/yyyy.");
            }
        }
    }
    public static LocalDate getDateValue(String prompt,String in) {
        while (true) {
            System.out.print(prompt);
            try {
                return LocalDate.parse(in,sdf);
            } catch (Exception e) {
                System.out.println("Invalid date format. Please use dd/MM/yyyy.");
            }
        }
    }
    public static LocalDateTime getDateTimeValue(String prompt) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        while (true) {
            System.out.print(prompt);
            try {
                return LocalDateTime.parse(scanner.nextLine().trim(), formatter);
            } catch (Exception e) {
                System.out.println("Invalid date-time format. Please use dd/MM/yyyy HH:mm.");
            }
        }
    }
    public static LocalDateTime getDateTimeValue(String prompt,String in) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        while (true) {
            System.out.print(prompt);
            try {
                return LocalDateTime.parse(in.trim(), formatter);
            } catch (Exception e) {
                System.out.println("Invalid date-time format. Please use dd/MM/yyyy HH:mm.");
            }
        }
    }



}