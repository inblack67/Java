package com.intellisense;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount()
    {
        this(12334, 0.00, "Bob","email", 3829);
        System.out.println("Empty");
    }

    public BankAccount(int accountNumber, double balance, String name, String email, int phone)
    {
        System.out.println("Parametrized");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = name;
        this.email = email;
        this.phoneNumber = phone;
    }

    public BankAccount(String customerName, String email, int phoneNumber)
    {
        this(12345,99.00,customerName,email,phoneNumber);
        // calling the one which actually updates the fields
    }

    public void deposit(double depositAmount)
    {
        this.balance+=depositAmount;
    }

    public void withdrawal(double withdrawalAmount)
    {
        if(balance-withdrawalAmount<0)
            System.out.println("Insufficient Funds");
        else
            System.out.println("Withdrawal Processed Remaining Balance " + (balance-withdrawalAmount));

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

}