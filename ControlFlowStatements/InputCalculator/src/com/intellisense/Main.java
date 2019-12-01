package com.intellisense;

import java.util.Scanner;

class Main
{
    public static void main(String[] args) {

        int number;
        int sum=0,avg=0;
        int count=0;
        Scanner scan = new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter the number");
            boolean hasInt = scan.hasNextInt();
            if(hasInt)
            {
                number = scan.nextInt();
                sum+=number;
                count++;
            }
            else
            {
                break;
            }
            scan.nextLine();
        }
        scan.close();
        if(sum==0) {
            System.out.println("Sum = " + sum + " Avg = " + avg);
        }
        else {
            avg = sum / count;
            System.out.println("Sum = " + sum + " Avg = " + avg);
        }

    }

}