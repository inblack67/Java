package com.intellisense;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var result = hasEqualSum(1,-1,0);
        System.out.println(result);
    }

    public static boolean hasEqualSum(int num1, int num2, int num3)
    {
        return true?((num1+num2)==num3):false;
    }
}



