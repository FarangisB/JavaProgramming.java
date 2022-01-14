package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaabcccdeeef";

        // this is how you can convert a string to an ArrayList
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")) );

        System.out.println(list); // [a, a, a, b, c, c, c, d, e, e, e, f]

        System.out.println("____________________________________________________");

        // the other method convert a string to an ArrayList is:
        String [] arr = str.split("");
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr) );
        System.out.println(list1); // [a, a, a, b, c, c, c, d, e, e, e, f]

        // finding unique from the string
        String unique = "";

        for (String each : list) {
           int frequency= Collections.frequency(list, each);
            if (frequency==1){
                unique+=each;
            }
        }

        System.out.println(unique); // bdf


    }
}
