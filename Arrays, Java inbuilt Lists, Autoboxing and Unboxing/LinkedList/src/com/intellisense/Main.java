package com.intellisense;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Tim",78.9);
        Customer anotherCustomer = customer;
        anotherCustomer.setBalance(12.10);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        for(int i=0; i<integers.size(); i++)
        {
            System.out.println(i + ": " + integers.get(i));
        }

        integers.add(1,23); // entries moved down accordingly
        // slower to process move up/down in enterprise applications

        System.out.println();

        for(int i=0; i<integers.size(); i++)
        {
            System.out.println(i + ": " + integers.get(i));
        }

        // =========================================================

        // LINKED LISTS
        

    }
}
