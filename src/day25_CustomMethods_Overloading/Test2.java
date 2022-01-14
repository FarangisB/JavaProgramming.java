package day25_CustomMethods_Overloading;

import utilities.ArraysUtilities;

public class Test2 {

    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4,5};

        ArraysUtilities.printEachElement(arr1);

        System.out.println("_____________________");

        double [] arr2 = {1.5, 2.5, 3.5, 4.5, 5.5};

        ArraysUtilities.printEachElement(arr2);

        System.out.println("_____________________");

        char [] arr3 = {'A', 'B', 'C', 'D', 'E'};

        ArraysUtilities.printEachElement(arr3);

        System.out.println("_____________________");

        String [] arr4 = {"I", "Love", "Java", "Language", "Programming"};

        ArraysUtilities.printEachElement(arr4);

        System.out.println("_____________________");

        int [] n1 = {1,2,3,4,5,62,3,5};
        int max1 = ArraysUtilities.maxElement(n1);
        System.out.println(max1);

        System.out.println("____________________");

        double [] n2 = {1.3, 2.3, 4.5, 6.2, 3.5};
        double max2 = ArraysUtilities.maxElement(n2);
        System.out.println(max2);

        System.out.println("____________________");

        char [] chars = {'a', 'b', 'c'};
        boolean ch1 = ArraysUtilities.contains(chars, 'b');
        System.out.println("ch1 = " + ch1);

    }


}
