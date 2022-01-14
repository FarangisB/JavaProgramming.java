package day3_12_18_2021;

import java.util.Arrays;

public class SwapTwoNumbersWithoutThirdVariable {

    public static void main(String[] args) {


        int a = 10;
        int b = 15;

       /* a=a+b;//25
        b=a-b;//25-15=10
        a=a-b;//25-10=15

        */

        a=a*b; // 150
        b=a/b; // 150/15=10
        a=a/b; // 150/10=15

        System.out.println(a);
        System.out.println(b);

    }



}
