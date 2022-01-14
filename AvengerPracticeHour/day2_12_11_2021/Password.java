package day2_12_11_2021;

public class Password {

    /**
     *  5.
     *                 Given a string password. Encrypt with "x" a given password
     *                 and print.
     *                 (do with for loop)
     *                 password: cydeo
     *                 encrypt with char :x
     *                 output:cxyxdxexox
     */

    public static void main(String[] args) {

        String password = "cydeo";
        char encryptWithChar = 'x';
        String encriptedPassword = "";

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);
            encriptedPassword += ""+each+encryptWithChar;
        }

        System.out.println(encriptedPassword);



    }



}
