package day19_LoopPractices;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aabcccd";
        String result="";


        for (int i = 0; i < str.length(); i++) {
            int frequency=0;
            char ch = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                char ch1 = str.charAt(j);
                if (ch1==ch){
                    frequency++;
                }
            }

            if(result.contains(""+ch)){
                continue;
            }
            result+=""+ch+frequency;

        }


        System.out.println(result);


    }
}
/*
1. Write a program that can find the frequency of the characters from a string
			 Ex:
                        str = "aabcccd";
                        output:
                                a2b1c3d1
 */
