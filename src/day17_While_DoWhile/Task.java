package day17_While_DoWhile;

public class Task {

    public static void main(String[] args) {
        // print all even numbers from 1~10 (skip odd numbers)
        for (int i = 1; i <= 10; i++) {
            if (i%2!=0){
                continue;

            }
            System.out.print(i+" ");
        }
        System.out.println();

        // print all odd numbers from 1~10 (skip even numbers)

        for (int i = 1; i <= 10; i++) {
            if (i%2==0){
                continue;

            }
            System.out.print(i+" ");
        }
    }
}
