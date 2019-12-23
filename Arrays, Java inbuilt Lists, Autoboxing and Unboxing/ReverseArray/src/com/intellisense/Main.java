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
        printArray(reverseArray(array));
    }

    public static void createArray(int[] array)
    {
        System.out.println("Enter the elements");
        for(int i=0; i<array.length; i++)
        {
            array[i] = scanner.nextInt();
        }
    }

    public static int[] reverseArray(int[] array)
    {
        for(int i=0,j=array.length-1; i<=j; i++,j--)
        {
            int temp;
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
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
