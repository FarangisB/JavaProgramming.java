package day04_Variables;

public class KgToPounds {

    public static void main(String[] args) {

        /*
        Create a class named KgToPounds, write a program that can
        convert kg (int) to pounds (double)
                    Hints: 1 kg = 2.2 pounds
         */

        int kg = 16;
        double lb = 2.2;

        double totalLb = kg * lb;

        System.out.println("kg = " + kg);
        System.out.println("pounds = " + lb);
        System.out.println("totalPounds = " + totalLb);



    }

}
