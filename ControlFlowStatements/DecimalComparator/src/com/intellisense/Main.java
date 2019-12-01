package com.intellisense;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var result = areEqualByThreeDecimalPlaces(5.1266755,5.126343232);
        System.out.println(result);
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2)
    {
        var expr1 = Math.round(num1*1000)/1000;
        var expr2 = Math.round(num2*1000)/1000;

        if(expr1==expr2)
            return true;

        else
            return false;
    }
}
