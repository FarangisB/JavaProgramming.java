package day07_Operators;

public class ShorthandOperators_RemainderAssignment {

    public static void main(String[] args) {

        double num3 = 100;

        // %= remainder operator

        num3 %= 3;

        System.out.println("num3 = " + num3);

        System.out.println("____________________________");


        int amount = 127; // cents

        int dollars = amount/100;
        int quarters = amount/25;
        int cents = amount%25;

        System.out.println("Dollars = " + dollars);
        System.out.println("Quarters = " + quarters);
        System.out.println("Cents = " + cents);

        int cents2 = 127;
        cents2 %= 25;

        System.out.println("Cents = " + cents2);

        System.out.println("___________________________");

        int y = 300;

        y %= 16;

        System.out.println("y = " + y); // 300/16= 18.75 ; 300-(16*18)=300-288=   12 - remainder

        System.out.println("_______________________________________");

        double Balance = 3500;

        // insurance = 134$

        Balance %= 134;

        System.out.println("Balance = " + Balance);







    }




}
