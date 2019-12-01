package com.intellisense;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int i=1;
        int number;
        int sum=0;
        Scanner scan = new Scanner(System.in);
        while(i<=10)
        {
            System.out.println("Enter the number " + i);
            boolean hasInt = scan.hasNextInt();
            if(hasInt)
            {
                i++;
                number = scan.nextInt();
                sum+=number;
            }
            else {
                System.out.println("Invalid Number");
            }
            scan.nextLine();

        }
        scan.close();

        System.out.println("Sum of all the number entered is " + sum);
    }

}