package day4_01_08_2022;

public class Calculator {

    public static void main(String[] args) {

        System.out.println(add(4, 2));
        System.out.println(subtract(4, 2));
        System.out.println(multiply(4, 2));
        System.out.println(divide(4, 2));


    }

    // implementation of add method
    public static int add(int a, int b){
        return a+b;
    }

    // implementation of subtract method
    public static int subtract(int a, int b){
        return a-b;
    }

    // implementation of multiplication method
    public static int multiply(int a, int b){
        return a*b;
    }

    // implementation of division method
    public static int divide(int a, int b){
        return a/b;
    }


}
/**
 *
 - Implementation of add, subtract, multiply and divide methods in Calculator class
 - add(4,2) return 6
 - subtract(4,2) return 2
 - multiply(4,2) return 8
 - divide(4,2) return 2
 */
