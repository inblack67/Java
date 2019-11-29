package com.intellisense;

import java.beans.beancontext.BeanContextServiceRevokedEvent;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
        //sumFirstAndLastDigit(456);
    }

    public static int sumFirstAndLastDigit(int number)
    {
        if(number<0)
            return -1;
        int reversedInteger=0;
        int remainder;
        int originalNumber = number;
        while (number!=0)
        {
            remainder = number%10;
            reversedInteger = reversedInteger*10 + remainder;
            number/=10;
        }
        return (originalNumber%10)+(reversedInteger%10);

    }

}
