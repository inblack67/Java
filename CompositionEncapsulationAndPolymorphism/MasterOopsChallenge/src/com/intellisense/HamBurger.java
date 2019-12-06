package com.intellisense;

public class HamBurger
{
    private String name;
    private String breadRollType;
    private String meat;
    private double price;

    private String addition1;
    private double addition1Price;

    private String addition2;
    private double addition2Price;

    private String addition3;
    private double addition3Price;

    private String addition4;
    private double addition4Price;

    public HamBurger(String name, String breadRollType, String meat, double price)
    {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public void addition1HamBurger(String name, double price)
    {
        this.addition1 = name;
        this.addition1Price = price;

    }

    public void addition2HamBurger(String name, double price)
    {
        this.addition2 = name;
        this.addition2Price = price;
    }

    public void addition3HamBurger(String name, double price)
    {
        this.addition3 = name;
        this.addition3Price = price;
    }

    public void addition4HamBurger(String name, double price)
    {
        this.addition4 = name;
        this.addition4Price = price;
    }

    public double itemizedHamburger()
    {
        double hamburgerPrice = this.price;
        System.out.println("Basic " + this.name + " hamburger on a " + this.breadRollType +
        " roll " + " has a price of " + this.price);

        if(this.addition1 != null)
        {
            hamburgerPrice += this.addition1Price;
            System.out.println("Itemized " + this.name + " hamburger on a " + this.breadRollType + " roll and " + addition1  + " toppings " + " has a price of " + this.addition1Price);
        }

        if(this.addition2 != null)
        {
            hamburgerPrice += this.addition2Price;
            System.out.println("Itemized " + this.name + " hamburger on a " + this.breadRollType + " roll and " + addition2  + " toppings " + " has a price of " + this.addition2Price);
        }

        if(this.addition3 != null)
        {
            hamburgerPrice += this.addition3Price;
            System.out.println("Itemized " + this.name + " hamburger on a " + this.breadRollType + " roll and " + addition3  + " toppings " + " has a price of " + this.addition3Price);
        }

        if(this.addition4 != null)
        {
            hamburgerPrice += this.addition4Price;
            System.out.println("Itemized " + this.name + " hamburger on a " + this.breadRollType + " roll and " + addition4  + " toppings " + " has a price of " + this.addition4Price);
        }

        return hamburgerPrice;
    }

}
