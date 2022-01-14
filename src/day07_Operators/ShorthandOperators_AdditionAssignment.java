package day07_Operators;

public class ShorthandOperators_AdditionAssignment {
    public static void main(String[] args) {

        int x = 100;

        System.out.println("x = " + x); // 100
        System.out.println(x + 200); // 300

        // x = x+200;

        x+=200;

        System.out.println("x = " + x); //300

        String str = "Wooden";

        str += " Spoon"; // Wooden Spoon

        System.out.println("str = " + str);

        double num1 = 2.5;

        System.out.println("num1 = " + num1); // 2.5

        num1 += 5.5;

        System.out.println("num1 = " + num1); // 8.0

        double availableBalance = 1000.50;

        // deposit 300$

        availableBalance += 300; // availableBalance reassigned with additional amount

        System.out.println("availableBalance = " + availableBalance);









    }





}
