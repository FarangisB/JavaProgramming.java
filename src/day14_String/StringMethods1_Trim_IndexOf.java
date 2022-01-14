package day14_String;

public class StringMethods1_Trim_IndexOf {

    public static void main(String[] args) {

        //*** trim method ==> removes any unnecessary spaces from the String

        String str1 = "     batch 25     ";
        str1.trim();                // in order to remove white spaces, you have to use trim method
                                    // but as String is immutable, you can't do it directly
        System.out.println(str1);
                                    // the only way is to create another variable
        str1=str1.trim();
        System.out.println(str1);

        System.out.println("____________________________________________________________");

        // *** indexOf() method ==> returns the index number of first occurred character. Returns int

        String str2 = "Cydeo School";

        int n1 = str2.indexOf("h"); // we cane use here string or char
        System.out.println("n1 = "+n1);

        int n2 = str2.indexOf("oo"); // make the character unique by adding another character in order to find the index
        System.out.println("n2 = "+n2);

        String str3 = "Java Programming language";

        int n3 = str3.indexOf("a"); // as it's the first a from the left side, you don't need to make it unique
        System.out.println("n3 = "+n3);

        int n4 = str3.indexOf("a "); // but if you want to find the index of the second a, you have to make it unique
        System.out.println("n4 = "+n4);

        // if you want to find index number of a char near to the right sight, then you can
        // *** use lastIndexOf() method ==> returns the index number of last occurred character. returns int

        int n5 = str3.lastIndexOf("g");
        System.out.println("n5 = "+n5);

        System.out.println("_______________________________________________________");

        // example for indexOf and lastIndexOf methods

        String s = "Java Nova Cava Wawa orange";
        
        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
        // int fourthA = s.indexOf("ava W");
        // or we can use lastIndexOf method
        // int fourthA = s.lastIndexOf("av");
        // also there is 3rd way to find fourthA index number
        int fourthA = s.indexOf("Ca")+1;
        // int fifthA = s.lastIndexOf("a W");
        // or we can use another way
        int fifthA = s.lastIndexOf("va")+1;
        int sixthA = s.lastIndexOf("aw");
        int seventhA = s.lastIndexOf("a ");
        int eighthA = s.lastIndexOf("a");



        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);
        System.out.println("eighthA = " + eighthA);





    }
}
