package day22_MultiDimentionalArray;

import java.util.Arrays;

public class ReverseTheSecondWord {

    public static void main(String[] args) {

        String sentence ="I Love Java";
        String[] words = sentence.split(" ");

        System.out.println(words[1]);

        String reverse = "";

        for (int i = words[1].length()-1; i >=0; i--) {
            reverse+=words[1].charAt(i);
        }
        System.out.println(reverse);

        //sentence = sentence.replaceFirst(words[1], reverse);
        //System.out.println(sentence);                         --> this way is also works correctly

        words[1]=reverse;

        System.out.println(Arrays.toString(words));

        //String result = "";
        for (String word : words) {
            //result +=word+" ";
            System.out.print(word+" ");
        }

        //System.out.println(result); -- >  this way is also correct




    }
}
/**
 * Write a program that can reverse the second word of the sentence
 *             Ex:
 *                 sentence = "I Love Java";
 *
 *             output:
 *                 I evoL Java
 */