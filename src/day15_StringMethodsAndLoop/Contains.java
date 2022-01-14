package day15_StringMethodsAndLoop;

import java.util.Locale;

public class Contains {

    public static void main(String[] args) {

        String sentence = "My favorite programming language is Java";

        // if you want to verify that one string of text includes another string of text, you use contains method

        boolean hasCSharp = sentence.contains("C#"); // if wanted to check if the sentence has the word C#
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java"); // here we put all lowercase in the word
        boolean hasJava3 = sentence.toLowerCase().contains("java");
        boolean r3 = sentence.contains("java")||sentence.contains("Java");


        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);

        System.out.println("____________________________");

        String input1 = "I love Java";
        String input2 = "java";

        System.out.println(input1.equals(input2));
        System.out.println(input1.equalsIgnoreCase(input2)); //can't make equalIgnoreCase

        System.out.println(input1.contains("Java"));


        // the only way to ignore case equality in the contains method is this:
        System.out.println(input1.toLowerCase().contains("java"));
        System.out.println(input1.toUpperCase().contains("JAVA"));







    }

}
