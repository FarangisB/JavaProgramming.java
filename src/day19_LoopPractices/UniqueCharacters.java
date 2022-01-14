package day19_LoopPractices;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char ch = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                char character = str.charAt(j);
                if (ch == character) {
                    count++;
                }
            }
            if (count == 1) {
                result += ch;
            }
        }

        System.out.println(result);



        }

    }
/*
2. Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods
    			Ex:
                        str = "aabccdeef";
                        output:
                                bdf
 */
