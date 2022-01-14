package day17_While_DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class EligibleToVote_WhileLoop {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = s.nextInt(); // 1~120

        while (!(age>=1||age<=120)){
            System.err.println("Invalid entry, please re-enter:");
            System.err.println("Enter your name:");
            age = s.nextInt();
        }
        System.out.println("Are you a US citizen? yes/no");
        String answer = s.next().toLowerCase();

        while (!(answer.equals("yes")||answer.equals("no"))){
            System.err.println("Invalid entry, please re-enter:");
            System.err.println("Are you a US citizen? yes/no");
            answer = s.next();
        }
        if (age>=18&&answer.equals("yes")){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }



s.close();


    }
}
