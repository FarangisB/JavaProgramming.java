package practice_12_08_2021;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

    /*    Scanner scan = new Scanner(System.in);
        System.out.println("How many Fibonacci number do you want to see?");
        int num = scan.nextInt();

     */
        int num = 8;
        int num0=0;
        int num1=1;
        int result=0;

        for (int i = 2; i <= num ; i++) {
            result = num0+num1;

            num0=num1;
            num1=result;
        }
        System.out.println(result);


        /*int num3 = 7;

        int [] fibo = new int [num3];
        fibo[0]=0;
        fibo[1]=1;

        for (int i = 2; i < num3; i++) {
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
        System.out.println(Arrays.toString(fibo));

         */



    }
}
