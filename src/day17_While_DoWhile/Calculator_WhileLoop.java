package day17_While_DoWhile;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator_WhileLoop {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int num1 = s.nextInt();
        System.out.println("Enter your second number:");
        int num2 = s.nextInt();

        System.out.println("Enter a math operator:");
        char ch = s.next().charAt(0);

        /*if (!(ch=='+'||ch=='-')){ // if statement will repeat the statement only 1 time
            System.out.println("Invalid Operator, Please re-enter");
            ch = s.next().charAt(0);
        } // but if we want it to be repeated every time when the operator is not correct?
        // we have to use while loop
         */
        while (!(ch=='+'||ch=='-')) { // while statement will repeat the statement over and over unter the operator is correct
            System.err.println("Invalid Operator, Please re-enter");
            ch = s.next().charAt(0);

        }

        System.out.println((ch=='+')? num1+num2:num1-num2);

        s.close();
    }
}
