package com.intellisense;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("East");
        Wall wall2 = new Wall("North");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(47,"Black");
        Bed bed = new Bed("Classic", 4,67,2,2);
        Lamp lamp = new Lamp("Classic",false,4);

        Bedroom bedroom = new Bedroom("Ryuk",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();





    }
}
