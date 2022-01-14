package day27_WrapperClasses;

import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {

        int [] arr ={1,2,3,4,5,6};
        arr = swap(arr, 2, 1);

        System.out.println(Arrays.toString(arr));

        System.out.println("________________________");

        double[] arr2 = {2.5, 3.2, 20.3, 5.6};
        arr2 = swap(arr2, 2, 1);

        System.out.println(Arrays.toString(arr2));

        System.out.println("________________________");

        char [] ch= {'B', 'C', 'D'};
        ch= swap(ch, 1, 0);

        System.out.println(Arrays.toString(ch));


    }

    // swaps the element at index i with the element at index j, and returns the new array
    public static int [] swap(int [] array, int i, int j){
        if ((i<0||i> array.length-1)||(j<0||j> array.length-1)){
            System.err.println("Invalid index");
            System.exit(0);
        }
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;

        return array;
    }

    // swaps the element at index i with the element at index j, and returns the new array
    public static double [] swap(double [] array, int i, int j){
        if ((i<0||i> array.length-1)||(j<0||j> array.length-1)){
            System.err.println("Invalid index");
            System.exit(0);
        }
        double temp = array[i];
        array[i]=array[j];
        array[j]=temp;

        return array;
    }

    // swaps the element at index i with the element at index j, and returns the new array
    public static char [] swap(char [] array, int i, int j){
        if ((i<0||i> array.length-1)||(j<0||j> array.length-1)){
            System.err.println("Invalid index");
            System.exit(0);
        }
        char temp = array[i];
        array[i]=array[j];
        array[j]=temp;

        return array;
    }

    // swaps the element at index i with the element at index j, and returns the new array
    public static String [] swap(String [] array, int i, int j){
        if ((i<0||i> array.length-1)||(j<0||j> array.length-1)){
            System.err.println("Invalid index");
            System.exit(0);
        }
        String temp = array[i];
        array[i]=array[j];
        array[j]=temp;

        return array;
    }




}

/**
 *  Swap Task:
 * 	2.1 Create a method named swap that passes three parameters:
 * 	integer array, integer i, integer j. the method swaps the element
 * 	at index i with the element at index j, and returns the new array
 * 			Ex:
 * 				arr = {10, 20, 30, 40, 50};
 *
 * 				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}
 *
 * 	2.2 Create the same function for double array, char array and string array
 */
