package day09_IfAndElseAndMultiBranch;

public class MinNumber {

    public static void main(String[] args) {

        /* Create a class called MinNumber, Write a program that can print the minimum number
        between two numbers, if both are equal then print Equal

        Ex:
        n1= 100, n2 = 200;

        output:
        100 is the minimum number

         */

        int n1 = 300,
                n2 = 500;

        boolean n1IsMin = n1<n2,
                n2IsMin = n2<n1,
                equal = n1==n2;

        if (n1IsMin){
            System.out.println(n1 + " is the minimum number");
        }

        if (n2IsMin){
            System.out.println(n2 + " is the minimum number");
        }
        if (equal){
            System.out.println("Equal");
        }





    }


}
