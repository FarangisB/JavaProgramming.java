package day22_MultiDimentionalArray;

import java.util.Arrays;

public class ReverseASentence {

    public static void main(String[] args) {

        String sentence = "Today is a good day to learn Java";
        //                   0    1 2   3   4   5   6     7
        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

        String reversedSentence = "";

        for (int i = words.length-1; i >=0 ; i--) {
            reversedSentence+=words[i]+" ";
        }
        System.out.println(reversedSentence);

    }
}



   /** Write a program that can reverse a sentence
            Ex:
                    sentence = "Today is a good day to learn Java";

                    output:
                    Java learn to day good a is Today
    */