package com.intellisense;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static  void main(String[] args) {
        printYearsAndDays(561600);
    }


    public static void printYearsAndDays(long minutes)
    {
        if(minutes<0)
            System.out.println("Invalid Value");
        var days = minutes/(60*24);
        var years = minutes/(60*24*365);
        var remainingDays = days%(365);
        System.out.println(minutes + " min = " + years + " y" + " and " + remainingDays + " d");
    }
}

