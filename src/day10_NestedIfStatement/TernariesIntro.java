package day10_NestedIfStatement;

public class TernariesIntro {

    public static void main(String[] args) {

        // ternaries - shortcuts for if-statements
        int n = 100;
        //we have to check whether the number is even or odd

        if (n%2==0){
            System.out.println("Even"); //String
        }else{
            System.out.println("Odd"); // String
        }


        System.out.println("___________________________________");

        // (n%2==0)? "Even":"Odd" ---> in order to make our condition reusible, it should be changed to a viriable

        String result = (n%2==0)? "Even":"Odd";
        System.out.println(result);

        System.out.println("_____________________________");

        int age = 23;


        /*
        if (age >=21){
            System.out.println("Eligible"); // String

        }else {
            System.out.println("Not Eligible"); // String
        }
        */

        // System.out.println((age>=21) ? "Eligible" : "Not eligible");

        String result2 = (age>=21) ? "Eligible" : "Not eligible";
        System.out.println(result2);

        System.out.println("________________________________________________");

        int number = 100; // to find the number is negative, positive or zero

        /* if (number>0){
            System.out.println("Positive");
        }else if (number<0){
            System.out.println("Negative");               ------> that's how we did usually, but if you want to do shorter
        }else {
            System.out.println("Zero");
        }
        */

        // (number>0)? "Positive" : (number<0) "Negative" : "Zero"  ---> This how we shorten the if else conditions

        String result3 = (number>0)? "Positive" : (number<0)? "Negative" : "Zero";
        System.out.println(result3);





    }



}
