package day45_Interface.ShapeTask;

public class Circle extends Shape implements Perimeter{

    private double radius;
    public static final double pi=3.14;

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<0){
            throw new RuntimeException("Invalid value was entered: "+radius);
        }
        this.radius = radius;
    }

    public double area() {
        return radius*radius*pi;
    }

    public double perimeter() {
        return 2*radius*pi;
    }

    public String toString() {
        return "Circle{" +
                super.toString()+
                "radius=" + radius +
                '}';
    }
}
