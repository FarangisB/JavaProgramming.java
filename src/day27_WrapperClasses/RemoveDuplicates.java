package day27_WrapperClasses;

import utilities.ArraysUtilities;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int [] arr = {1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,4,4};

        arr = removeDuplicates(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println("____________________________");

        double [] arr1 = {20.5, 2.3, 2.6, 20.5};

        arr1 = removeDuplicates(arr1);

        System.out.println(Arrays.toString(arr1));

        System.out.println("-----------------------------------------");

        String[] words = {"Java", "Java", "Python", "C#", "Java", "Java"};

        words = removeDuplicates(words);

        System.out.println( Arrays.toString(words) );


    }
    // removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int [] array) {

        int[] result = {}; // an array for the temporarily value

        for (int each : array) {
            if (!ArraysUtilities.contains(result, each)) {
                result = ArraysUtilities.addElement(result, each);
            }
        }
        return result;

    }

    // removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double [] array) {

        double[] result = {}; // an array for the temporarily value

        for (double each : array) {
            if (!ArraysUtilities.contains(result, each)) {
                result = ArraysUtilities.addElement(result, each);
            }
        }
        return result;

    }

    // removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char [] array) {

        char[] result = {}; // an array for the temporarily value

        for (char each : array) {
            if (!ArraysUtilities.contains(result, each)) {
                result = ArraysUtilities.addElement(result, each);
            }
        }
        return result;

    }

    // removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String [] array) {

        String[] result = {}; // an array for the temporarily value

        for (String each : array) {
            if (!ArraysUtilities.contains(result, each)) {
                result = ArraysUtilities.addElement(result, each);
            }
        }
        return result;

    }



    }





