package com.intellisense;

import java.util.ArrayList;

class IntClass{ // WRAPPER CLASS OF INTEGERS
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {

        String[] strings = new String[10];
        int[] ints = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Tim");

//        ArrayList<int> intArrayList = new ArrayList<int>();
        // ArrayList takes object of a class as a param and int is a primitive type

        ArrayList<IntClass> intClasses = new ArrayList<>();
        intClasses.add(new IntClass(5)); // -- messy



        // AUTOBOXING - WRAPPER CLASS NEEDED FOR PRIMITIVE TYPES

        ArrayList<Integer> integers = new ArrayList<>();

        for(int i=0; i<=5; i++)
        {
//            integers.add(Integer.valueOf(i)); // autoboxing but unnecessary will be done at compile time by java auto? magically.
            integers.add(i); // would do
        }

        for(int i=0; i<=5; i++)
        {
            System.out.println(i + " = " + integers.get(i));
            // integers.get(i).intValue() - UNBOXING - taking it from obj wrapper and conv into primitive

        }

        Integer myIntValue = 56;
//        int myInt = myIntValue.intValue() // unboxing ; // myIntValue.intValue()
        int myInt = myIntValue;


//      ================================================================

//      DOUBLES
        ArrayList<Double> doubleArrayList = new ArrayList<>();

        for(double dbl=0.0; dbl<=10.0; dbl+=0.5)
        {
            doubleArrayList.add(dbl);
//            doubleArrayList.add(Double.valueOf(dbl));
        }

        for(int i=0; i<doubleArrayList.size(); i++)
        {
            System.out.println(i + " = " + doubleArrayList.get(i));
            // get takes int index a the param

        }


        // NOTHING IS STOPPING YOU FROM DOING THANGS THE LONG WAY

    }
}
