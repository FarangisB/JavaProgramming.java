package day17_While_DoWhile;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String str = "JavaJava";

        int frequency=0;

        for (int i =0; i <= str.length()-4; i++) { // because we are adding 4 to the index, we need to
                                                    // subtract 4 in case our length not going out of index
            String eachSub = str.substring(i, i+4); // i is representing the beginning index
            //System.out.println(eachSub); // it gives you all substrings that can be in the str with 4 chars

            if (eachSub.equalsIgnoreCase("Java")){// here you give condition
                frequency++; // in order to
            }

        }
        System.out.println(frequency);



    }
}
/*
write a program that can return the frequency of the word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create

 */
