package com.intellisense;

import java.beans.beancontext.BeanContextServiceRevokedEvent;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static  void main(String[] args) {
        System.out.println(sumOdd(13,13));     // 13 itself is odd
    }

    public static boolean isOdd(int number)
    {
        if(number<0)
            return false;
        if(number%2!=0)
            return true;
        return false;
    }
    public static int sumOdd(int start, int end)
    {
        if(start<0 || end<0 || start>end)
            return -1;

        int sum=0;
        for(int i=start; i<=end; i++)
        {
            if(isOdd(i))
            {
                sum+=i;
            }
        }
        return sum;
    }
}

