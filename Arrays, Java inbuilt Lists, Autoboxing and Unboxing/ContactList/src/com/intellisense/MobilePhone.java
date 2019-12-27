package com.intellisense;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<ContactList> contactLists;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contactLists = new ArrayList<>();
    }

    public boolean addNewContact(ContactList contact)
    {
        if(findContact(contact.getName())>=0)
        {
            System.out.println("Already Exists");
            return false;
        }

        this.contactLists.add(contact);
        return true;
    }

    public boolean updateContact(ContactList oldContact, ContactList newContact)
    {
        int foundPosition = findContact(oldContact);

        if(foundPosition<0)
        {
            System.out.println( oldContact.getName() + " does not exists");
            return false;
        }

        this.contactLists.set(foundPosition,newContact);
        System.out.println("Old contact " + oldContact.getName() +
                " was successfully uodated with new contact " + newContact.getName());

        return true;
    }


    public boolean removeContact(ContactList contact)
    {
        int foundPosition = findContact(contact);
        if(foundPosition<0)
        {
            System.out.println( contact.getName() + " does not exists");
            return false;
        }
        this.contactLists.remove(foundPosition);
        System.out.println(contact.getName() + " was successfully removed ");
        return true;
    }

    private int findContact(ContactList contact)
    {
        return this.contactLists.indexOf(contact);
    }

    private int findContact(String name)
    {
        for(int i=0; i<this.contactLists.size(); i++)
        {
            ContactList contact = this.contactLists.get(i);
            if(contact.getName().equals(name))
                return i;
        }
        return -1;
    }

    public String queryContact(ContactList contact)
    {
        if(findContact(contact)>=0)
            return contact.getName();
        return null;
    }

    public ContactList queryContact(String name)
    {
        int position = findContact(name);
        if(position>=0)
            return this.contactLists.get(position);
        return null;
    }

    public void printContacts()
    {
        for(int i=0; i<this.contactLists.size(); i++)
        {
            System.out.println(this.contactLists.get(i).getName() +
                    " -> " + this.contactLists.get(i).getContact());
        }
    }
}