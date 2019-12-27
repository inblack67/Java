package com.intellisense;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        GroceryList groceryList = new GroceryList();
        addItem(groceryList);
        addItem(groceryList);
        addItem(groceryList);

        modifyItem(groceryList);
        findItem(groceryList);
        removeItem(groceryList);

        groceryList.printGroceryList();

        processArrayList(groceryList);
    }

    public static void addItem(GroceryList groceryList)
    {
        System.out.println("Enter the item");
//        String item = scanner.nextLine();
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(GroceryList groceryList)
    {
        System.out.println("Enter the item that needs to be modified");
        String item = scanner.nextLine();
        groceryList.modifyItem(item);
    }

    public static void removeItem(GroceryList groceryList)
    {
        System.out.println("Enter the item that needs to be removed");
        String item = scanner.nextLine();
        groceryList.removeItem(item);
    }

    public static void findItem(GroceryList groceryList)
    {
        System.out.println("Enter the item that needs to be found out");
        String item = scanner.nextLine();
        System.out.println("Item found?  = " + groceryList.findItem(item));
    }

    public static void processArrayList(GroceryList groceryList)
    {
        //        newArrayList.addAll(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        groceryList.getGroceryList().toArray(myArray);
    }

}