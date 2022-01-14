package practice_12_01_2021;

public class CastingExp {

    public static void main(String[] args) {

        // double > float > long > int > short > byte

        double num = 12;
        int num2 = (int)num; // from the bigger to the smaller we have to cast explicitly

        short num3 = 34;
        int num4 = num3;  // from the smaller to the bigger it will cast automatically



    }
}
