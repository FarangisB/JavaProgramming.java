package day15_StringMethodsAndLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);
        int max = -2147483648; // this is the minimum number of Integer

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int num = s.nextInt();
            // in order to find max number
            if(num>max){
                max=num;
            }
        }

        System.out.println("Max number is = " + max);



    }

}
/*
Write a program that asks the user to enter a number for 5 times.
Return the maximum number
 */