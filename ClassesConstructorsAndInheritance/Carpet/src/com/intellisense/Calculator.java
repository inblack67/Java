package com.intellisense;

public class Calculator {
    Floor floor;
    Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost()
    {
        return floor.getArea()*carpet.cost;
    }
}
