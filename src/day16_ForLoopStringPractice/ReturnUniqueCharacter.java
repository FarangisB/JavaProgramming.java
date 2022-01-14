package day16_ForLoopStringPractice;

public class ReturnUniqueCharacter {

    public static void main(String[] args) {

        String str = "aaabcccssskkk";

        String result = "";

        // char ch = 'b'; ==> we can even variable instead of characters

        for (int i = 0; i < str.length(); i++) { // index number of str (starting from 0)
            char ch = str.charAt(i);             // each character of str
            if (str.indexOf(ch)==str.lastIndexOf(ch)){// if the first and last numbers of the character are the same, then the character is unique
                // index:    3          ==            3 // the indexes are the same
                result+=ch;
        }



        }
        System.out.println(result);

    }
}
/*
Write a program that can return the unique characters from a String

            Ex:
                input:
                    AABCCD

                output:
                    BD

            Hint: You will need indexOf() and lastIndexOf()
                  if the first and last index numbers of the character are same, then it's unique
 */