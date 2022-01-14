package day11_Switch_Scanner;

import java.util.Scanner; // in order to use data from scanner, first we have to bring scanner package to our file

public class ScannerIntro {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in); // we have to bring input info to use data from the scanner

        System.out.println("Enter an integer"); // if you want to put a command before using an integer, you can String a text

        //input.nextIn(); // in order to provide an input to the compiler, first we need to input scanner input type

        int num1 = input.nextInt(); // in order to reuse input data, we have to switch it in a variable

        System.out.println("Enter a decimal"); // if you want to ask user to print another data, ex. decimal, you have to write a String message after integer data

        double num2 = input.nextDouble(); // if you want to put the double data, you have use double type

        System.out.println(num1); // now we can use the data in the statement using variable name
        System.out.println(num2); // now we can use the data in the double variable
        System.out.println("Multiplication: " +(num1*num2)); // here we can multiply the variables

        input.close(); // everytime when you finish with scanner, it is recommended to close the scanner with current command


        /*
         in order to bring scanner package to the file we can write Scan after main String,
         and chose Scanner, so the package will be imported to the file automatically
         */


    }
}
