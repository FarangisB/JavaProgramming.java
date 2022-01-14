package day17_While_DoWhile;

import java.util.Scanner;

public class FrequencyOfChar {

    public static void main(String[] args) {

        String str = new Scanner(System.in).nextLine();
        char ch = 'B';

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) { // i: indexes of str
            char eachChar = str.charAt(i); // eachChar: each character of str
            if (ch==eachChar){
                // frequency++; --> one way
                frequency += 1; // --> 2nd way
            }

        }
        System.out.println(frequency);

    }
}
/*
Write a program that can remove the duplicated characters from a String
            Ex:
                input:
                    AABBCCBC

                Output:
                    ABC

            Hint: You can add each characters of the string into another String
                  Condition: the character is not contained in the other String yet before you are adding

 */