package com.intellisense;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes)
    {
        if(kiloBytes<0) {
            System.out.println("Invalid Value");
            return;
        }


        System.out.println(kiloBytes + " KB = " + kiloBytes/1024 + " MB and " + kiloBytes%1024 + " KB" );


    }
}
