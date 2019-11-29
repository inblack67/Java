package com.intellisense;

import java.beans.beancontext.BeanContextServiceRevokedEvent;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(1534));
    }

    public static int sumDigits(int number)
    {
        int sum=0;
        if(number>=10)
        {
            while(number>0)
            {
                int x = number%10;
                sum+=x;
                number/=10;
            }
            return sum;
        }
        return -1;
    }


}