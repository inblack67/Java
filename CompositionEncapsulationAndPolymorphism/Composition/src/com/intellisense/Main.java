package com.intellisense;

public class Main {

    public static void main(String[] args)
    {
        Dimensions dimensions = new Dimensions(34,56,78);
        Case theCase = new Case("2048","Dell","248",dimensions);

        Resolution nativeResolution = new Resolution(5,6);
        Monitor monitor = new Monitor("vaio", "Sony",12,nativeResolution);

        Motherboard motherboard = new Motherboard("vaio","Sony","none",4,4);

        PC thePc = new PC(theCase,monitor,motherboard);
        thePc.powerUp();
        thePc.drawLogo();
//        thePc.getMonitor().drawPixelAt(5,6,"red");
//        thePc.getMotherboard().loadProgram("Macosx");
//        thePc.getTheCase().pressPowerButton();

    }
}
