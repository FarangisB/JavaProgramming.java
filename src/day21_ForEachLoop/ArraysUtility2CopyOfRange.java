package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2CopyOfRange {

    public static void main(String[] args) {

        // copyOf(array, newLength) --> copies the element of the array, starting from the first element to given number of element, returns new array

        String students[] = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};
        String earlyBirds[] = Arrays.copyOf(students, 3);

        System.out.println(Arrays.toString(earlyBirds));  // [Elif, Sinem, Gunay]

        int numbers []= {1,2,3,4,5,6,7,8,9,10};

        numbers = Arrays.copyOf(numbers, 5);

        System.out.println(Arrays.toString(numbers)); // [1, 2, 3, 4, 5]

        System.out.println("____________________________________");

        // copyOfRange(array, beginningIndex, endingIndex) copies the elements of the array starting
        // from beginning index till the ending index (ending index is excluded)

        char ch1[]= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        char ch2[]=Arrays.copyOfRange(ch1, 2, 6);
        // similar to substring method, the last char is not included
        //element for the index 2 is C and for 6 is G

        System.out.println(Arrays.toString(ch2)); // [C, D, E, F]

        System.out.println("____________________________________");

        int scores [] = {10,20,30,40,50,60,70,80,90,100}; // if we want to take scores from 40-80, then

        int result [] = Arrays.copyOfRange(scores, 3, 8);
        System.out.println(Arrays.toString(result)); // [40, 50, 60, 70, 80]





    }
}
