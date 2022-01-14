package day12_Scanner.day19_LoopPractices;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aabccdeeaf";
        String result = ""; // bdf

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int countChar = 0; // represents the frequency of the ch

            for (int i = 0; i < str.length(); i++) { //compares the
                char each = str.charAt(i);
                if (ch==each){ // if the
                    countChar++;
                }

            }
/*
            if(countChar==1){
                result++;

 */

            if (countChar!=1) {
                continue;
            }

            result+=ch;




        }


        System.out.println(result);



    }
}
/*
Write a program that can find the unique characters from a string without using
index() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character,
            then you can repeat it for the remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique

 */
