package com.intellisense;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static  void main(String[] args){
        printEqual(1,2,3);
    }
    // Test Cases -> (1,1,1) (1,1,2) (-1,-1,-1) (1,2,3)
    public static void printEqual(int a, int b, int c)
    {
        if(a<0 || b<0 || c<0) {
            System.out.println("Invalid Value");
            return;
        }
        if(a==b &&a==c && b==c) {
            System.out.println("All numbers are equal");
            return;
        }
        if(a!=b && a!=c && b!=c) {
            System.out.println("All numbers are different");
            return;
        }
        else {
            System.out.println("Neither all are equal or different");
        }

    }

}



