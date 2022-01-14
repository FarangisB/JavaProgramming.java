package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementsToAnArray {

    public static void main(String[] args) {

        
        int [] array = {10,20,30,40};
        array = addInteger(array, 50);

        System.out.println(Arrays.toString(array));
        
        
        System.out.println("_____________________");
        
        double [] arr = {1.5, 2.5, 3.5, 4.5};
        arr = addDouble(arr, 5.5);
        System.out.println(Arrays.toString(arr));

        System.out.println("_____________________");

        String [] names = {"Tatyana", "Oleksandra", "Cassandra", "Ali"};

        names = addString(names, "Neira");

        System.out.println( Arrays.toString(names));

        System.out.println("______________________");

        char [] chars = {'A', 'B', 'C', 'D'};
        chars=addChar(chars, 'E');

        System.out.println(Arrays.toString(chars));
        
        

        


    }

    public static int [] addInteger(int [] arr, int element){

        int [] result = new int [arr.length+1];

        int i=0;
        for (int each : arr) {
           result[i++]=each;
        }
        result[i]=element;
        return result;

    }
    
    public static double []addDouble(double[]array, double element){
        
        double[] result = new double[array.length+1];
        
        int i = 0;
        for (double each : array) {
            result[i++]=each;
        }
        result[i]=element;
        
        return result;
    }

    public static String []addString(String[]array, String element){

        String[] result = new String[array.length+1];

        int i = 0;
        for (String each : array) {
            result[i++]=each;
        }
        result[i]=element;

        return result;
    }

    public static char []addChar(char[]array, char element){

        char[] result = new char[array.length+1];

        int i = 0;
        for (char each : array) {
            result[i++]=each;
        }
        result[i]=element;

        return result;
    }

}
/**
 *  Task2:
 *         1. create a return method called addInteger that can add an Integer
 *         after the  last index of an integer array
 *
 *         2. create a return method called addDouble that can add a double
 *         after the last index of a double array
 *
 *         3. create a return method called addString that can add a String
 *         after the last index of a String array
 *
 *         4. create a return method called addChar that can add a char
 *         after last index of a char array
 */