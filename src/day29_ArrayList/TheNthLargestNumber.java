package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TheNthLargestNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

        //ArrayList<Integer> list2 = new ArrayList<>(list);

    /*    int max = list.get(0);
        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)>max){
                max= list.get(i);
                count++;

                if (count==3){
                    System.out.println(max);
                    break;
                }
        }

     */

        int n = 3;

        for (int i = 1; i < n; i++) {
            list.removeIf( p -> Collections.max(list)==p);

        }

        int max = Collections.max(list);

        System.out.println(max);


        }







    }

/**
 * write a program that can return the nth largest number from an arrayList
 *
 * arrayList = {1,2,3,4,5,6,7,8}
 * n = 5;
 * output: 4
 */
