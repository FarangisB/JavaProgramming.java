package day3_12_18_2021;

import java.util.Locale;

public class CountTheWord {

    public static void main(String[] args) {

    String str = "Java is Java";
    String word = "Java";
    int count = 0;

     /*   for (int i = 0; i <= str.length()-word.length(); i++) {
            String temp = str.substring(i,i+word.length());
            if (temp.equalsIgnoreCase(word)){
                count++;
            }
        }

        System.out.println("Java = "+count);

     */

        System.out.println("__________________________");


        while (str.contains(word)){
            count++;

            str=str.replaceFirst(word, "");
        }

        System.out.println("count = " + count);
    }
}
/**
 * Count the word that is given inside the sentence
 *                                 input: Java is Java
 *                                 word:Java
 *                                 output:2
 */
