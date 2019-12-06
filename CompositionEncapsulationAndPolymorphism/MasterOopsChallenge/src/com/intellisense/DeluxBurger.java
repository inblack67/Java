package com.intellisense;

public class DeluxBurger extends HamBurger
{
    public DeluxBurger()
    {
        super("Deluxe","White","Chicken and Bacon",250);
        super.addition1HamBurger("Chips",50);
        super.addition2HamBurger("Drinks",87);
    }

    @Override
    public void addition1HamBurger(String name, double price) {
        System.out.println("Perfection can not be improved");
    }

    @Override
    public void addition2HamBurger(String name, double price) {
        System.out.println("Perfection can not be improved");
    }

    @Override
    public void addition3HamBurger(String name, double price) {
        System.out.println("Perfection can not be improved");
    }

    @Override
    public void addition4HamBurger(String name, double price) {
        System.out.println("Perfection can not be improved");
    }
}
