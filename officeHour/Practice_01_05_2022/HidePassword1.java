package Practice_01_05_2022;

import java.util.ArrayList;

public class HidePassword1 {

    /*  (HidePassword)

                 Task 2 : Hide Passwords

                    Given an array of passwords (String). Hide each password as a star () and show the
                    hidden password

                    Ex:

                    Input:
                    {"one", "hi", "hold"}

                    Output:
                    [ **, , ** ]

                */

    public static void main(String[] args) {


        String [] passwords = {"one", "hi", "hold"};

        ArrayList<String> hiddenPassword = new ArrayList<>();

        for (String password : passwords) {
            hiddenPassword.add(password);
            System.out.print(convertToStar(hiddenPassword)+", ");
        }


    }

    public static String convertToStar(ArrayList<String> str){
        String star="";

        for (int i = 0; i < str.size(); i++) {
            star+="*";

        }
        return star;
    }





}
