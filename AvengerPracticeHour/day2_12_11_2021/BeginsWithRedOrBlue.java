package day2_12_11_2021;

public class BeginsWithRedOrBlue {

    public static void main(String[] args) {

        /**
         * Given a string, if the string begins with "red" or "blue" print that color string,
         *                 otherwise print the empty string.
         *
         *                 input :"redxx" → "red"
         *                 input :"xxred" → ""
         *                 input :"blueTimes" → "blue"
         */

        String word = "xx";


        if (word.startsWith("red")){
            System.out.println("\"red\"");
        }else if(word.startsWith("blue")){
            System.out.println("\"blue\"");
        }else {
            System.out.println("\"\"");
        }


    }
}
