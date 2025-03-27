package com.jmc.week5.fruitmanagement.model;

import com.jmc.week5.fruitmanagement.model.database.Fruit_database;

import java.util.ArrayList;
import java.util.List;

public class ShopModel {
    private static final ShopModel instance = new ShopModel();

    private final List<Fruit> fruits = new ArrayList<>();
    private final List<Order> orders = new ArrayList<>();
    private final List<Customer> customers = new ArrayList<>();

    private ShopModel() {
        Fruit_database.loadFruits(fruits);
        Fruit_database.loadCustomers(customers);
        Fruit_database.loadOrders(orders);

    }

    public static ShopModel getInstance() {
        return instance;
    }

    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
        Fruit_database.insertFruit(fruit);
    }

    public void addOrder(Order order) {
        orders.add(order);
        Fruit_database.insertOrder(order);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
        Fruit_database.insertCustomer(customer);
    }

    public boolean removeFruit(int fruitId) {
        return fruits.removeIf(f -> f.getFruitId() == fruitId);

    }

    public boolean removeOrder(int customerId) {
        return orders.removeIf(order -> order.getCusid() == customerId);
    }

    public boolean removeCustomer(int customerId) {
        return customers.removeIf(customer -> customer.getCusId() == customerId);
    }

    public List<Fruit> getFruits() {
        return fruits;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Order> getOrders() {
        return orders;
    }
}
