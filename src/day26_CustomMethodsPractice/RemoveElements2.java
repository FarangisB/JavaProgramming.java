package day26_CustomMethodsPractice;

import utilities.ArraysUtilities;

import java.util.Arrays;

public class RemoveElements2 {

    public static void main(String[] args) {

        int [] numbers = {100, 200, 300, 400, 500, 600};
        numbers= removeElement(numbers, 2);

        System.out.println(Arrays.toString(numbers));


    }

    public static int [] removeElement (int [] array, int index){

        if (index<0||index> array.length-1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }

        int [] result ={};

        for (int i = 0; i < array.length; i++) {
            if (1!=index){
                result=ArraysUtilities.addElement(result, array[i]);
            }
        }

        return result;
    }


}
