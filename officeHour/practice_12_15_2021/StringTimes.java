package practice_12_15_2021;

import java.util.Scanner;

public class StringTimes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any word:");
        String word = scan.nextLine();
        System.out.println("Enter any positive number:");
        int num = scan.nextInt();

        int count = 0;
        String sum = "";

        /*while (count<num){
            sum+=word+" ";
            count++;
        }
        System.out.println(sum);

         */

        System.out.println("__________________________");

        for (int i = 0; i < num; i++) {
            sum+=word+" ";
        }
        System.out.println(sum);


    }


}

/**
 * Given a string and a non-negative int n, return a larger string that
 * is n copies of the original string.
 *
 *                      input String : Hi  ,  input int : 2
 *
 *                      output: HiHi
 */
