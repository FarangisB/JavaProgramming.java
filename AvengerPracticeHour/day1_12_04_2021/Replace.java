package day1_12_04_2021;

public class Replace {

    public static void main(String[] args) {

        String str = "engin";

        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length()-1);

        str=str.replace(firstChar, ' ');
        str=str.replace(lastChar, ' ');

        System.out.println(str);

        System.out.println("___________________________");

        String str1 = "engin";
        String svar = str1.substring(1, str1.length()-1);

        System.out.println(svar);

        System.out.println("___________________________");


        String word = "Engin";
        String char1 = ""+word.charAt(0);
        String char2 = ""+word.charAt(word.length()-1);

        word = word.replace(char1, "");
        word = word.replace(char2, "");
        System.out.println(word);


        System.out.println("______________________________");

        String word1 = "Engin";
        char first1Char = word1.charAt(0);
        char last2Char = word1.charAt(word1.length() - 1);
        word1 = word1.replace(first1Char,' ');
        word1  =word1.replace(last2Char, ' ');
        System.out.println(word1);






    }
}
