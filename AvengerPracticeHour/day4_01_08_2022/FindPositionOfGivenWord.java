package day4_01_08_2022;

import java.util.ArrayList;

public class FindPositionOfGivenWord {

    public static void main(String[] args) {

        String sentence= "Java is my job because I am SDET";
        String word = "SDET";

        int position = findPositionOfGivenWord(sentence, word);

        System.out.println(position);

    }

    private static int findPositionOfGivenWord(String sentence, String word) {
        ArrayList<String> words = splitWords(sentence);

        int j=0;
        for (int i = 0; i < words.size(); i++) {
            if(words.get(j).equals(word)){
                break;
            }
        }
        return j+1;

    }

    private static ArrayList<String> splitWords(String sentence) {
        String [] words = sentence.split(" ");
        ArrayList<String> result = new ArrayList<>();

        for (String word : words) {
            if(!word.isEmpty()){
                result.add(word);
            }
        }
        return result;
    }
}
