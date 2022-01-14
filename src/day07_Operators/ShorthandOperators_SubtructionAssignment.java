package day07_Operators;

public class ShorthandOperators_SubtructionAssignment {

    public static void main(String[] args) {

        // withdrawing 500$

        double availableBalance = 500;

        System.out.println("AvailableBalance = " + availableBalance); // 500

        availableBalance -= 500;

        System.out.println("AvailableBalance = " + availableBalance); // withdraws the value //0.0

        // depositing 400$ then withdrawing 200$

        availableBalance += 400; // availableBalance = 400
        availableBalance -= 200; // availableBalance = 200

        System.out.println("AvalableBalance = " + availableBalance); // 200







    }




}
