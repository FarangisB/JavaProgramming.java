package day46_Polimorphism;

import day43_Abstraction_ExceptionsRecap.CarTask.BMW;
import day43_Abstraction_ExceptionsRecap.CarTask.Car;
import day43_Abstraction_ExceptionsRecap.CarTask.Tesla;
import day43_Abstraction_ExceptionsRecap.CarTask.Toyota;

import java.util.ArrayList;
import java.util.Arrays;

public class Cars {

    public static void main(String[] args) {

        Car[] cars = {

                new BMW("X5", 2014, 32000, "Red", 12000),
                new BMW("M3", 2015, 33000, "Blue", 14030),
                new BMW("M5", 2017, 35000, "Black", 15000),
                new BMW("M4", 2018, 40000, "White", 19000),
                new BMW("7 Series", 2009, 30000, "Purple", 21000),
                new BMW("i3", 2011, 30000, "Black", 9000),
                new Toyota("Corolla", 2011, 20000, "White", 310000),
                new Toyota("Highlander", 2010, 25000, "White", 255000),
                new Toyota("Camry", 2018, 30000, "Red", 185000),
                new Toyota("Rav4", 2012, 23000, "Red", 285000),
                new Toyota("Avalon", 2019, 35000, "Blue", 175230),
                new Tesla("Model 3", 2015, 45000, "White", 235000),
                new Tesla("Model Y", 2017, 65000, "Black", 135000),
                new Tesla("Model X", 2016, 48000, "White", 235000),
                new Tesla("Model X", 2014, 48000, "White", 236000),
        };

        int highestMileage = cars[0].getMiles();
        int lowestMileage = cars[0].getMiles();
        String highestMileageCarName="";
        String lowestMileageCarName="";

        System.out.println("\nThese cars are eligible for recall:\n");

        for (Car each : cars) {
            if(each instanceof Toyota){
                if(each.getYear()==2010||each.getYear()==2011){
                    System.out.println(each.getBrand()+" "+each.getModel()+" "+each.getYear());
                }
            }
            if(each instanceof BMW){
                if(each.getYear()>=1929&&each.getYear()<=2022){
                    System.out.println(each.getBrand()+" "+each.getModel()+" "+each.getYear());
                }
            }
            if(each instanceof Tesla){
                if(each.getYear()==2015||each.getYear()==2016){
                    System.out.println(each.getBrand()+" "+each.getModel()+" "+each.getYear());
                }
            }

            if(each.getMiles()>highestMileage){
                highestMileage=each.getMiles();
                highestMileageCarName=each.getBrand()+" "+each.getModel();
            }

            if(each.getMiles()<lowestMileage){
                lowestMileage=each.getMiles();
                lowestMileageCarName= each.getBrand()+" "+each.getModel();
            }
        }

        System.out.println("\n---------------------------------------------------------------------\n");
        System.out.println("Car with the highest mileage: "+highestMileageCarName+" = " +highestMileage);
        System.out.println("Car with the lowest mileage: "+lowestMileageCarName+" = "+lowestMileage);






    }
}
