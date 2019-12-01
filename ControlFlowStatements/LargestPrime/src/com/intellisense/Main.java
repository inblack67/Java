package com.intellisense;

import java.util.Scanner;

class Main {
    public static  void main(String[] args)
    {
        System.out.println(getLargestPrime(45));
    }

    public static int getLargestPrime(int number)
    {
        int max = 2;
        if(number<=1)
            return -1;
        for(int i=2;i<=number;i++)
        {
            if(isPrime(i) && number%i==0)
            {
                if(i>max)
                    max=i;
            }
        }
        return max;
    }

    public static boolean isPrime(int number)
    {
        if(number<=1)
            return false;
        for(int j=2; j<= number/2; j++)
        {
            if(number%j==0)
                return false;
        }
        return true;
    }

}

