package day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatements_BreakStatement {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z'; i++) {
            if (i=='F'){ // if you want to force the loop to stop, you can use break statement
                break;
            }
            System.out.print(i+" "); // if you want to print F too, you need to put print statement before if and break

        }

        System.out.println();

        System.out.println("________________________________");

        Scanner scan = new Scanner(System.in);

        while (true){ // this is infinite loop. In order to stop continuous repeating, you can give a condition and use break statement
            System.out.println("Enter a number:");
            int num = scan.nextInt();

            if (num<0){
                break;
            }
        }

    }


}

