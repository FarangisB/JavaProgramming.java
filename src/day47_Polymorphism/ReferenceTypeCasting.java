package day47_Polymorphism;

import day43_Abstraction_ExceptionsRecap.PersonTask.*;
import day44_Abstraction.AnimalTask.Animal;
import day44_Abstraction.AnimalTask.Cat;
import day44_Abstraction.AnimalTask.Dog;
import day45_Interface.ShapeTask.Circle;
import day45_Interface.ShapeTask.Cube;
import day45_Interface.ShapeTask.Shape;
import day45_Interface.ShapeTask.Square;

public class ReferenceTypeCasting {

    public static void main(String[] args) {

        Shape shape = new Circle(4); // casting from the parent class to child class called Upcasting
                                           // it's done implicitly, so if you don't do any castings, it's done by compiler

        // Ex WebDriver driver = (ChromeDriver) new ChromeDriver --> it's not necessary to give a casting in upcasting

        // Downcasting is

        Shape shape1 = new Square(5);
        System.out.println( ((Square) shape1).getSide());

        System.out.println("------------------------------------------------");

        Animal animal2 = new Cat("Jim", "Scotish", 'M', 3, "Small", "White");

        //Cat cat = (Cat) animal2;
        //cat.meows();

        ( (Cat) animal2).meows();

        try{
            ( (Dog) animal2 ).bark(); // animal2 does not have bark method and cat also does not have bark method
        }catch(ClassCastException e){
            e.printStackTrace();
        }

        // so it gives ClassCastException

        System.out.println("-------------------------------------------------");

        Employee employee = new Tester("Ali", 30, 'M', 42, "Tester", 150000);

        ((Tester) employee).bugReport();

        //((Tester) employee).unitTest();

        try{
            ((Developer) employee).unitTest();
        }catch (ClassCastException e){
            e.printStackTrace();
        }

        //Driver driver = (Driver) employee;
        Person person = (Person) employee;
        //Teacher teacher = (Teacher) employee;

        Shape sh1 = new Circle(5);

        ( (Cube) sh1 ).volume(); // it gives ClassCastException because sh1 is Circle object and circle doesn't have volume feature






    }
}
