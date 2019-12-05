package com.intellisense;

class Car
{
    private String name;
    private boolean engines;
    private  int wheels;
    private int cylinders;

    public Car(int cylinders, String name)
    {
        this.engines = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }

    public String startEngine()
    {
        return getClass().getSimpleName() + " Engine is starting...";
    }
    public String accelerate()
    {
        return getClass().getSimpleName() +  " Acceleration";
    }
    public String breaks()
    {
        return getClass().getSimpleName() + " Breaking the habit";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

}

class Impala extends Car
{
    public Impala(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " Engine is starting...";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " Acceleration";
    }

    @Override
    public String breaks() {
        return getClass().getSimpleName() + " Breaking the habit";
    }
}

class Ferrari extends Car
{
    public Ferrari()
    {
        super(8,"Ferrari");
    }

}

public class Main {

    public static void main(String[] args) {

        Car car = new Car(8,"Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.breaks());

        System.out.println();

        Impala impala = new Impala(8,"Chevy");
        System.out.println(impala.startEngine());
        System.out.println(impala.accelerate());
        System.out.println(impala.breaks());
    }
}
