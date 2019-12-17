package com.intellisense;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntArray = new int[10];
//        double[] mydoubleArray = new double[10];
//        myIntArray[5] = 50; // 0-9?

        for(int i=0; i<myIntArray.length; i++)
        {
            myIntArray[i] = i*10;
        }
        printArray(myIntArray);

        System.out.println();

        System.out.println("Manual Arrays");

        //int[] manualArray = getIntegers(myIntArray);

        printArray(getIntegers(myIntArray));
        System.out.println("Average of the elements of the enters array = " + getAverageOfElementsInArray(myIntArray));

    }

    public static int[] getIntegers(int[] myIntArray)
    {
        System.out.println("Enter " + myIntArray.length + " Elements");

        for(int i=0; i<myIntArray.length; i++)
        {
            myIntArray[i] = scanner.nextInt();
        }

        return myIntArray;
    }

    public static void printArray(int[] myIntArray)
    {
        for(int i=0; i<10; i++)
        {
            System.out.println("Element " + i + ": " + myIntArray[i]);
        }
    }

    public static double getAverageOfElementsInArray(int[] myIntArray)
    {
        int sum=0;
        for(int i=0; i<myIntArray.length; i++)
        {
            sum+=myIntArray[i];
        }
        return (double) sum/myIntArray.length;
    }
}
