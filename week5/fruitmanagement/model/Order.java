package com.jmc.week5.fruitmanagement.model;

public class Order {
    private int id_fruit;
    private int   quantity;
    private int customerId;
    private double amount;

    public Order(int id_fruit, int quantity, int cusid) {
        this.id_fruit = id_fruit;
        this.quantity = quantity;
        this.customerId = cusid;
        amount=0;
    }

    public Order() {

    }

    public int getId_fruit() {
        return id_fruit;
    }

    public void setId_fruit(int id_fruit) {
        this.id_fruit = id_fruit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCusid() {
        return this.customerId;
    }

    public void setCusid(int customerName) {
        this.customerId = customerName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id_fruit=" + id_fruit +
                ", quantity=" + quantity +
                ", customerId=" + customerId +
                '}';
    }
}
