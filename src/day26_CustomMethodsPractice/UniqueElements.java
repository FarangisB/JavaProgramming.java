package day26_CustomMethodsPractice;

import utilities.ArraysUtilities;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        int [] array = {1,1,2,3,3,4,5,5,6,7,7,7};
        int [] unique = uniqueElements(array);

        System.out.println(Arrays.toString(unique));

        System.out.println("_____________________");

        double [] arr = {1.5, 1.5, 2.5, 3.5, 3.5, 4.5, 5.5, 5.5, 6.5, 7.5, 7.5, 7.5};
        double [] unique1 = uniqueElements(arr);

        System.out.println(Arrays.toString(unique1));



    }

    // returns the unique elements of the int array as a new array
    public static int [] uniqueElements (int[] array){
        int [] result = {};

        for (int each:array){

            if (ArraysUtilities.frequencyOfElement(array, each)==1){
                result=ArraysUtilities.addElement(result, each);
            }

        }

        return result;
    }

    // returns the unique elements of the double array as a new array
    public static double [] uniqueElements (double[] array){
        double [] result = {};

        for (double each:array){

            if (ArraysUtilities.frequencyOfElement(array, each)==1){
                result=ArraysUtilities.addElement(result, each);
            }

        }

        return result;
    }

    // returns the unique elements of the char array as a new array
    public static char [] uniqueElements (char[] array){
        char [] result = {};

        for (char each:array){

            if (ArraysUtilities.frequencyOfElement(array, each)==1){
                result=ArraysUtilities.addElement(result, each);
            }

        }

        return result;
    }

    // returns the unique elements of the String array as a new array
    public static String [] uniqueElements (String[] array){
        String [] result = {};

        for (String each:array){

            if (ArraysUtilities.frequencyOfElement(array, each)==1){
                result=ArraysUtilities.addElement(result, each);
            }

        }

        return result;
    }


}
