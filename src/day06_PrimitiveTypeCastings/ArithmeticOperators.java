package day06_PrimitiveTypeCastings;

import java.sql.SQLOutput;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println("12" + 1); //121 - concatenation

        System.out.println(10+20); // 30 - Addition
        System.out.println(100-50); // 50 - Subtraction
        System.out.println(10*6); // 60 - Multiplication


        System.out.println(100/3); // 33 - because numeral and     are integers
        System.out.println(10.0/4); // 2.5 - in order to make the result double type, put point and add 0


        int a = 100;
        double b = a/6; // 16.0
        System.out.println(b);

        double c = a/6.0; // 16.6666  1 way
        double d = a/6d;  // 16.6666  2 way
        double e = (double)a/6; // 16.6666  3 way
        }



    }


/*
        + : Addition
        - : Subtruction
        * : Multiplication
        / : Division

                integer / integer ====> integer result
                decimal / integer ====> decimal
                integer / decimal ====> decimal
                decimal / decimal ====> decimal

                in math:
                10 / 4 = 2.5
                100 / 3 = 33.333

                in Java:
                10 / 4 = 2
                100 / 3 = 33
        % : Remainder

 */