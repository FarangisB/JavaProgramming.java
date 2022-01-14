package day1_12_04_2021;

public class Last2Chars {

    public static void main(String[] args) {

        // fint 2 last chars and put them 3 times

        String str = "CYDEO";
        int lastIndexOfChar = str.length()-1;
        int beforeLastIndexOfChar = str.length()-2;

        String sub = str.substring(beforeLastIndexOfChar);

        System.out.println(sub.repeat(3));

        System.out.println("_________________________");


        String last2Chars = ""+str.charAt(beforeLastIndexOfChar)+str.charAt(lastIndexOfChar);

        System.out.println(last2Chars.repeat(3));




    }
}
