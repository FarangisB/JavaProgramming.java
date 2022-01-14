package day15_StringMethodsAndLoop;

public class ForLoopPractice {

    public static void main(String[] args) {

        // display numbers from 15 to 45 in the same line, with space

        System.out.print(15);
        System.out.print(16);
        System.out.print(17);
        System.out.print(18); // it is the longest way to accomplish this task

        System.out.println();

        for (int i=15; i<=45; i++){
            System.out.print(i+" ");
        }

        System.out.println("__________________________________");

        // 100, 99, 98, ... 50
        for (int i = 100; i>=50; i--){
            System.out.print(i +", ");

        }

        System.out.println("______________________________________");

        // print all the even numbers between 1~55

        for (int i = 1; i<=55; i++){
            // we can open a condition inside the loop
            if (i%2==0){
                System.out.print(i+" ");
            }
        }

        System.out.println();

        System.out.println("__________________________");

        // print all the even numbers between 1~55
        // another way to find even numbers is to increase the number by 2

        for (int i = 2; i <=55; i += 2){
            System.out.print(i+" ");
        }


    }


}
