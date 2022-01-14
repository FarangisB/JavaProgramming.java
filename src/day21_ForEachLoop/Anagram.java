package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        // String method toCharArray(): returns a char array
        // "abc".toArray()===> {'a', 'b', 'c'}

        String str1 = "acdb";
        String str2 = "dbca";

        char[]ch1=str1.toCharArray();
        char[]ch2=str2.toCharArray();

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean anagram = Arrays.equals(ch1, ch2);

        System.out.println("anagram = " + anagram); // true
        System.out.println(Arrays.equals(ch1, ch2)); // true


        // return the string to array
        // sort the array


        // write a program that can check if str1 & str2 are build out same characters


        System.out.println("_____________________________________________");

        // split(value): returns String array
        // "I love learning Java programming language".split(" ")====> {"I", "love", "learning", "Java", "programming", "language"}
        // "ABC".split("") == > {"A", "B", "C"}

        String sentence = "Wooden Spoon";
        String [] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("____________________________");

        String email = "WoodenSpoon@cydeo.com";
        String arr[]=email.split("@");

        System.out.println(Arrays.toString(arr));

        System.out.println("_______________________________");

        String s = "Today is a nice day. Today is Monday.";
        String []sentences = s.split("\\. ");  // dot (.) is a special case, so in order to split it you have to add \\ to the dot

        System.out.println(Arrays.toString(sentences));


    }
}
