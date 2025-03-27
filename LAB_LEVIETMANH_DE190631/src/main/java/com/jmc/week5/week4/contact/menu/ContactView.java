package com.jmc.week4.contact.menu;

// ContactView.java
import com.jmc.week4.contact.model.Contact;

import java.util.List;
import java.util.Scanner;

public class ContactView {
    private Scanner scanner;

    public ContactView() {
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("\n===== Contact Management =====");
        System.out.println("1. Add contact");
        System.out.println("2. Display contacts");
        System.out.println("3. Delete contact");
        System.out.println("4. Exit");
        System.out.print("Please select an option: ");
    }

    public int getMenuChoice() {
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public Contact getContactDetails() {
        System.out.println("\n----- Add Contact -----");

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Group: ");
        String group = scanner.nextLine();

        System.out.print("Address: ");
        String address = scanner.nextLine();

        String phone;
        do {
            System.out.print("Phone (format XXX XXX XXXX): ");
            phone = scanner.nextLine();
        } while (!validatePhoneNumber(phone));

        return new Contact(name, group, address, phone);
    }

    private boolean validatePhoneNumber(String phone) {
        if (phone.matches("\\d{3} \\d{3} \\d{4}")) {
            return true;
        } else {
            System.out.println("Invalid phone format. Please use XXX XXX XXXX format.");
            return false;
        }
    }

    public void displayContacts(List<Contact> contacts) {
        System.out.println("\n----- Contact List -----");
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    public int getContactIdToDelete() {
        System.out.println("\n----- Delete Contact -----");
        System.out.print("Enter contact ID to delete: ");
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID format. Please enter a number.");
            return -1;
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void close() {
        scanner.close();
    }
}