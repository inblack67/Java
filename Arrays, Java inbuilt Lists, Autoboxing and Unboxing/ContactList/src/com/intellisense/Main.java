package com.intellisense;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("123-456-789");

    public static void main(String[] args) {

        System.out.println();

        startPhone();

        System.out.println();

        System.out.println("Choose one Option");
        System.out.println("0 - Quit");
        System.out.println("1 - Print List of Contacts");
        System.out.println("2 - Add a New Contact");
        System.out.println("3 - Update Existing Contact");
        System.out.println("4 - Remove Contact");
        System.out.println("5 - Query Contact");



        while (true)
        {
            System.out.println("Enter Action");
            int choice = scanner.nextInt();

            switch (choice)
            {
                case 0:
                    System.out.println("Shutting the hell down....");
                    return;
                case 1: mobilePhone.printContacts();
                    break;
                case 2: addNewContact();
                    break;
                case 3: updateContact();
                    break;
                case 4: removeContact();
                    break;
                case 5: queryContact();
                    break;
                default:
                    System.out.println("You did'nt do shit");
                    break;
            }
        }
    }

    private static void addNewContact()
    {
        System.out.println("Enter contact name");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.println("Enter phone number");
        String phoneNumber = scanner.nextLine();

        ContactList newContact = ContactList.createContact(name,phoneNumber);

        if(mobilePhone.addNewContact(newContact))
        {
            System.out.println("New contact name: " + name + " phone: " + phoneNumber
             + " added successfully");
        }
        else
            System.out.println("Already exists, adding failed!");
    }

    private static void updateContact()
    {
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        scanner.next();

        ContactList existingContactRecord = mobilePhone.queryContact(name);

        if(existingContactRecord==null)
        {
            System.out.println("Contact not found");
        }

        else
        {
            System.out.println("Enter new contact name");
            String newName = scanner.nextLine();
            System.out.println("Enter new number");
            String newNumber = scanner.nextLine();

            ContactList newContact = ContactList.createContact(newName,newNumber);

            if(mobilePhone.updateContact(existingContactRecord,newContact))
                System.out.println("Successfully updated");
            else
                System.out.println("error while updating");
        }
    }

    private static void removeContact()
    {
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();

        ContactList existingContactRecord = mobilePhone.queryContact(name);

        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        if(mobilePhone.removeContact(existingContactRecord))
            System.out.println("Removed successfully");
        else
            System.out.println("Error while deleting");
    }

    private static void queryContact()
    {
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();

        ContactList existingContactRecord = mobilePhone.queryContact(name);

        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName()
        + " phone: " + existingContactRecord.getContact());
    }

    private static void startPhone()
    {
        System.out.println("Starting phone...");
    }
}
