package com.intellisense;

public class Main {

    public static void main(String[] args) {

        HamBurger hamBurger = new HamBurger("Basic","Brown","Chicken",327.00);
        double price = hamBurger.itemizedHamburger();
        System.out.println("Basic -> " + price);

        hamBurger.addition1HamBurger("Lettuce",10);
        hamBurger.addition2HamBurger("Cheese",40);
        price = hamBurger.itemizedHamburger();
        System.out.println("New price -> " + price);

        System.out.println();

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 47.00);
        healthyBurger.addHealthAddition1("Tuna", 60);
        healthyBurger.addHealthAddition2("Cheese",45);
        System.out.println("Total HealthyBurgerPrice is " + healthyBurger.itemizedHamburger());

        System.out.println();

        DeluxBurger db = new DeluxBurger();
        db.itemizedHamburger();
        db.addition1HamBurger("crap",0.00);

    }
}
