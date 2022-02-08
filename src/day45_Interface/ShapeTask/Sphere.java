package day45_Interface.ShapeTask;

public class Sphere extends Shape implements Volume{

    private double radius;
    private final double pi = 3.14;

    public Sphere(double radius) {
        super("Sphere");
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
        return 4*pi*radius*radius;
    }
    // 4πr2 -> surface area

    public double volume() {
        return (4*pi*radius*radius*radius)/3;
    }
    // (4πr3)/3 -> volume


    public String toString() {
        return "Sphere{" +
                super.toString()+
                "radius=" + radius +
                ", pi=" + pi +
                '}';
    }
}
