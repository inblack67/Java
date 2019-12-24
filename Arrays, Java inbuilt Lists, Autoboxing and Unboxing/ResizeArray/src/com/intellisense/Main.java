package com.intellisense;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Enter the number of elements");
        int n = scanner.nextInt();

        if(n<1)
        {
            System.out.println("Length must be > 1");
            return;
        }

        int[] array = new int[n];

        createArray(array);
        printArray(array);
        System.out.println("Resizing.....");
        int[] resizedArray = resizeArray(array);
        createArray(resizedArray);
        printArray(resizedArray);
    }

    public static void createArray(int[] array)
    {
        System.out.println("Enter the elements");
        for(int i=0; i<array.length; i++)
        {
            array[i] = scanner.nextInt();
        }
    }

    public static int[] resizeArray(int[] array)
    {
        int[] original = array;
        System.out.println("Enter the new size");
        int newSize = scanner.nextInt();
        array = new int[newSize];
        for(int i=0; i<original.length; i++)
        {
            array[i] = original[i];
        }
        return array;
    }

    public static void printArray(int[] array)
    {
        for(int i=0; i<array.length; i++)
        {
            System.out.println("Element " + i + ": " + array[i]);
        }
    }
}
