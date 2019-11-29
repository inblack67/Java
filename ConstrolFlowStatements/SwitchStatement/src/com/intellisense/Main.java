package com.intellisense;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static  void main(String[] args) {
        char ch = 'Z';
        String str = "January";
        switch(ch)
        {
            case 'A':case 'B' : case 'C' :case 'D': case 'E':
            System.out.println("found out");
            break;
            default:
                System.out.println("not found shit");
        }

        switch(str.toLowerCase())
        {
            case "january":case "february" : case "march" : case "april" : case "may":
            System.out.println("found out");
            break;
            default:
                System.out.println("not found shit");
        }
    }
}

