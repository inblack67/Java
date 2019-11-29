package com.intellisense;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Enter the number, Loop ends when you enter invalid shit");

            boolean hasInt = scan.hasNextInt();
            if(hasInt) {
                number = scan.nextInt();
                if(number>max)
                    max = number;
                if(number<min)
                    min = number;
            }
            else{
                break;
            }

            scan.nextLine();
        }
        scan.close();

        System.out.println("loop ends with maximum -> " + max + " and minimum -> " + min);


    }

}