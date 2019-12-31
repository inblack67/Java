package com.intellisense;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Player me = new Player("A-Man",69,100);
        System.out.println(me.toString());
        saveObject(me);

        me.setHitPoints(99);
        System.out.println(me);
        me.setWeapon("Bare Hands");
        saveObject(me);
//        loadObject(me);
        System.out.println(me);

        System.out.println();

        System.out.println("I fear that the real bad guys have arrived");

        ISaveable werewolf = new Monster("Werewolf",20,40); // code is more generic this way
//        as here only generic meths had to be implemented
//        System.out.println(werewolf.getStrength()); // who is the werewolf?
        System.out.println("Strength = " + ((Monster)werewolf).getStrength());
//        typecasting the interface werewolf as ((Monster)werewolf).getStrength()
//        or you could have done Monster werewolf = new ...
        System.out.println(werewolf);
        saveObject(werewolf);
    }

    public static ArrayList<String> readValues()
    {
        ArrayList<String> values = new ArrayList<>();
        boolean quit = false;
        int index = 0;
        System.out.println("Choose");
        System.out.println("1  - to enter a string");
        System.out.println("0  - quit");

        while(!quit)
        {
            System.out.println("Choose an option");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 0: quit = true;
                break;
                case 1:
                    System.out.println("Enter a string");
                    String stringInput = scanner.nextLine();
                    values.add(index,stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave)
    {
        for(int i=0; i<objectToSave.write().size(); i++)
        {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad)
    {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}

