package day4_01_08_2022;

public class FindPositionOfGivenWordInSentence {

    /**
     * - Find the index of the given word in sentence
     * * do not use indexOf() method
     */

    public static void main(String[] args) {

        String sentence= "Java is my job because I am SDET";
        String word = "SDET";

        int position = findPositionOfGivenWord(sentence, word);

        System.out.println(position);

    }

    private static int findPositionOfGivenWord(String sentence, String word) {
        String[] words = sentence.split(" ");
        int count=0;

        for (String each:words){
            count++;
            if(each.equals(word)){
                break;
            }
        }
return count;
    }
}