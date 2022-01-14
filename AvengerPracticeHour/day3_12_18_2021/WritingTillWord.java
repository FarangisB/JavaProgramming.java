package day3_12_18_2021;

public class WritingTillWord {

    public static void main(String[] args) {
        String word = "Code";

        for (int i = 1; i <=word.length() ; i++) {
            String temp = word.substring(0, i);
            System.out.print(temp);
        }





    }
}
/**
 * String Examples
 *          1.
 *          Given a non-empty string like "Code" print a string like below output.
 *         (do with substring  first)
 *          Code → "CCoCodCode"
 *          abc → "aababc"
 *          ab → "aab"
 *          (do with replaceFirst())
 *          Code → "C-Co-Cod-Code"
 *          abc → "a-ab-abc"
 *          ab → "a-ab"
 */
