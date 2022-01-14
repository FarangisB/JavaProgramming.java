package day3_12_18_2021;

public class ThreeDigitsWithNestedLoop {

    public static void main(String[] args) {


        for (int i = 1; i <=9; i++) {
            for (int j = 0; j <=9 ; j++) {
                for (int k = 0; k <=9; k++) {
                    int ab = 100*i+10*j+k;
                    System.out.print(ab+" ");
                }

            }
        }


    }
}
/*
                writing three-digits numbers with nested loops
                hint:
                ABC=100A+10B+C
                */