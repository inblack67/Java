package com.intellisense;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList
{
    private static Scanner scanner = new Scanner(System.in);

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item)
    {
        groceryList.add(item);
    }

    public void printGroceryList()
    {
        System.out.println("You have " + groceryList.size() + " item(s)");

        for(int i=0; i<groceryList.size(); i++)
        {
            System.out.println(groceryList.get(i));
        }
    }

    public void modifyItem(int position, String newItem)
    {
        groceryList.set(position,newItem);
        System.out.println("Grocery item " + groceryList.get(position) + " has been modified");
    }

    public void modifyItem(String item)
    {
        int position = findItem(item);
        if(position>=0)
        {
            System.out.println("Enter new item");
            String newItem = scanner.nextLine();
            modifyItem(position,newItem);
        }
    }

    public void removeItem(int position)
    {
        groceryList.remove(position);
    }

    public void removeItem(String item)
    {
        int position = findItem(item);
        if(position>=0)
        {
            removeItem(position);
        }
    }

    public int findItem(String searchItem)
    {
        return groceryList.indexOf(searchItem);     // 0/1 = found | -1 = not found
    }
}