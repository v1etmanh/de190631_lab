package com.jmc.week3.excercise1.view;

import com.jmc.week3.excercise1.model.Utils;
import com.jmc.week3.excercise1.controller.StudentManager;

import java.util.Scanner;

/*1Create
2. Find and Sort
3. Update/Delete
4. Report
5. Exit*/
public class Menu {

        public static void main(String[] args) {
            StudentManager manager = new StudentManager();

            while (true) {
                System.out.println("==== Student Manager ====");
                System.out.println("1. Create");
                System.out.println("2. Find and Sort");
                System.out.println("3. Update  or Delete");
                System.out.println("4. Report");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int choice = Utils.getIntValue("enter operator");


                switch (choice) {
                    case 1:
                     manager.add();
                        break;
                    case 2:
                        System.out.println("enter 1 to find and 2 to sort list");
                       int choice1 = Utils.getIntValue("your choice");
                       switch (choice1){
                           case 1 :{
                               manager.find();break;
                           }
                           case 2: manager.sort();
                           break;
                           default: break;
                       }
                        break;
                    case 3:

                        System.out.println("enter 1 to update and 2 to remove");
                        int choice2 = Utils.getIntValue("your choice");
                        switch (choice2){
                            case 1 :{
                                manager.update();break;
                            }
                            case 2: manager.remove();
                                break;
                            default: break;
                        }
                        break;
                    case 4:manager.report();

                        break;
                    case 5:
                        System.out.println("Exiting program...");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }

        }
    }
