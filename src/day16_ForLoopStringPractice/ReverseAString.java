package day16_ForLoopStringPractice;

public class ReverseAString {

    public static void main(String[] args) {

        String str = "Wooden Spoon";
        // index:     01234567891011

        String result = ""; // container for the reversed version of str
        //noopS nedooW

        //result+=str.charAt(str.length()-1); // n
        /* result+=str.charAt(11); // n
        result+=str.charAt(10); // 0
        result+=str.charAt(9); // 0
        result+=str.charAt(8); // p
        result+=str.charAt(7); // S
        result+=str.charAt(6); //
        result+=str.charAt(5); // n
        result+=str.charAt(4); // e
        result+=str.charAt(3); // d
        result+=str.charAt(2); // o
        result+=str.charAt(1); // o
        result+=str.charAt(0); // W
         */

        /*for (int i=11; i>=0; i--);{

        }
        System.out.println(result);

         */

        for (int i = str.length()-1; i>=0; i--){
            result += str.charAt(i);
        }
        System.out.println(result);







    }


}
/*
Write a program that can reverse a String
ex:
    input:
        Wooden Spoon

    output:
        noopS nedooW
 */