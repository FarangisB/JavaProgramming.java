package day42_Exceptions_Throw_ThrowsKeywords;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {

        System.out.println("Enter your age:");
        int age = new Scanner(System.in).nextInt();

        if(age<0){
        /*    System.err.println("Invalid age: "+age); // this is how we used to terminate the process
            System.exit(1);   */

           throw new InputMismatchException("Age can not be negative: "+age);
        }
        if(age>21){
            System.out.println("You are eligible to vote.");
        }else {
            throw new RuntimeException("You must be at least 21 years old.");
        }

    }
}
