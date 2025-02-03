package com.jmc.week3.excercise2.view;

import com.jmc.week3.excercise2.controller.InformationManagement;
import com.jmc.week3.excercise2.model.Utils;

public class Test {
    public void run(InformationManagement in) {
        while (true) {
            System.out.println("\n*** Information Management ***");
            System.out.println("1. Teacher");
            System.out.println("2. Student");
            System.out.println("3. Person");
            System.out.println("4. Exit");
            int choice = Utils.getIntValue("You choose: ");

            switch (choice) {
                case 1 -> teacherMenu(in);
                case 2 -> studentMenu(in);
                case 3 -> personMenu(in
                );
                case 4 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice, try again.");
            }
        }
    }

    private void teacherMenu(InformationManagement in) {
        while (true) {
            System.out.println("\n*** Teacher Management ***");
            System.out.println("1. Input");
            System.out.println("2. Print");
            System.out.println("3. Exit");
            int choice = Utils.getIntValue("You choose: ");

            switch (choice) {
                case 1 -> in.addTeacher();
                case 2 -> in.display(3);
                case 3 -> {
                    return;
                }
                default -> System.out.println("Invalid choice, try again.");
            }
        }
    }

    private void studentMenu(InformationManagement in) {
        while (true) {
            System.out.println("\n*** Student Management ***");
            System.out.println("1. Input");
            System.out.println("2. Print");
            System.out.println("3. Exit");
            int choice = Utils.getIntValue("You choose: ");

            switch (choice) {
                case 1 -> in.addStudent();
                case 2 -> in.display(2);
                case 3 -> {
                    return;
                }
                default -> System.out.println("Invalid choice, try again.");
            }
        }

    }
    private void personMenu(InformationManagement in) {
        while (true) {
            System.out.println("\n*** Person Management ***");
            System.out.println("1. Input");
            System.out.println("2. Print");
            System.out.println("3. Exit");
            int choice = Utils.getIntValue("You choose: ");

            switch (choice) {
                case 1 -> in.addPerson();
                case 2 -> in.display(1);
                case 3 -> {
                    return;
                }
                default -> System.out.println("Invalid choice, try again.");
            }
        }
    }
    public static void main(String[] args) {
        InformationManagement management = new InformationManagement();
    Test a=new Test();
    a.run(management);
    }



}
