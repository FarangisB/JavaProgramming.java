package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Java";

        for (char each:str.toCharArray()){ // if you want to read every character of the string, you can assign the string to array
            System.out.println(each);   // J
                                        // a
                                        // v
                                        // a
        }

        // or you can make it in this way

        char [] chars = str.toCharArray();
        System.out.println(chars);

        for(char each  : chars ){
            System.out.println(each);
        }

        System.out.println("-------------------------------------");

        String sentence = "Wooden Spoon";

        String[] words =  sentence.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("------------------------------------");

        String email = "WoodenSpoon@cydeo.com";

        String[] arr = email.split("@");

        System.out.println(Arrays.toString(arr));

        System.out.println("------------------------------------------------");

        String s = "Today is nice day. Today is Monday. Today we learn Java";

        String[] sentences =s.split("\\. ");

        System.out.println(Arrays.toString(sentences));





    }
}
