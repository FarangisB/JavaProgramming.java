package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

        // >, >=, <, <=

        boolean result1 = 20>40; // false
        System.out.println(result1);

        // if the first number is 200

        result1 = 200>40; // true // greater than
        System.out.println("result1 = " + result1);

        System.out.println("____________________________________________");

        boolean result2 = 300>= 150; // true // greater than or equal
        System.out.println("result2 = " + result2);

        boolean result3 = 100>= 100; // true
        System.out.println("result3 = " + result3);

        boolean result4 = 300>= 500; // false
        System.out.println("result4 = " + result4);

        // credit score of 720

        int creditScore = 745;
        boolean isEligibleForLoan = creditScore>= 720;
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        System.out.println("___________________________________________");

        boolean result5 = 100<200; // true // Less than operator
        System.out.println("result5 = " + result5);

        boolean result6 = 200<180; // false
        System.out.println("result6 = " + result6);

        System.out.println("___________________________________________");

        int score = 59;
        boolean hasFailed = score<=59; // true // Less than or equal
        //                 59<=59
        System.out.println("hasFailed = " + hasFailed); // true

        //if the score is 75
        score = 75;
        hasFailed = score<=59;
        System.out.println("hasFailed = " + hasFailed); // false

        boolean result7 = 45<=60;
        System.out.println("result7 = " + result7);

        System.out.println("______________________________________");

        int num1 = 100;
        boolean result = num1<100;
        System.out.println("result = " + result); // false // we can't use < or > for = results

        System.out.println("__________________________");

        int x = 100;
        int y = 200;

        boolean equal = x==y; // equal operator (==)
        //              100==200 - false

        System.out.println("equal = " + equal);

        boolean result8 = "Muhtar" == "Good Guy"; //false
        System.out.println("result8 = " + result8);

        boolean result9 = 'A' == 'a'; // false
        System.out.println("result9 = " + result9);

        boolean result10 = "Java    " == "    Java    "; // false
        System.out.println("result10 = " + result10);

        boolean result11 = "Java" == "Java"; // true // only when 2 values are the same type and the same value
        System.out.println("result11 = " + result11);

        System.out.println("_____________________________________");

        // != not equal operator

        boolean result12 = 100 != 200; // true
        System.out.println("result12 = " + result12);

        boolean result13 = 300 != 300; // false
        System.out.println("result13 = " + result13);











    }





}
