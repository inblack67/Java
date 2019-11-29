package com.intellisense;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static  void main(String[] args){
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int minutes, int seconds)
    {
        if(minutes<0)
            return "Invalid";
        if(seconds<0 || seconds>59)
            return "Invalid";
        var hours = minutes/60;
        var remainingMinutes = minutes%60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    public static String getDurationString(int seconds)
    {
        if(seconds<0)
            return "Invalid";
        var minutes = seconds/60;
        var remainingSeconds = seconds%60;
        return getDurationString(minutes,remainingSeconds);
    }

}



