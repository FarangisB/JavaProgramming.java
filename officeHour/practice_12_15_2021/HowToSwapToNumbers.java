package practice_12_15_2021;

public class HowToSwapToNumbers {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        // a=15, b =10
        // a=b, b=a  == >> a=15, b=15, because a is already 15

        int temp = a; // temp is saving the first number of a
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);




    }
}
