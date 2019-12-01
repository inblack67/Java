package com.intellisense;

import java.beans.beancontext.BeanContextServiceRevokedEvent;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }

    public static  int getEvenDigitSum(int number)
    {
        if(number<0)
            return -1;
        int originalNumber = number;
        int sum=0;
        while(number!=0)
        {
            int remainder = number%10;
            if(remainder%2==0)
                sum+=remainder;
            number/=10;
        }
        return sum;
    }


}
