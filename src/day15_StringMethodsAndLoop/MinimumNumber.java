package day15_StringMethodsAndLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int min = 2147483647;

        for (int i =0; i <5; i++) {
            System.out.println("Enter a number:");
            int num = s.nextInt();
            if (num<min){
                min=num;
            }
        }

        System.out.println("Min number is = "+min);

    }

}
/*
Write a program that asks the user to enter a number for 5 times.
Return the maximum number
 */