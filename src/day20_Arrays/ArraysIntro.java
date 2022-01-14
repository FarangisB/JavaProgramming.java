package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        // create a variable that's capable enough to contain 5 names

        String[] myGroup = new String[5]; // 0~4 index
        myGroup[0]="Michel";
        myGroup[1]="John";
        myGroup[2]="Rose"; // if number repeated, only
        myGroup[2]="Farangis";
        myGroup[3]="Muhtar";
        myGroup[4]="Farzod";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("________________________________");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        // index:           0          1          2             3          4         5           6
        // days[7]= "JavaDay" --> you can not add more indexes, bc Array is fixed
        // what is inside the Array, only that indexes will appear

        System.out.println(Arrays.toString(days));

        int number = 1;
        if(number <1 || number > 7){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println( days[number-1] );





    }
}
