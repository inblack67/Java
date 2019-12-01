package com.intellisense;

public class VipCustomer {
    String name;
    double creditLimit;
    String email;

    public String getName()
    {
        return name;
    }

    public double getCreditLimit()
    {
        return creditLimit;
    }

    public String getEmail()
    {
        return email;
    }

    VipCustomer()
    {
        this("Lawliet",500.00,"l@gmail.com");
        System.out.println("Empty");
    }

    VipCustomer(String name, double creditLimit)
    {
        this("xyz@gmail.com");
        this.name = name;
        this.creditLimit = creditLimit;
    }

    VipCustomer(String email)
    {
        this.email = email;
    }

    VipCustomer(String name, double creditLimit, String email)
    {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
}
