package day2_12_11_2021;


import java.util.Scanner;

public class RotatedLeft2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter one word:");
        String word = scan.next();

/**
 *  Given a string, return a "rotated left 2" version where the first 2 chars 
 *  are moved to the end.
 *  
 *                 The string length will be at least 2.
 *
 *                 input :"Hello" -> "lloHe"
 *                 input :"java" → "vaja"
 *                 input :"Hi" → "Hi"
 */

       // String hello = "Hello";

        String first2Letters = word.substring(0,2);
        String rotated = word.substring(2)+first2Letters;

        System.out.println(rotated);
        
        // using for loop and charAt() method

        String newWord="";

        for (int i = 2; i < word.length(); i++) {
            newWord+=word.charAt(i);
        }
        for (int i = 0; i < 2; i++) {
            newWord += word.charAt(i);
        }


        System.out.println(newWord);

scan.close();

    }
}
