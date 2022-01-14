package day25_CustomMethods_Overloading;

public class MethodOverloading {

    public static void main(String[] args) {

    int [] intArray = {5,6,0,-1,3,4};

    double [] doubleArray = {10.5, 11.5, 5.5, 4.5};

    char [] charArray = {'E', 'F', 'B', 'D', 'C', 'A'};
    // if you want to sort all these arrays, you need to call only one method = sort

        System.out.println("______________________________");

        //sum of 10 and 20
        int sum1 = sumOfNumbers(10,20);

        // sum of 10, 20, 30
        int sum2 = sumOfNumbers(10, 20, 30);

        // sum of 10, 20, 30, 40
        int sum3 = sumOfNumbers(10, 20, 30, 40);

        // sum of 18.2 and 30.7
        double num4 = sumOfNumbers(18.2, 30.7);


    }

    public static int sumOfNumbers (int num1, int num2){
        return num1+num2;
    }
    public static double sumOfNumbers (double num1, double num2){
        return num1+num2;
    }

    public static int sumOfNumbers (int num1, int num2, int num3){
        return num1+num2+num3;
    }
    public static double sumOfNumbers(double num1, double num2, double num3){
        return sumOfNumbers(num1, num2) + num3;
    }

    public static int sumOfNumbers(int num1, int num2, int num3, int num4){
        return sumOfNumbers(num1, num2, num3) + num4;
    }

    public static double sumOfNumbers(double num1, double num2, double num3, double num4){
        return sumOfNumbers(num1, num2, num3) + num4;
    }



}
