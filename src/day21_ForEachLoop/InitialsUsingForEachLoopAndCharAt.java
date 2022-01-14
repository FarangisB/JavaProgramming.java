package day21_ForEachLoop;

import day13_StringClass.StringIntro;

public class InitialsUsingForEachLoopAndCharAt {

    public static void main(String[] args) {

        String[] name = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Sinem Kaya", "Begench Begenjov"};

        for (String each : name){
            String initial = each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);
            System.out.println(initial);
        }





    }
}
