package day15_StringMethodsAndLoop;

import java.util.Scanner;

public class WebsiteVerification {

    public static void main(String[] args) {

        System.out.println("Enter a website:");
        String word = new Scanner(System.in).nextLine();

        boolean valid = word.startsWith("www.") && word.endsWith(".com") || word.endsWith(".edu")
                || word.endsWith(".gov");

        if (valid){
            System.out.println("Valid website");
        }else {
            System.out.println("Not valid");
        }





    }
}
/*
write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov
 */