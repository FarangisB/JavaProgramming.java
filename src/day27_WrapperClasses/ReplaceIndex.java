package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceIndex {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        arr = replace(arr, 2, 30);

        System.out.println(Arrays.toString(arr));

        System.out.println("_______________________");

        String [] arr2 = {"Java", "Python", "C++", "Ruby"};

        arr2=replace(arr2, 2, "C#");

        System.out.println(Arrays.toString(arr2));


    }


    // replaces the element of the int array at given index with the new int element and returns the new int array.
    public static int [] replace(int [] array, int index, int newElement){

        if(index<0||index>array.length-1){
            System.out.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index]=newElement;
        return array;
    }

    // replaces the element of the Double array at given index with the new Double element and returns the new array.
    public static Double [] replace(Double [] array, int index, Double newElement) {

        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid Index: " + index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }

    // replaces the element of the char array at given index with the new char element and returns the new array.
    public static char [] replace(char [] array, int index, char newElement) {

        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid Index: " + index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }

    // replaces the element of the String array at given index with the new String element and returns the new array.
    public static String [] replace(String [] array, int index, String newElement) {

        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid Index: " + index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }
    
}
/**
 * Replace Task:
 *         1.1 Create a method named replace that passes three parameters:
 *         integer array, integer index, integer newElement. The method
 *         replaces the element of the array at given index with the new element,
 *         and returns the new array.
 *                 Ex:
 *                     arr = {1,2,3,4,5};
 *
 *                     replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}
 */
