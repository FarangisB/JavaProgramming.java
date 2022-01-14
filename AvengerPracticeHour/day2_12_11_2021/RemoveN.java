package day2_12_11_2021;

import java.util.Scanner;

public class RemoveN {

    /**
     * 4.
     * Given a non-empty string and an int n, return a new string where the char at index n has been removed.
     * The value of n will be a valid index of a char in the original string
     * (do with for loop)
     * input:  kitchen and 2
     * output: kichen
     * input:  kitchen and 0
     * output: itchen
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        for (int i = 0; i < str.length(); i++) {
            if (i==n){
                continue;
            }
            str += str.charAt(i);
        }
        System.out.println(str);

    }
}
