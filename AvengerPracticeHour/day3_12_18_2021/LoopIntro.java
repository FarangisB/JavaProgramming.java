package day3_12_18_2021;

public class LoopIntro {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("_________________________");

        // even numbers
        System.out.print(0);
        for (int i = 2; i <100 ; i+=2) {
            System.out.print(" "+i);
        }
        System.out.println();
        System.out.println("_________________________");

        // odd numbers
        System.out.print(1);
        for (int i = 3; i <100 ; i+=2) {
            System.out.print(" "+i);
        }
        System.out.println();
        System.out.println("_________________________");

        // divided by numbers with 5 from 100
        System.out.print(1);
        for (int i = 0; i <100 ; i+=5) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("_________________________");

        // even numbers from 100 to 0

        for (int i = 100; i >=0 ; i-=2) {
            System.out.print(i+" ");
        }


    }

}
/*
                 Classic for-loop counting up from 0 to 99
                 0, 1, 2, 3, ... 99
                -init int i = 0
                -test i<100
                -increment i++
                */

