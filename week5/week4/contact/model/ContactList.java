package com.jmc.week4.contact.model;

import java.util.ArrayList;
import java.util.List;

public class ContactList {
    private List<Contact> contacts;

    public ContactList() {
        contacts = new ArrayList<>();
    }

    public boolean addContact(Contact contact) {
        return contacts.add(contact);
    }

    public List<Contact> getAllContacts() {
        return contacts;
    }

    public boolean deleteContact(int id) {
        return contacts.removeIf(contact -> contact.getId() == id);
    }

    public boolean contactExists(int id) {
        return contacts.stream().anyMatch(contact -> contact.getId() == id);
    }
}