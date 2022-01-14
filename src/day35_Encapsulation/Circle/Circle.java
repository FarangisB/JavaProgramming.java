package day35_Encapsulation.Circle;

public class Circle {

    private double radius;
    static double pi;

    static {
        pi=3.14;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<=0){
            System.err.println("Invalid number");
            System.exit(0);
        }
        this.radius = radius;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double calculateArea(){
        return pi*(radius*radius);
    }

    public double calcPerimeter(){
        return 2*pi*radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                ", calculateArea=" + calculateArea()+
                ", calculatePerimeter=" +calcPerimeter()+
                '}';
    }
}
/**
 * Create a class named Circle
 *
 *             privtae variables:
 *                 radius
 *
 *             public variable:
 *                 pi
 *
 *              Encapsulate all the private fields
 *
 *                      1. radius of the circle can not be zero or negative
 *
 *              Add a constructor that can set the raidus of coircle when circle object is created
 *
 *              Methods:
 *                  calcArea()
 *                  calcPerimeter()
 *                  toString()
 * ﻿
 */