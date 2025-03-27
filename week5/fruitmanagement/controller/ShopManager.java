package com.jmc.week5.fruitmanagement.controller;

import com.jmc.week5.fruitmanagement.model.*;
import com.jmc.week5.fruitmanagement.menu.*;

public class ShopManager {
    private final Menu menu = new Menu();
    private final ShopModel shopModel = ShopModel.getInstance();

    public void createFruit() {
        String name = menu.getStringInput("Enter fruit name: ");
        double price = menu.getDoubleInput("Enter price: ");
        String origin = menu.getStringInput("Enter origin: ");
        Fruit fruit = new Fruit(name, price, origin);
        shopModel.addFruit(fruit);
        System.out.println("✅ Fruit added successfully!");
    }

    public void viewOrders() {
        menu.displayOrders(shopModel.getOrders(), shopModel.getCustomers(), shopModel.getFruits());
    }

    public void createOrder() {
        int choice = menu.getIntInput("1. Existing Customer | 2. New Customer: ");
        Customer customer;

        if (choice == 1) {
            int id = menu.getIntInput("Enter your customer ID: ");
            customer = shopModel.getCustomers().stream()
                    .filter(c -> c.getCusId() == id)
                    .findFirst()
                    .orElse(null);
            if (customer == null) {
                System.out.println("⚠️ Customer not found!");
                return;
            }
        } else {
            String name = menu.getStringInput("Enter your name: ");
            customer = new Customer(name);
            shopModel.addCustomer(customer);
            System.out.println("✅ Customer registered successfully!");
        }

        System.out.println("Available Fruits:");
        shopModel.getFruits().forEach(System.out::println);

        int fruitId = menu.getIntInput("Enter fruit ID to buy: ");
        int quantity = menu.getIntInput("Enter quantity: ");

        Fruit fruit = shopModel.getFruits().stream()
                .filter(f -> f.getFruitId() == fruitId)
                .findFirst()
                .orElse(null);

        if (fruit == null) {
            System.out.println("⚠️ Invalid fruit ID!");
            return;
        }

        Order order = new Order(fruitId, quantity, customer.getCusId());
        order.setAmount(fruit.getPrice()*quantity);
        shopModel.addOrder(order);

       Customer x= shopModel.getCustomers().stream().filter(e->e.getCusId()==customer.getCusId()).toList().getFirst();
       double li=order.getAmount()+x.getTotal();
       x.setTotal(li);
        System.out.println("✅ Order placed successfully!");
    }

    public void run() {
        while (true) {
            menu.displayMenu();
            int choice = menu.getUserChoice();
            switch (choice) {
                case 1 -> createFruit();
                case 2 -> viewOrders();
                case 3 -> createOrder();
                case 4 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("⚠️ Invalid choice! Try again.");
            }
        }
    }
}
