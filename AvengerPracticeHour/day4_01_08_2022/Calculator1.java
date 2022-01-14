package day4_01_08_2022;

public class Calculator1 {

    public static void main(String[] args) {

    int result =    add(4, 2);
    int result2 = subtract(4,2);
    int result3 = multiply(4,2);
    int result4 = divide(4,2);

    }

    private static int divide(int i, int i1) {
        return i/i1;
    }

    private static int multiply(int i, int i1) {
        return i*i1;
    }

    private static int add(int i, int i1) {
        return i+i1;
    }

    private static int subtract(int i, int i1) {
        return i-i1;
    }






 /*   System.out.println(add(4, 2));
        System.out.println(subtract(4, 2));
        System.out.println(multiply(4, 2));
        System.out.println(divide(4, 2));

  */
}
