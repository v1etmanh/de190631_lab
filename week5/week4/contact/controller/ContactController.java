package com.jmc.week4.contact.controller;

import com.jmc.week4.contact.menu.ContactView;
import com.jmc.week4.contact.model.Contact;
import com.jmc.week4.contact.model.ContactList;

// ContactController.java
public class ContactController {
    private ContactList model;
    private ContactView view;

    public ContactController(ContactList model, ContactView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        boolean running = true;

        while (running) {
            view.displayMenu();
            int choice = view.getMenuChoice();

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    displayContacts();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    running = false;
                    view.displayMessage("Exiting program. Goodbye!");
                    view.close();
                    break;
                default:
                    view.displayMessage("Invalid option. Please try again.");
            }
        }
    }

    private void addContact() {
        Contact contact = view.getContactDetails();
        if (model.addContact(contact)) {
            view.displayMessage("Contact added successfully!");
        } else {
            view.displayMessage("Failed to add contact.");
        }
    }

    private void displayContacts() {
        view.displayContacts(model.getAllContacts());
    }

    private void deleteContact() {
        int id = view.getContactIdToDelete();
        if (id == -1) {
            return;
        }

        if (!model.contactExists(id)) {
            view.displayMessage("Contact with ID " + id + " does not exist.");
            return;
        }

        if (model.deleteContact(id)) {
            view.displayMessage("Contact deleted successfully!");
        } else {
            view.displayMessage("Failed to delete contact.");
        }
    }
}