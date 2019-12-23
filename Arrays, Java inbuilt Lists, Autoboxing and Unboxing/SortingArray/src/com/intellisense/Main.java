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
        printArray(sortArray(array));
    }

    public static void createArray(int[] array)
    {
        System.out.println("Enter the elements");
        for(int i=0; i<array.length; i++)
        {
            array[i] = scanner.nextInt();
        }
    }

    public static int[] sortArray(int[] array)
    {
        if(array.length==1)
        {
            return array;
        }

        boolean flag = true;

        while (flag)
        {
            flag=false;

            for(int i=0; i<array.length-1; i++)
            {
                if (array[i] < array[i + 1]) {
                    int temp;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
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
