package com.jmc.week5.fruitmanagement.menu;

import com.jmc.week5.fruitmanagement.model.*;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("=== Fruit Shop System ===");
        System.out.println("1. Create Fruit");
        System.out.println("2. View Orders");
        System.out.println("3. Shopping");
        System.out.println("4. Exit");
    }

    public int getUserChoice() {
        System.out.print("Enter your choice: ");
        int result=Utils.getIntValue("enter your choice");
        return  result;
    }

    public String getStringInput(String message) {
        System.out.print(message);
        return Utils.getValue("");
    }

    public int getIntInput(String message) {
        System.out.print(message);
        return Utils.getIntValue("");
    }

    public double getDoubleInput(String message) {
        System.out.print(message);
        return Utils.getDoubleValue("");
    }

    public void displayOrders(List<Order> orders, List<Customer> customers, List<Fruit> fruits) {
        System.out.println("=== Order List ===");
        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.getName());
            for (Order order : orders) {
                if (order.getCusid() == customer.getCusId()) {
                    Fruit fruit = fruits.stream()
                            .filter(f -> f.getFruitId() == order.getId_fruit())
                            .findFirst()
                            .orElse(null);
                    if (fruit != null) {
                        System.out.println("- " + fruit.getName() + " | Qty: " + order.getQuantity() + " | Total: " + order.getAmount());
                    }
                }

            }
            System.out.println("all of total="+customer.getTotal());
            System.out.println("-------------------");
        }
    }
}
