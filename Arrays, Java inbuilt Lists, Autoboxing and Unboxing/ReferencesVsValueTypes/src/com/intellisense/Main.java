package com.intellisense;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        // VALUE TYPES
        int myValue = 10;
        int anotherValue = myValue;
        System.out.println("Value 1 = " + myValue);
        System.out.println("Value 2 = " + anotherValue);

        myValue++;

        System.out.println("Value 1 = " + myValue);
        System.out.println("Value 2 = " + anotherValue);

        // REFERENCE TYPES

        int[] myArray = new int[5]; // Ref to the array
        int[] anotherArray = myArray;   // Another ref to the same arrya

        System.out.println("Array1 = " +  Arrays.toString(myArray));
        System.out.println("Array2 = " +  Arrays.toString(anotherArray));

        anotherArray[0] = 1; // both var are ref the same array in memory

        System.out.println("After change Array1 = " +  Arrays.toString(myArray));
        System.out.println("After change Array2 = " +  Arrays.toString(anotherArray));

        modifyArray(myArray);
        anotherArray = new int[] {6,7,8,8}; // deref 
        System.out.println("After change Array1 = " +  Arrays.toString(myArray));
        System.out.println("After change Array2 = " +  Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array)
    {
        array[1] = 2; // works
        array = new int[] {1,2,3,4,5,6}; // deref the ref and pointing to the "new" array in the memory
    }
}
