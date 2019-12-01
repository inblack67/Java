package com.intellisense;

import java.beans.beancontext.BeanContextServiceRevokedEvent;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPallindrome(-121));
    }

    public static boolean isPallindrome(int number) {

        int originalNumber;
        int reversedInteger=0;
        int remainder;
        originalNumber = number;
        while(number != 0)
        {
            remainder = number%10;
            reversedInteger = reversedInteger*10 + remainder;
            number = number/10;
        }
        if(reversedInteger==originalNumber)
            return true;
        return false;
    }
}
