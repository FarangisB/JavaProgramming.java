package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt(); //number that user provides will be the length of array

        if (length<0){
            System.err.println("Invalid Entry");
            System.exit(0);
        }

        int [] numbers = new int[length]; // represents how many times user wants to enter a number

        for (int i = 0; i < length; i++) {
            System.out.println("Enter a number"); // this message will appear as many as the number user entered
            numbers [i] = scan.nextInt();
            //starts from 0 = input from the user
        }

        System.out.println(Arrays.toString(numbers));

        scan.close();


    }
}
