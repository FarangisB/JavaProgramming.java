package day09_IfAndElseAndMultiBranch;

public class PositiveNegativeZero {

    public static void main(String[] args) {

        int n = 1000;

        boolean positive = n>0,
                negative = n<0;

        if(n>0){ // we used positive expression
            System.out.println(n + " is a positive number");

        }else if (n<0){ // we used negative expression
            System.out.println(n + " is a negative number");

        }else{
            System.out.println(n + " is Zero");
        }



    }



}
