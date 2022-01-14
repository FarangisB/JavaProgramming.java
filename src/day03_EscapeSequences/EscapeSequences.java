package day03_EscapeSequences;

/*
escape sequances: must be given with double quote
\n: starts a new line ( example is given under main print)
\t: paragraph space (fulfills the TAB button job)
\\: single back slash (to print 1 backslash in console, you need to print 2 backslash.
And if you want to print 2 backslashes in console, you need to print 4 backslashes in print statement.
\": double code. in Java this " symbol is reserved only for sting of text, so if you need to " symbol to appear
in console, you need to use current escape sequence.
 */

public class EscapeSequences {

    public static void main(String[] args) {

        System.out.println("Java \nPython \nC#");

        System.out.println("-----------------------------------------------");

        System.out.println("Hello Cydeo \nHow are you today? \nIt`s nice to see you all! \nWhat class do we have next week?");

        System.out.println("-----------------------------------------------");

        System.out.println("\tJava is Cool Programming Language");

        System.out.println("-----------------------------------------------");

        System.out.println("/ \\");

        System.out.println("-----------------------------------------------");

        System.out.println("My favorite TV show is \"Game of Thrones\"");

    }


}
