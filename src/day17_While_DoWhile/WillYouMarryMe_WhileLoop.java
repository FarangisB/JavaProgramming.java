package day17_While_DoWhile;

import java.util.Scanner;

public class WillYouMarryMe_WhileLoop {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Will you marry me? yes/no");
        String answer = s.nextLine();
        String result = "";

        while (!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
            System.out.println("Invalid answer, please re-enter:");
            answer = s.nextLine();
        }
        if (answer.equalsIgnoreCase("yes")){
            result = "Congrats!";
        }else {
            result = "Goodbye!";
        }

        System.out.println(result);
s.close();

    }
}
/*
Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter"
    and repeat it until the user enters either yes or no
 */