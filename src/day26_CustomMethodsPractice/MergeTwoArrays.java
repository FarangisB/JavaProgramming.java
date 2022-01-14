package day26_CustomMethodsPractice;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4};
        int [] arr2 = {5,6,7,8};
        int [] mergeTwo = merge(arr1, arr2);
        System.out.println(Arrays.toString(mergeTwo));



    }

    public static int [] merge (int [] arr1, int [] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;

        for (int each : arr1) {
            arr3[i++] = each;
        }
        for (int each : arr2) {
            arr3[i++] = each;
        }

        return arr3;

    }

}
