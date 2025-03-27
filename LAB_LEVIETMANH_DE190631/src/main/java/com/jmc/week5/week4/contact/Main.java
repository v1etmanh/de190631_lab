package com.jmc.week4.contact;


import com.jmc.week4.contact.controller.ContactController;
import com.jmc.week4.contact.menu.ContactView;
import com.jmc.week4.contact.model.ContactList;

// Main.java
public class Main {
    public static void main(String[] args) {
        ContactList model = new ContactList();
        ContactView view = new ContactView();
        ContactController controller = new ContactController(model, view);

        controller.run();
    }
}