package com.jmc.week4.contact.model;

public class Contact {
    private static int counter = 0;
    private int id;
    private String name;
    private String group;
    private String address;
    private String phone;

    public Contact(String name, String group, String address, String phone) {
        this.id = ++counter;
        this.name = name;
        this.group = group;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Group: %s, Address: %s, Phone: %s",
                id, name, group, address, phone);
    }
}