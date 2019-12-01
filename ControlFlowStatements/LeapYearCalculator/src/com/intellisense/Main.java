package com.intellisense;

public class Main {

    public static void main(String[] args) {
        var result = isLeapYear(2100);
        System.out.println(result);
    }

    public static boolean isLeapYear(int year)
    {
        if((year%400==0)||(year%100!=0 && year%4==0))
            return true;
        return false;

//        if(year%400==0)
//            return true;
//        else if(year%100==0)
//            return false;
//        else if(year%4==0)
//            return true;
//        return false;
    }
}
