package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        // age: 38 years old
        byte age = 38;

        // weight: 160 pounds
        // byte weight = 160; // 160 is out of byte` range
        // byte num =-129; // -129 is out of byte` range
        short weight = 160; // 160 is within short range

        // salary: 100 000$
        // short salary = 100 000; // 100 000 is out of short` range
        int salary = 100_000; // int is the preferred data type for integer

        long asset = 3_333_333_333L;

        // tax: 0.26 // float and double are used for decimals.
        float tax = 0.26F; // if you use float, put F or f after number

        double PI = 3.14; // if you use double, you don`t need to add anything
                          //double is preferred data type for decimals

        //#
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 35000;
        System.out.println("ch3 = " + ch3);

        // char ch5 = 'AB'; - we can't put 2 or more characters using char

        boolean isEmployeed = true;
        boolean isMarried = false;

        boolean result = 100 > 300;

        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

        // string is used for more than 1 character, ""

        String name = "Wooden Spoon";
        String city = "Brooklyn";

    }


}
