package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int [] numbers = {10,20,30,40,50};
        int [] reversed= new int[numbers.length]; // to make sure that the array has enough capacity to contain all the elements of first array

        // in order to reverse array you have to take the last element from the array and put it in the first place

 /*     you can make it this way:

        reversed[0]=numbers[3];
        reversed[1]=numbers[2];
        reversed[2]=numbers[1];
        reversed[3]=numbers[0];

  */

        // or create a loop:

        for (int i = numbers.length-1, j =0 ; i>=0; i--, j++ ) {
            reversed[j]=numbers[i];

        }



        System.out.println(Arrays.toString(reversed));


    }
}
