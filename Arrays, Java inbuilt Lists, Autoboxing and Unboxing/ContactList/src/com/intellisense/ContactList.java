package com.intellisense;

public class ContactList {

    private String name;
    private String phoneNumber;

    public ContactList(String name, String contact) {
        this.name = name;
        this.phoneNumber = contact;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return phoneNumber;
    }

    public static ContactList createContact(String name, String phoneNumber)
    {
        return new ContactList(name,phoneNumber);
    }
}

