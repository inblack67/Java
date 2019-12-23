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
        System.out.println("Minimum integer in the array is = " + minimumInt(array));
    }

    public static void createArray(int[] array)
    {
        System.out.println("Enter the elements");
        for(int i=0; i<array.length; i++)
        {
            array[i] = scanner.nextInt();
        }
    }

    public static int minimumInt(int[] array)
    {
        int min = Integer.MAX_VALUE;

        for(int i=0; i<array.length; i++)
        {
            if(array[i]<min)
                min = array[i];
        }
        return min;
    }

    public static void printArray(int[] array)
    {
        for(int i=0; i<array.length; i++)
        {
            System.out.println("Element " + i + ": " + array[i]);
        }
    }
}
