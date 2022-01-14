package day24_CustomMethod_Return;

public class UniqueCaracter {

    public static void main(String[] args) {

        uniqueCharacter("farangis bayzaeva");

    }

    // create a method that can display the unique characters of a string

    public static void uniqueCharacter(String str){

        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int countChar = 0;

            for (int i = 0; i < str.length(); i++) {
                char eachChar = str.charAt(i);
                if (ch==eachChar){
                    countChar++;
                }
            }

            if (countChar!=1){
                continue; }

            result+=ch;
        }

        System.out.println(result);

    }



}
