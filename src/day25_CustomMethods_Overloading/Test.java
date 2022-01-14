package day25_CustomMethods_Overloading;

import utilities.StringUtulity;

public class Test {

    public static void main(String[] args) {

        String sentence = "Java Programming Language";
        StringUtulity.printEachChar(sentence);

        System.out.println("___________________");
        
        String s1 = "Wooden Spoon";
        String reverse = StringUtulity.reverse(s1);
        System.out.println("reverse = " + reverse);

        System.out.println("____________________");

        String word = "Civic";
        boolean palindrome = StringUtulity.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);

        System.out.println("____________________");

        String[]names = {"Anna", "Java", "Python", "Racecar", "Mom"};

        int  count = 0;

        for (String each : names){
            if (StringUtulity.isPalindrome(each)){
                count++;
            }
        }
        System.out.println(count);

        System.out.println("__________________");

        String str2 = "aaaaaabbbbbbbcccccccddddd";

        String result = StringUtulity.removeDuplicates(str2);

        System.out.println(result);


    }

}
