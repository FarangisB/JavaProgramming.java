package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1 = +25;
        int num2 = -25;
        System.out.println(num1<0);  //false
        System.out.println(num2<0);  //true

        int b = 100;

        System.out.println(++b); // pre increment // increases the value by 1 right away // 101

        int c = 100;

        System.out.println(c++); // post increment: first passes the current value, then increases // 100
        System.out.println(c); // 101

        System.out.println("________________________________________________");

        int x = 200;

        System.out.println(--x); // pre decrement: decreases the value by 1 right away // 199

        int y = 200;

        System.out.println(y--); // post decrement: first passes the current value, then in second post decreases the value by 1
                                // 200
        System.out.println(y); // 199





    }




}
