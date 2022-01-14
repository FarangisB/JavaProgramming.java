package day17_While_DoWhile;

import java.util.Scanner;

public class FrequencyOfWord2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        int frequency = 0;

        for (int i = 0; i <=str.length()-3 ; i++) {
            String eachsub = str.substring(i, i+3);

            if (eachsub.equalsIgnoreCase("cat")){
                frequency++;
            }
        }

        System.out.println(frequency);
s.close();
    }
}
