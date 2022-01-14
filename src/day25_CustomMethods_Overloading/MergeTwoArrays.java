package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int arr1 [] = {1,2,3,4,5,6};
        int arr2 [] = {7,8,9,10,11,12};
        
        int [] mergedInt = mergeTwoArrays(arr1,arr2);
        System.out.println("merged = " + Arrays.toString(mergedInt));
        System.out.println("_________________________");

        double arr3 [] = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};
        double arr4 [] = {7.5, 8.5, 9.5, 10.5, 11.5, 12.5};

        double [] mergedDouble=mergeTwoArrays(arr3,arr4);
        System.out.println("mergedDouble = " + Arrays.toString(mergedDouble));
        System.out.println("___________________________");
        
        char [] chars = {'A', 'B', 'C'};
        char [] chars1 = {'D', 'E', 'F'};
        
        char [] mergedChars = mergeTwoArrays(chars, chars1);
        System.out.println("Arrays.toString(mergedChars) = " + Arrays.toString(mergedChars));
        System.out.println("___________________________");






    }

    public static int [] mergeTwoArrays (int [] arr1, int [] arr2){
        int ints [] = new int[arr1.length+arr2.length];

        int j = 0; // for the index of each int

        for (int ch : arr1) {
            ints[j]=ch;
            j++;
        }
        for (int ch : arr2) {
            ints[j] = ch;
            j++;
        }
        return ints;
    }

    public static double [] mergeTwoArrays (double [] arr1, double [] arr2){
        double doubles [] = new double[arr1.length+arr2.length];

        int j = 0; // for the index of each double

        for (double ch : arr1) {
            doubles[j]=ch;
            j++;
        }
        for (double ch : arr2) {
            doubles[j] = ch;
            j++;
        }
        return doubles;
    }

    public static char [] mergeTwoArrays (char [] arr1, char [] arr2){
        char chars [] = new char[arr1.length+arr2.length];

        char j = 0; // for the index of each char

        for (char ch : arr1) {
            chars[j]=ch;
            j++;
        }
        for (char ch : arr2) {
            chars[j] = ch;
            j++;
        }
        return chars;
    }

    public static String [] mergeTwoArrays (String [] arr1, String [] arr2){
        String Strings [] = new String[arr1.length+arr2.length];

        int j = 0; // for the index of each String

        for (String ch : arr1) {
            Strings[j]=ch;
            j++;
        }
        for (String ch : arr2) {
            Strings[j] = ch;
            j++;
        }
        return Strings;
    }

    
}
/**
 * 1. create a method that can merge two integer arrays
 *
 * 	2. create a method that can merge two double arrays
 *
 * 	3. create a method that can merge two char arrays
 *
 * 	4. create a method that can merge two String arrays
 */
