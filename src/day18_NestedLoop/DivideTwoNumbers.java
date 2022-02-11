package day18_NestedLoop;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        int a = 7; // a = 30-7= 23-7= 16-7= 9-7=2 --> a=2
                        //  +1     +1   +1     +1
        int b = 5;

        int count = 0; // count = 1+1+1+1 = 4

        while (a>=b){
            a-=b;
            count++;
        }
        System.out.println(count+" with a remainder of "+a);




    }
}
/*
 Write a program that can divide two positive numbers without using / (division) and *
 (multiplication) operators.

 */