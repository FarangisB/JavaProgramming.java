package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        // sort method
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));

        Collections.sort(list);

        System.out.println(list); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println("_______________________________");

        // reverse method
        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A', 'B', 'C', 'D', 'E'));

        System.out.println(list2); // [A, B, C, D, E]

        Collections.reverse(list2);

        System.out.println(list2); // [E, D, C, B, A]

        System.out.println("_______________________________");

        // swap method
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60,70));

        Collections.swap(list3, 4, 1);

        System.out.println(list3); // [10, 50, 30, 40, 20, 60, 70]

        System.out.println("________________________________");

        int max = Collections.max(list3);
        int min = Collections.min(list3);

        System.out.println("min = " + min); // min = 10
        System.out.println("max = " + max); // max = 70





    }
}
