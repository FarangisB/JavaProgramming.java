package practice_12_15_2021;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayIntro {

    public static void main(String[] args) {

        String [] color = {"Yellow", "Blue", "Purple"};

        // finding size of array
        System.out.println("String length: "+color.length);

        System.out.println("_____________________");

        String [] color2 = new String[3];
        color2[0]="Red";
        color2[1]="Orange";
        color2[2]="Green";

        System.out.println(Arrays.toString(color));

        System.out.println(color[1]);

        System.out.println("_____________________");
        System.out.println(Arrays.toString(color2));

        System.out.println(color2[1]);

        System.out.println("_____________________");

        // finding equals

        int []num =new int [4];
        num[0]=42;
        num[1]=35;
        num[2]=12;
        num[3]=9;
        System.out.println(Arrays.toString(num));

        int [] num1 ={1,2,3,4};
        System.out.println(Arrays.toString(num1));

        System.out.println("Arrays.equals(num, num1) "+Arrays.equals(num, num1));

        System.out.println("________________________");

        // sort

        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        System.out.println("_________________________");




    }
}
