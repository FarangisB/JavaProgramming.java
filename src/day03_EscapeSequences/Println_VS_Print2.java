
package day03_EscapeSequences; // package name of the class

public class Println_VS_Print2 { // class name

    public static void main(String[] args) { // main method

        System.out.println("Knock Knock."); // first it prints Knock Knock then it appends a new line
        System.out.println("Who is this?");
        System.out.println("This is Java.");

        System.out.println("---------------------------------");

        System.out.print("Knock Knock."); // prints Knock Knock, does not append new line
        System.out.print(" Who is this?");
        System.out.print(" This is Java.");
        System.out.println();

        System.out.println("---------------------------------");

        System.out.print("Hello everyone, how are you today? Today we will learn Escape sequences, and next week we will learn Variables.");
        System.out.println();

        System.out.print("Hello everyone, how are you today? ");
        System.out.print("Today we will learn Escape sequences, ");
        System.out.print("and next week we will learn Variables.");


        /*
        Println gives you opportunity to start printing from new line.
        But print statement does not allow you to do that.
        We need print statement without ln to make sentences shorter

        */





       // --> use for single line commend


    }


}
