package com.intellisense;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        // Java has implemented LL as doubly

        LinkedList<String> placesToVist = new LinkedList<>();
//        placesToVist.add("London");
//        placesToVist.add("LA");
//        placesToVist.add("Vegas");
//        placesToVist.add("Mariana Trench");
//
//        printList(placesToVist);
//
//        placesToVist.add(2,"The Pacific");
//        printList(placesToVist);
//
//        placesToVist.remove(2);
//        printList(placesToVist);

        addInOrder(placesToVist,"Sydney");
        addInOrder(placesToVist,"Melbourne");
        addInOrder(placesToVist,"London");
        addInOrder(placesToVist,"LA");
        addInOrder(placesToVist,"Vegas");
        printList(placesToVist);

        addInOrder(placesToVist,"London");
        addInOrder(placesToVist,"England");
        printList(placesToVist);

        System.out.println("*****************************");
        visit(placesToVist);
    }

    private static void printList(LinkedList<String> linkedList)
    {

//        Iterator<String> i = linkedList.iterator();
//        while(i.hasNext())
//        {
//            System.out.println("Now visiting " + i.next());
//        }

        // Enhanced For Loop
        for (String s : linkedList)
        {
            System.out.println("Now visiting " + s);
        }
        System.out.println("=======================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity)
    {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        // While is used to meet the conditions and checking if..
        while (stringListIterator.hasNext())
        {
            int comparison = stringListIterator.next().compareTo(newCity);
//            The Java String compareTo() method is used for comparing two strings lexicographically.
//            f both the strings are equal then this method returns 0
//            else it returns positive or negative value.
//            The result is positive if the first string is
//            lexicographically greater than the second string else the result
//            would be negative.

            if(comparison==0)
            {
                System.out.println(newCity + " is already included");
                return false;
            }
            else if(comparison>0)
            {
                stringListIterator.previous(); // going one step backward
                stringListIterator.add(newCity);
                return true;
            }
            else if(comparison<0)
            {
                // already moved to next in int comparison......
            }
        }

        // Regular shit is done here
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities)
    {
//        The pointer lies between the following and the prev elements, thus loops are avoided auto?...
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        boolean goingForward = true;

        ListIterator<String> listIterator = cities.listIterator();
        if(cities.isEmpty())
        {
            System.out.println("No cities at all");
            return;
        }
        else
        {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while(!quit)
        {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action)
            {
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1: // we go to the next city

                    if(!goingForward)
                    {
                        if(listIterator.hasNext())
                            listIterator.next();
                        goingForward = true;
                    }

                    if(listIterator.hasNext())
                        System.out.println("Now visiting " + listIterator.next());
                    else {
                        System.out.println("Reached the end");
                        goingForward = false;
                    }
                    break;
                case 2: // we go to the previous city

                    if(goingForward)
                    {
                        if(listIterator.hasPrevious())
                            listIterator.previous();
                        goingForward = false;
                    }

                    if(listIterator.hasPrevious())
                        System.out.println("Now visiting " + listIterator.previous());
                    else {
                        System.out.println("Reached at the start of the journey again");
                        goingForward = true;
                    }
                case 3:
                    printMenu();
                    break;

            }
        }

    }

    private static void printMenu()
    {
        System.out.println("Avail Actions");
        System.out.println("0 - quit");
        System.out.println("1 - goto the next city");
        System.out.println("2 - goto the previous city");
        System.out.println("3 - print menu options");
    }

}
