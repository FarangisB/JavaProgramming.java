package day04_Variables;

public class GallonsToLitters {

    public static void main(String[] args) {

        /*
        Create a class named GallonsToLitters, Write a program
        that can convert gallon (int) to litter (double)
                    Hints: 1 gallon = 3.79 litters
         */

        int gallon = 15;
        double litter = 3.76;
        double TotalLitters = gallon * litter;

        System.out.println("gallon = " + gallon);
        System.out.println("litter = " + litter);
        System.out.println("TotalLitters = " + TotalLitters);


    }

}
