package com.intellisense;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("National Bank");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide","Tim",100.67);
        bank.addCustomer("Adelaide","Mike",100.67);
        bank.addCustomer("Adelaide","Percy",100.67);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney","Bucky",56.78);

        bank.addCustomerTransaction("Adelaide","Tim",6.78);
        bank.addCustomerTransaction("Adelaide","Tim",6.78);
        bank.addCustomerTransaction("Adelaide","Mike",6.78);


        bank.listCustomers("Adelaide",true);
        bank.listCustomers("Sydney",true);
        // Show or don't show transactions.

        System.out.println();

        bank.addBranch("Mel"); // Branch exists now
        if(!bank.addCustomer("Mel","Brain",5.56))
            System.out.println("Branch Melbourne does not exists");

        if(!bank.addCustomer("Adelaide","Tim",393))
            System.out.println("Customer Tim already exists");

        if(!bank.addBranch("Sydney"))
            System.out.println("Branch already exists");


    }
}
