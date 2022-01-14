package day15_StringMethodsAndLoop;

import java.util.Scanner;

public class SumOfMultipleNumbers {

    public static void main(String[] args) {

        int sum =0;     //    to find a sum of numbers first you have to have a variable for it
        for (int i = 1; i <101 ; i++) {   // in order to add every single number to each other
            sum+=i;
        }
        System.out.println(sum);

        System.out.println("______________________________");

        int total = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter a number:");
            total +=scan.nextInt();
        }
        System.out.println("total = " + total);

        scan.close();




    }


}
