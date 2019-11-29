package com.intellisense;

public class Main {

    public static void main(String[] args) {
        var hasATeen = hasTeen(13,45,34);
        var isATeen = isTeen(30);
        System.out.println("has a teen? " + hasATeen);
        System.out.println("is a teen? " + isATeen);

    }

    public static boolean hasTeen(int age1, int age2, int age3)
    {
        if((age1>=13 && age1<=19) || (age1>=13 && age1<=19) || (age1>=13 && age1<=19))
            return true;
        return false;
    }

    public static boolean isTeen(int age)
    {
        if(age>=13 && age<=19)
            return true;
        return false;
    }
}
