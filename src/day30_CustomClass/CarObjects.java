package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.carInfo("Mercedes", "Benz", "White", 1998, 60_000);

        System.out.println(car1);
        car1.start();

        Car car2 = new Car();
        car2.carInfo("Toyota", "Corola", "Grey", 2008, 40_000.35);

        System.out.println(car2);
        car2.drive();

        Car car3 = new Car();
        car3.carInfo("BMW", "V25", "White", 2005, 100_000.01);

        System.out.println(car3);

        // how to store all the car info
        // Car[] cars = {car1, car2, car3}; -> we can create an Array, but it's better to create ArrayList bc in ArrayList we can add and remove objects

        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1, car2, car3));

        // to find cars prices we need to iterate carsList
        // to iterate carsList we need for each Loop

        for (Car each : carsList) {
            System.out.println(each.brand+" : "+each.price);
        }


        System.out.println("_____________________________________");

        /*
        BMW: 2005~2008
        Toyota: 1995~1997
        eligible for recall
         */

        carsList.removeIf( p -> p.brand.equals("BMW")&& p.year>=2005&& p.year<=2008);
        carsList.removeIf( p-> p.brand.equals("Toyota")&& p.year>=1995&& p.year<=1997);

        System.out.println(carsList);


    }
}
