package day13_StringClass;

public class StringMethods {

    public static void main(String[] args) {

        String word =  "Cydeo";
        //index:   01234

        int thirdChar = word.charAt(2);

        System.out.println("thirdChar = " + thirdChar);

        /*
        char tenthChar = word.charAt(9);
        System.out.println("tenthChar = " + tenthChar);
         */

        System.out.println("------------------------------");

        String s1 = "Batch 25 is the best batch. Java programming language";

        int totalChars = s1.length();
        System.out.println("Total chars: "+totalChars);

        char lastChar = s1.charAt(s1.length()-1);
        System.out.println("Last index: "+lastChar);

        System.out.println("_________________________________________");

        String str = "wooden spoon";
        //str.toUpperCase();// ---> this way doesn't give us UPPERCASE, in
        str = str.toUpperCase(); // you have to return your string to a variable, it will return your writings to UPPERCASE writing


        System.out.println(str);
        // Today is a great day for learning java programming language
        String sentence = "Today is a great day for learning java programming language";
        sentence = sentence.toUpperCase();

        System.out.println(sentence);

    }
}
