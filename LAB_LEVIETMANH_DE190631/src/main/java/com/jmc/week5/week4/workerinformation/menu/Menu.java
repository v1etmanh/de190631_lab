package com.jmc.week4.workerinformation.menu;

import com.jmc.week3.excercise3.controller.ReservationController;
import com.jmc.week4.workerinformation.controller.WorkerController;
import com.jmc.week4.workerinformation.model.Worker;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        WorkerController controller = new WorkerController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("======== Worker Management =========");
            System.out.println("1. Add Worker");
            System.out.println("2. Up salary");
            System.out.println("3. Down salary");
            System.out.println("4. Display Information salary");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number between 1 and 6.");
                continue;
            }

            switch (choice) {
                case 1:
                   controller.add();
                    break;
                case 2:
                controller.upsa();
                    break;
                case 3:

                controller.downsa();
                    break;
                case 4:

                  controller.display_all();
                    break;
                case 5:

                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option! Please choose a number between 1 and 6.");
            }
        }
    }
}
