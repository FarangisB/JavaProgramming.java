package day15_StringMethodsAndLoop;

public class EqualsIgnoreCase {

    public static void main(String[] args) {



    // equalsIgnoreCase() will compare objects ignoring upper or lower cases

    String s1 = "CYDEO";
    String s2 = "cydeo"; // if we compare them by equals method, it gives us false result

        System.out.println(s1.equals(s2));

        // but with using equalsIgnoreCase method, result will be true
        System.out.println(s1.equalsIgnoreCase(s2));

        // ex: if the user enters YES, yEs, yES, YEs, Yes

        System.out.println("yEs".equalsIgnoreCase("Yes"));



}

}
