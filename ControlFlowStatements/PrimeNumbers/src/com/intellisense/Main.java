package com.intellisense;

import java.beans.beancontext.BeanContextServiceRevokedEvent;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static  void main(String[] args) {
        int count=0;
        for(int i=1; i<=100; i++)
        {
            if(isPrime(i))
                count++;
        }
        System.out.println("Prime Numbers in range [1,100]-> " + count);


    }

    public static boolean isPrime(int n)
    {
        if(n==1)
            return  false;
        for(int i=2; i<n/2;i++)    // no number > n/2 is gonna divide the n anyways
        {                          // i<=Math.sqrt(n)
            if(n%i==0)
                return false;
        }
        return true;
    }

}

