package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "123";

        int num = Integer.parseInt(str); // int

        System.out.println(num+1);  // 124
        System.out.println(str+1);  // 1231

        String str2 = "10.5";

        double num2 = Double.parseDouble(str2);

        System.out.println(num2+1);  // 11.5

        int max = Integer.MAX_VALUE; // finds max integer value
        int min = Integer.MIN_VALUE; // finds min integer value

        System.out.println(max);  // 2147483647
        System.out.println(min);  // -2147483648

        long max2 = Long.MAX_VALUE; // finds max long value
        long min2 = Long.MIN_VALUE; // finds min long value

        System.out.println(max2);  // 9223372036854775807
        System.out.println(min2);  // -9223372036854775808

        String s1 = "true";

        boolean r1 = Boolean.parseBoolean(s1);  // even the String can be converted to the boolean

        System.out.println(r1);  // true

        System.out.println("_______________________");

        String s2 = "123";
        Integer x = Integer.valueOf(s2);  // Integer
        int y = Integer.valueOf(s2);      // Integer

        System.out.println(x);  // 123
        System.out.println(y);  // 123

        String s3 = "1.5";
        Double d = Double.valueOf(s3);
        double c = Double.valueOf(s3);

        System.out.println(d);  // 1.5
        System.out.println(c);  // 1.5

        System.out.println("___________________");


        char ch1 = 'A';

        // isDigit
        boolean r2 = Character.isDigit(ch1);  //  false
        System.out.println(r2);

        System.out.println();

        // isLetter
        boolean r3 = Character.isLetter(ch1);   // true
        System.out.println(r3);

        System.out.println();

        // is special Char
        boolean r4 =!Character.isLetterOrDigit(ch1);  // false
        System.out.println(r4);

        System.out.println("________________");

        // upperCase
        boolean r5 = Character.isUpperCase(ch1);
        System.out.println(r5);

        System.out.println("__________________");

        // lowerCase
        boolean r6 = Character.isLowerCase(ch1);
        System.out.println(r6);

        System.out.println("__________________");

        String s = "ab1cde2efg3hi4";
        
        int sum = 0;

        for (char each : s.toCharArray()) {
            if (Character.isDigit(each)) {
                sum += Integer.parseInt("" + each);
            }
        }
        System.out.println(sum);  // sum is ==> 10







    }
}
