package day15_StringMethodsAndLoop;

import java.util.Scanner;

public class GmailVerification {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your g-mail address:");
        String gmail = s.nextLine();

        boolean valid = gmail.endsWith("@gmail.com");

        if (valid){
            System.out.println("Gmail address is valid");
        }else {
            System.out.println("Gmail address is not valid");
        }
s.close();

    }
}
/*
write a program to verify if the gmail is valid
            requirements:
                    a valid gmail account should end with @gmail.com
 */