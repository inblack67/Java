package com.intellisense;

import java.beans.beancontext.BeanContextServiceRevokedEvent;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.println(hasSameLastDigit(19,99,109));
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3)
    {
        if(number1<10 || number1>1000 || number2<10 || number2>1000 || number3<10 || number3>1000)
            return false;
        int remainder1=0;
        int remainder2=0;
        int remainder3=0;

        remainder1 = number1%10;
        remainder2 = number2%10;
        remainder3 = number3%10;
        if(remainder1==remainder2 || remainder1==remainder3 || remainder2==remainder3)
            return true;
        return false;

    }
}
