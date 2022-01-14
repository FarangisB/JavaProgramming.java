package utilities;

import java.util.Arrays;

public class ArraysUtilities {

    //1. prints each integer of an integer array in separate lines
    public static void printEachElement(int [] array){
        for (int each : array) {
            System.out.println(each);
        }
    }

    //2. prints each double of a double array in separate lines
    public static void printEachElement(double [] array){
        for (double each : array) {
            System.out.println(each);
        }
    }

    //3. prints each char of a char array in separate lines
    public static void printEachElement(char [] array){
        for (char each : array) {
            System.out.println(each);
        }
    }

    //4. prints each String of a String array in separate lines
    public static void printEachElement(String [] array){
        for (String each : array) {
            System.out.println(each);
        }
    }

    //5. returns the maximum number for integer array
    public static int maxElement (int [] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }
    
    //6. returns the maximum number for double array
    public static double maxElement (double [] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    //7. returns the minimum number for integer array
    public static int minElement (int [] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    //8. returns the minimum number for double array
    public static double minElement (double [] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    //9. checks if the given integer is contained in the given array, returns boolean
    public static boolean contains (int [] array, int element){
        boolean result = false;

        for (int each : array) {
            if (each==element){
                result=true;
            }
        }
        return result;
    }

    //10. checks if the given double is contained in the given array, returns boolean
    public static boolean contains (double [] array, double element){
        boolean result = false;

        for (double each : array) {
            if (each==element){
                result=true;
            }
        }
        return result;
    }

    //11. checks if the given char is contained in the given array, returns boolean
    public static boolean contains (char [] array, char element){
        boolean result = false;

        for (char each : array) {
            if (each==element){
                result=true;
            }
        }
        return result;
    }

    //12. checks if the given String is contained in the given array, returns boolean
    public static boolean contains (String [] array, String element){
        boolean result = false;

        for (String each : array) {
            if (each==element){
                result=true;
            }
        }
        return result;
    }

    //13. returns the frequency of the given int element from the given int array
    public static int frequencyOfElement(int [] array, int element){
        int frequency =0;
        for (int each : array) {
            if (each==element){
                frequency ++;
            }

        }
        return frequency;
    }

    //14. returns the frequency of the given double element from the given double array
    public static double frequencyOfElement(double [] array, double element){
        int frequency =0;
        for (double each : array) {
            if (each==element){
                frequency ++;
            }

        }
        return frequency;
    }

    //15. returns the frequency of the given char element from the given char array
    public static int frequencyOfElement(char [] array, char element){
        int frequency =0;
        for (char each : array) {
            if (each==element){
                frequency ++;
            }

        }
        return frequency;
    }

    //16. returns the frequency of the given String element from the given String array
    public static int frequencyOfElement(String [] array, String element){
        int frequency =0;
        for (String each : array) {
            if (each.equals(element)){
                frequency ++;
            }

        }
        return frequency;
    }

    //17. create a return method called addInteger that can add an Integer
    //after the  last index of an integer array
    public static int [] addElement(int [] arr, int element){

        int [] result = new int [arr.length+1];

        int i=0;
        for (int each : arr) {
            result[i++]=each;
        }
        result[i]=element;
        return result;

    }

    //18.create a return method called addDouble that can add a double
    //after the last index of a double array
    public static double []addElement(double[]array, double element){

        double[] result = new double[array.length+1];

        int i = 0;
        for (double each : array) {
            result[i++]=each;
        }
        result[i]=element;

        return result;
    }

    //19. create a return method called addString that can add a String
    //after the last index of a String array
    public static String []addElement(String[]array, String element){

        String[] result = new String[array.length+1];

        int i = 0;
        for (String each : array) {
            result[i++]=each;
        }
        result[i]=element;

        return result;
    }

    //20. create a return method called addChar that can add a char
    //after last index of a char array
    public static char []addElement(char[]array, char element){

        char[] result = new char[array.length+1];

        int i = 0;
        for (char each : array) {
            result[i++]=each;
        }
        result[i]=element;

        return result;
    }

    //21. returns the unique elements of the int array as a new array
    public static int [] uniqueElements (int[] array){
        int [] result = {};

        for (int each:array){

            if (ArraysUtilities.frequencyOfElement(array, each)==1){
                result=ArraysUtilities.addElement(result, each);
            }

        }

        return result;
    }

    //22. returns the unique elements of the double array as a new array
    public static double [] uniqueElements (double[] array){
        double [] result = {};

        for (double each:array){

            if (ArraysUtilities.frequencyOfElement(array, each)==1){
                result=ArraysUtilities.addElement(result, each);
            }

        }

        return result;
    }

    //23. returns the unique elements of the char array as a new array
    public static char [] uniqueElements (char[] array){
        char [] result = {};

        for (char each:array){

            if (ArraysUtilities.frequencyOfElement(array, each)==1){
                result=ArraysUtilities.addElement(result, each);
            }

        }

        return result;
    }

    //24. returns the unique elements of the String array as a new array
    public static String [] uniqueElements (String[] array){
        String [] result = {};

        for (String each:array){

            if (ArraysUtilities.frequencyOfElement(array, each)==1){
                result=ArraysUtilities.addElement(result, each);
            }

        }

        return result;
    }

    //25. removes the index from the array, returns new array
    public static int[] removeElement(int[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        int[] result = new int[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }

    //26. removes the index from the array, returns new array
    public static double[] removeElement(double[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        double[] result = new double[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }

    //27. removes the index from the array, returns new array
    public static char[] removeElement(char[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        char[] result = new char[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }

    //28. removes the index from the array, returns new array
    public static String[] removeElement(String[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        String[] result = new String[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }

    //29. merge the given two int arrays and returns the new int array
    public static int [] merge(int[] arr1, int [] arr2) {

        int [] result = {};

        for (int each : arr1) {
            result=ArraysUtilities.addElement(result, each);
        }
        for (int each : arr2) {
            result=ArraysUtilities.addElement(result, each);
        }

        return result;

    }

    //30. merge the given two double arrays and returns the new double array
    public static double [] merge(double[] arr1, double [] arr2) {

        double [] result = {};

        for (double each : arr1) {
            result=ArraysUtilities.addElement(result, each);
        }
        for (double each : arr2) {
            result=ArraysUtilities.addElement(result, each);
        }

        return result;
    }

    //31. merge the given two char arrays and returns the new char array
    public static char [] merge(char[] arr1, char [] arr2) {

        char [] result = {};

        for (char each : arr1) {
            result=ArraysUtilities.addElement(result, each);
        }
        for (char each : arr2) {
            result=ArraysUtilities.addElement(result, each);
        }

        return result;
    }

    //32. merge the given two String arrays and returns the new String array
    public static String [] merge(String[] arr1, String [] arr2) {

        String [] result = {};

        for (String each : arr1) {
            result=ArraysUtilities.addElement(result, each);
        }
        for (String each : arr2) {
            result=ArraysUtilities.addElement(result, each);
        }

        return result;
    }

    //33. reverses the given int array, returns a new int array
    public static int [] reverse(int [] array){

        int [] result = new int[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
            result[j]=array[i];
        }
        return result;
    }

    //34. reverses the given double array, returns a new double array
    public static double [] reverse(double [] array){

        double [] result = new double[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
            result[j]=array[i];
        }
        return result;
    }

    //35. reverses the given char array, returns a new char array
    public static char [] reverse(char [] array){

        char [] result = new char[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
            result[j]=array[i];
        }
        return result;
    }

    //36. reverses the given String array, returns a new String array
    public static String [] reverse(String [] array){

        String [] result = new String[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
            result[j]=array[i];
        }
        return result;
    }

    //37. replaces the element of the int array at given index with the new int element and returns the new int array.
    public static int [] replace(int [] array, int index, int newElement){

        if(index<0||index>array.length-1){
            System.out.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index]=newElement;
        return array;
    }

    //38. replaces the element of the Double array at given index with the new Double element and returns the new array.
    public static Double [] replace(Double [] array, int index, Double newElement) {

        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid Index: " + index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }

    //39. replaces the element of the char array at given index with the new char element and returns the new array.
    public static char [] replace(char [] array, int index, char newElement) {

        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid Index: " + index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }

    //40. replaces the element of the String array at given index with the new String element and returns the new array.
    public static String [] replace(String [] array, int index, String newElement) {

        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid Index: " + index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }

    //41. replaces all the element of the array that matching with the given old element
    // with the given new element, and returns the new array
    public static int [] replaceAll(int[]array, int oldElement, int newElement){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldElement){
                array[i]=newElement;
            }
        }
        return array;
    }

    //42. replaces all the element of the array that matching with the given old element
    // with the given new element, and returns the new array
    public static Double [] replaceAll(Double[]array, Double oldElement, Double newElement){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldElement){
                array[i]=newElement;
            }
        }
        return array;
    }

    //43. replaces all the element of the array that matching with the given old element
    // with the given new element, and returns the new array
    public static char [] replaceAll(char[]array, char oldElement, char newElement){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldElement){
                array[i]=newElement;
            }
        }
        return array;
    }

    //44. replaces all the element of the array that matching with the given old element
    // with the given new element, and returns the new array
    public static String [] replaceAll(String[]array, String oldElement, String newElement){
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldElement)){
                array[i]=newElement;
            }
        }
        return array;
    }

    //45. removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int [] array) {

        int[] result = {}; // an array for the temporarily value

        for (int each : array) {
            if (!ArraysUtilities.contains(result, each)) {
                result = ArraysUtilities.addElement(result, each);
            }
        }
        return result;

    }

    //46. removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double [] array) {

        double[] result = {}; // an array for the temporarily value

        for (double each : array) {
            if (!ArraysUtilities.contains(result, each)) {
                result = ArraysUtilities.addElement(result, each);
            }
        }
        return result;

    }

    //47. removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char [] array) {

        char[] result = {}; // an array for the temporarily value

        for (char each : array) {
            if (!ArraysUtilities.contains(result, each)) {
                result = ArraysUtilities.addElement(result, each);
            }
        }
        return result;

    }

    //48. removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String [] array) {

        String[] result = {}; // an array for the temporarily value

        for (String each : array) {
            if (!ArraysUtilities.contains(result, each)) {
                result = ArraysUtilities.addElement(result, each);
            }
        }
        return result;

    }

    //49. swaps the element at index i with the element at index j, and returns the new array
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

    //50. swaps the element at index i with the element at index j, and returns the new array
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

    //51. swaps the element at index i with the element at index j, and returns the new array
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

    //52. swaps the element at index i with the element at index j, and returns the new array
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
