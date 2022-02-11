package day46_Polimorphism;

import day43_Abstraction_ExceptionsRecap.CarTask.BMW;
import day43_Abstraction_ExceptionsRecap.CarTask.Car;
import day43_Abstraction_ExceptionsRecap.CarTask.Tesla;
import day43_Abstraction_ExceptionsRecap.CarTask.Toyota;

public class Test {

    public static void main(String[] args) {

                Car[] cars = {
                        new Toyota("Highlander", 2010, 25000, "White", 255000),
                        new BMW("X5", 2014, 32000, "Red", 12000),
                        new Toyota("Corolla", 2011, 20000, "White", 310000),
                        new BMW("M3", 2015, 33000, "Blue", 14030),
                        new BMW("M5", 2017, 35000, "Black", 15000),
                        new BMW("M4", 2018, 40000, "White", 19000),
                        new BMW("Series 7", 2009, 30000, "Purple", 21000),
                        new BMW("i3", 2011, 30000, "Black", 9000),
                        new Toyota("Camry", 2018, 30000, "Red", 185000),
                        new Toyota("Rav4", 2012, 23000, "Red", 285000),
                        new Toyota("Avalon", 2019, 35000, "Blue", 175230),
                        new Tesla("Model 3", 2015, 45000, "White", 235000),
                        new Tesla("Model Y", 2017, 65000, "Black", 135000),
                        new Tesla("Model X", 2016, 48000, "White", 235000),
                        new Tesla("Model X", 2014, 48000, "White", 236000),
                };

                System.out.println("Cars that are eligible for recall");
                System.out.println("------------------------------------------------");
                recall(cars, "Toyota", 2010, 2011);
                recall(cars, "BMW", 1929, 2022);
                recall(cars, "Tesla", 2015, 2016);
                System.out.println("------------------------------------------------");
                System.out.println("Car that has the lowest mileage");
                lowestMileage(cars);
                System.out.println("------------------------------------------------");
                System.out.println("Car that has the highest mileage");
                higestMileage(cars);


            }

            public static void recall(Car[] car, String made, int StartYear, int EndYear){

                if (made.equals("Toyota")){
                    for (Car each : car) {
                        if (each instanceof Toyota && (each.getYear()>=StartYear && each.getYear()<=EndYear) ){
                            System.out.println(each.getBrand()+" "+ each.getModel()+" "+ each.getYear());
                        }
                    }
                } else if (made.equals("BMW")){
                    for (Car each : car) {
                        if (each instanceof BMW && (each.getYear()>=StartYear && each.getYear()<=EndYear) ){
                            System.out.println(each.getBrand()+" "+ each.getModel()+" "+ each.getYear());
                        }
                    }
                } else if (made.equals("Tesla")){
                    for (Car each : car) {
                        if (each instanceof Tesla && (each.getYear()>=StartYear && each.getYear()<=EndYear) ){
                            System.out.println(each.getBrand()+" "+ each.getModel()+" "+ each.getYear());
                        }
                    }
                }
            }

            public static void lowestMileage(Car[] car){
                int minMileage=Integer.MAX_VALUE;

                for (Car each : car) {
                    if (each.getMiles()<minMileage){
                        minMileage=each.getMiles();
                    }
                }
                for (Car each : car) {
                    if(each.getMiles()==minMileage){
                        System.out.println(each.getBrand()+" "+each.getModel()+" : "+each.getMiles()+" miles");
                    }
                }

            }

            public static void higestMileage(Car[] car){
                int maxMileage=Integer.MIN_VALUE;

                for (Car each : car) {
                    if (each.getMiles()>maxMileage){
                        maxMileage=each.getMiles();
                    }
                }
                for (Car each : car) {
                    if(each.getMiles()==maxMileage){
                        System.out.println(each.getBrand()+" "+each.getModel()+" : "+each.getMiles()+" miles");
                    }
                }

            }
        }



