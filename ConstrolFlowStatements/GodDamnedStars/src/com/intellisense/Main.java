package com.intellisense;

import java.util.Scanner;

class Main {
    public static  void main(String[] args)
    {
        printSquareStar(8);
    }

    public static void printSquareStar(int number)
    {
        if(number<5)
            System.out.println("Invalid Value");
        else {
            for (int i = 1; i<=number; i++) {
                for (int j=1; j<=number; j++) {
                    if(i==1 || i==number || j==1 || j==number || i==j || i+j-1==number)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}

