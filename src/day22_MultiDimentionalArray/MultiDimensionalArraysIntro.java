package day22_MultiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArraysIntro {

    public static void main(String[] args) {

        // in order to have multidimensional array you have to have at least 2 single dimensional arra

        // exp:
                String[] group1 = {"John", "Joes", "James"};
                String[] group2 = {"John", "Joes", "James"};
                String[] group3 = {"John", "Joes", "James"};


        String [][] groups = new String[3][];
        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;

        //System.out.println(Arrays.toString(groups)); result is --> [[Ljava.lang.String;@27f674d, [Ljava.lang.String;@1d251891, [Ljava.lang.String;@48140564]
        //                                              because toString is for single dimensional array

        System.out.println(Arrays.deepToString(groups));
        // result --> [[John, Joes, James], [John, Joes, James], [John, Joes, James]]
        // for multidimensional array we use deepToString method

        System.out.println("___________________________");

        // if you know what arrays are, then you can put all of them together by using {}

  // index of elements:    0 1 2    0 1 2 3    0 1 2     0   1  2
        int [][] arr2D = {{1,2,3}, {4,5,6,7}, {8,9,10}, {11,12,13}};
        // index of arrays:  0           1         2         3

        System.out.println(Arrays.deepToString(arr2D));
        // result--> [[1, 2, 3], [4, 5, 6, 7], [8, 9, 10], [11, 12, 13]]

        // {4,5,6,7}
        System.out.println(Arrays.toString(arr2D[1]));
        // result --> [4, 5, 6, 7]

        // 11 - element

        System.out.println(arr2D[3][0]); // here we found an element, so it's not multidimensional array none single dimensional array
        // so we don't need toString methods







    }
}
