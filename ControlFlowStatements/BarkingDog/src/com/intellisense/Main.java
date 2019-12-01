package com.intellisense;

public class Main {

    public static void main(String[] args) {
        var result = shouldWakeUp(true,1);
        System.out.println(result);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay)
    {
        if(!(hourOfDay>=0 && hourOfDay<=23))
            return false;

        if(!barking)
            return false;

        if(hourOfDay<8 || hourOfDay>22)
            return true;

        return false;
    }
}
