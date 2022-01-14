package day1_12_04_2021;

public class CastingPractices {

    public static void main(String[] args) {

        // byte to short

        byte b = 10;
        short c = b; // implicit casting

        // double to int

        double d = 5.3;
        int i = (int) d;

        // long to int

        long l = 9999999999l; // as long as data in long is integer but not long, you can put without adding L or l
        int k = (int)l;

        System.out.println("k = " + k); // number will be different

        float f = 12.12f; // if float contains integer there is no need to add f, but if it's decimal, than we have to add f
        float g = (float)12.12;
        double h = 12.12;  // there are 3 ways to show float data correctly


    }


}
