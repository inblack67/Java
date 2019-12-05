package com.intellisense;

public class Main {

    public static void main(String[] args)
    {
        Printer printer = new Printer(50,false);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        System.out.println("Pages printed was " + printer.printPages(4));
        System.out.println("Total pages printed now " + printer.getPagesPrinted());

        System.out.println("Pages printed was " + printer.printPages(4));
        System.out.println("Total pages printed now " + printer.getPagesPrinted());
    }

}
